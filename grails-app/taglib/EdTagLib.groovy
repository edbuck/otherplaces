class EdTagLib {

	static namespace = "ed"
	
	def highslideThumbnail = { attrs ->
		def picture = attrs.get('picture')
		if (!picture) {
			picture = new Picture()
		}
        StringBuilder sb = new StringBuilder()
		sb.append("<a href=\"${getPictureUrl(picture)}\" class=\"highslide\" onclick=\"return hs.expand(this)\">")
		sb.append("<img src=\"${getPictureThumbnailUrl(picture)}\" title=\"Click to enlarge\" />")
		sb.append("</a>")
		out << sb 
	}
		
	def tripMarkerHtml = { attrs ->
		def trip = attrs.get('trip')
		if (!trip) {
			trip = new Trip()
		}
        StringBuilder sb = new StringBuilder()
        sb.append("<div id=\"googleMapBalloon\">")
        sb.append("<a href=\"${request.contextPath}/trip/show/").append(trip.id).append("\">")
        sb.append("<h2 class=\"breadcrumbs\" style=\"color:").append(trip.rgb).append("\">").append(trip.name).append("</h2></a>")
        sb.append("<B>").append(new java.text.SimpleDateFormat("MMMMM yyyy").format(trip.date)).append("</B>")
        sb.append("<a href=\"${request.contextPath}/trip/show/").append(trip.id).append("\">")
        sb.append("<ul id=\"tripballoon\"><li style=\"background-image:url(${getTripThumbnailUrl(trip,0)});\">")
        sb.append("<IMG width=100 height=100 src=\"${getTripThumbnailUrl(trip,0)}\"/>")
        sb.append("</li></ul>")
        sb.append("</a>")
        sb.append("</div>")
		out << sb 
	}	
	  
	def albumMarkerHtml = { attrs ->
		def album = attrs.get('album')
		if (!album) {
			album = new Album()
		}
		
        StringBuilder sb = new StringBuilder()
        sb.append("<div id=\"googleMapBalloon\">")
        sb.append("<a href=\"${request.contextPath}/album/show/").append(album.id).append("\">")
        sb.append('<h2 class="breadcrumbs">').append(album.location).append("</h2></a>")
        sb.append(album.pictures.size()).append(" photos")
        sb.append("<a href=\"${request.contextPath}/album/show/").append(album.id).append("\">")
        sb.append("<ul id=\"tripballoon\"><li style=\"background-image:url(${getAlbumThumbnailUrl(album,0)});\">")
        sb.append("<IMG width=100 height=100 src=\"${getAlbumThumbnailUrl(album,0)}\"/>")
        sb.append("</li></ul>")
        sb.append("</a>")
        sb.append("</div>")
		out << sb 
	}

	def tripThumbnailHtml = { attrs ->
		def trip = attrs.get('trip')
		if (!trip) {
			trip = new Trip()
		}
		def index = attrs.get('index')
		if (!index) {
			index = 0
		}
		
	    StringBuilder sb = new StringBuilder()
	    sb.append("<IMG src=\"${getTripThumbnailUrl(trip,index)}\"/>")
		out << sb 
	}
	
	def tripThumbnailListItem = { attrs ->
		def trip = attrs.get('trip')
		if (!trip) {
			trip = new Trip()
		}
		def index = attrs.get('index')
		if (!index) {
			index = 0
		}
		
	    StringBuilder sb = new StringBuilder()
	    sb.append("<li style=\"background-position: 50% 50%; background-image:url(${getTripThumbnailUrl(trip,index)});\">")
	    sb.append("<IMG src=\"${getTripThumbnailUrl(trip,index)}\"/>")
	    sb.append("</LI>")
		out << sb 
	}

	def albumThumbnailHtml = { attrs ->
		def album = attrs.get('album')
		if (!album) {
			album = new Album()
		}
		def index = attrs.get('index')
		if (!index) {
			index = 0
		}
		
	    StringBuilder sb = new StringBuilder()
	    sb.append("<IMG src=\"${getAlbumThumbnailUrl(album,index)}\"/>")
		out << sb 
	}
	
	def pictureThumbnail = { attrs ->
		def picture = attrs.get('picture')
		if (!picture) {
			picture = new Picture()
		}
	    StringBuilder sb = new StringBuilder()
		sb.append("<img src=\"${getPictureThumbnailUrl(picture).encodeAsHTML()}\"/>")
		out << sb 
	}

	def albumThumbnail = { attrs ->
		def album = attrs.get('album')
		if (!album) {
			album = new Album()
		}
	    StringBuilder sb = new StringBuilder()
		sb.append("<img width=100 height=100 src=\"${createAlbumThumbnailImage(album,0).encodeAsHTML()}\"/>")
		out << sb 
	}
	
	def latString = { attrs ->
		def double latlong = attrs.get('latlong')
	    StringBuilder sb = new StringBuilder()
		double minutes = latlong % 1
		long integralLat = latlong
		String dir = integralLat > 0 ? "N" : "S" 
		sb.append(Math.abs(integralLat) + "&deg; ")
		minutes = Math.abs(minutes * 60)
		long integralMin = minutes
		sb.append(integralMin + "' ")
		double seconds = minutes % 1
		seconds *= 60
		long integralSec = seconds
		sb.append(integralSec + "\" ")
		sb.append(dir)
		out <<  sb
	}

	def longString = { attrs ->
		def double latlong = attrs.get('latlong')
	    StringBuilder sb = new StringBuilder()
		double minutes = latlong % 1
		long integralLat = latlong
		String dir = integralLat > 0 ? "E" : "W" 
		sb.append(Math.abs(integralLat) + "&deg; ")
		minutes = Math.abs(minutes * 60)
		long integralMin = minutes
		sb.append(integralMin + "' ")
		double seconds = minutes % 1
		seconds *= 60
		long integralSec = seconds
		sb.append(integralSec + "\" ")
		sb.append(dir)
		out <<  sb
	}
	
	def pictureLink = { attrs ->
		def picture = attrs.get('picture')
    	out << picture.url
    }
	
    def redirectMainPage = {
	      response.sendRedirect("${request.contextPath}/trip")
	}

	private def getTripThumbnailUrl(trip, index) {
		def int albumIndex = 0
		def int pictureIndex = 0
		while (index > trip.albums.size() - 1) {
			index = index - trip.albums.size()
			pictureIndex++
		}
		Album album =  (trip.albums as List)[index]
		
		getAlbumThumbnailUrl(album,pictureIndex)
    }

	private def getAlbumThumbnailUrl(album, index) {
		if (index >= album.pictures.size()) {
			index = album.pictures.size() - 1;
		} 
		Picture picture = (album.pictures as List)[index]
		getPictureThumbnailUrl(picture)
    }
	
	private def getPictureUrl(picture) {
    	picture.url + "?imgmax=800"
    }

	private def getPictureThumbnailUrl(picture) {
    	picture.thumbnailUrl
    }
	
}