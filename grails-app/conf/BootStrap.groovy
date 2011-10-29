class BootStrap {
	def init = { servletContext ->
		def i = 0
     	Trips.trips.each{ trip ->
     		trip.rgb = (i == 0) ? "rgb(0, 133, 202)" : (i == 1) ? "rgb(218, 107, 0)" : (i == 2) ? "rgb(195, 47, 19)" : (i == 3) ? "rgb(53, 122, 29)" : "rgb(123, 71, 120)"
       		trip.color = (i == 0) ? "blue" : (i == 1) ? "orange" : (i == 2) ? "red" : (i == 3) ? "green" : "purple"
     		(i >= 4) ? i = 0 : i++
     		trip.location = (trip.location ? trip.location : trip.name)
		    trip.zoomLevel = (trip.zoomLevel ? trip.zoomLevel : 5)
     		trip.description = (trip.description ? trip.description : "")
     		trip.geocode = GeoCoding.getGeocode(trip.location)
     		trip.save()

     		trip.albumUrls.each { albumLocation ->
     			def feed = new XmlSlurper().parse(new URL(albumLocation + "?thumbsize=144c,288u").openStream())
     				.declareNamespace(
     						openSearch: 'http://a9.com/-/spec/opensearchrss/1.0/',
 							exif: 'http://schemas.google.com/photos/exif/2007',
 							geo: 'http://www.w3.org/2003/01/geo/wgs84_pos#',
 							gml: 'http://www.opengis.net/gml',
 							georss: 'http://www.georss.org/georss',
 							photo: 'http://www.pheed.com/pheed/',
 							media: 'http://search.yahoo.com/mrss/',
 							batch: 'http://schemas.google.com/gdata/batch',
 							gphoto: 'http://schemas.google.com/photos/2007')
     			//println ("feed = " + feed)
	     		def album = new Album()
	     		album.trip = trip
	     		album.title = feed.title
	     		album.location = album.title.replace("_"," ").replace(",",", ")
     			println("feed.location = " + feed.location)
     			//album.location = "Þingvellir"
     			//println("Þingvellir = " + album.location)
	     		album.description = album.title
     			def String latLong = feed.'georss:where'.'gml:Point'.'gml:pos'.toString()
	     		if (latLong.length() > 3) {
	     			println("latLong = " + latLong)
	     			def latLongArray = latLong.split(" ")
	     			album.geocode = new Geocode(
	     					returnCode:200, 
	     					latitude:Double.parseDouble(latLongArray[0]), 
	     					longitude:Double.parseDouble(latLongArray[1]), 
	     					accuracy:5).save()
	     		} else {
	     			album.geocode = GeoCoding.getGeocode(album.location)
	     		}
	     		album.distance = Math.sqrt((Math.abs(album.geocode.latitude)*Math.abs(album.geocode.latitude) + Math.abs(album.geocode.longitude)*Math.abs(album.geocode.longitude)))  
	     		album.save()
     			println("album.location = " + album.location) 
     			feed.entry.each { photo ->
		     		def picture = new Picture()
		     		picture.album = album
		     		picture.url = photo.content.@src
		     		picture.title = photo.title
	     			//println("picture.url = " + picture.url) 
		     		picture.thumbnailUrl = photo.'media:group'.'media:thumbnail'.find{ it.@height =~ '144' }.@url
	     			//println("picture.thumbnailUrl = " + picture.thumbnailUrl) 
		     		picture.medImageUrl = photo.'media:group'.'media:thumbnail'.find{ it.@width =~ '288' || it.@height =~ '288' }.@url
	     			//println("picture.medImageUrl = " + picture.medImageUrl) 
		     		picture.title = photo.title
		     		picture.description = photo.summary
		     		picture.dateTaken = photo.'exif:tags'.'exif:time'.toString().length() > 0 ? new Date(Long.parseLong(photo.'exif:tags'.'exif:time'.toString())) : trip.date
		     		println("picture.dateTaken = " + picture.dateTaken) 
		     		def String exposureString = photo.'exif:tags'.'exif:exposure'.toString()
		     		if (exposureString.length() > 0) {
		     			def double exposureDouble = Double.parseDouble(exposureString)
		     			if (exposureDouble < 1) {
		     				def int exposureInt = Math.round(1/exposureDouble) 
		     				picture.exposure = "1/" + exposureInt + " sec"
		     			} else {
		     				def int exposureInt = exposureDouble
		     				picture.exposure = exposureInt  + " sec"
		     			}
	     			} else {
	     				picture.exposure  = exposureString
	     			}
		     		println("photo.'exif:tags'.'exif.exposure' = " + picture.exposure) 
		     		picture.aperture = photo.'exif:tags'.'exif:fstop'
		     		picture.model = photo.'exif:tags'.'exif:model'
		     		if (!picture.model.contains(photo.'exif:tags'.'exif:make'.toString())) {
		     			picture.model = photo.'exif:tags'.'exif:make'.toString() + " " + photo.'exif:tags'.'exif:model'.toString()
		     		}
		     		println("picture.model = " + picture.model) 
		     		picture.save() 
		     	}
     		}
    	}
     }
     def destroy = {
     }

} 