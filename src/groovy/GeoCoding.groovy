class GeoCoding {
	static Geocode getGeocode(String location) {
 		def url_string = "http://maps.google.com/maps/geo?q=" +
         		URLEncoder.encode("${location}","UTF-8") +
         		"&output=csv"	
         
        	def results = new URL(url_string).text
        	def geoCodeArray = results.split(",")
        	def loopCounter = 0

  		while ( Integer.parseInt(geoCodeArray[0]) == 620 && loopCounter++ < 20) {
  	        println "Gecode error 620 - retrying " + loopCounter
  	        results = new URL(url_string).text
  	        geoCodeArray = results.split(",")
		}

  		def geocode = new Geocode()
  		geocode.returnCode = Integer.parseInt(geoCodeArray[0])

        	geocode.accuracy = Integer.parseInt(geoCodeArray[1])
  		geocode.latitude = Double.parseDouble(geoCodeArray[2])
  		geocode.longitude = Double.parseDouble(geoCodeArray[3])
       	 	println "Geocode ${location}: " + geocode
        	geocode.save()
  		return geocode
 	}
	
	static String getGoogleMapsKey (String requestUrl) {
		for (googleMapsKey in googleMapsKeys) {
			if (requestUrl.startsWith(googleMapsKey.key)) return googleMapsKey.value;
		}
		return null;
	}
     
	static final googleMapsKeys = 
		["http://otherplaces.morphexchange.com/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBRjvqnPOSbS1cKTSae2fIml6A4L5BRbqY7gh8pdKXegKLPPVLPNHZBnaw",
		 "http://76.118.178.178:8080/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBT4Fk1xku2dD_vXYu8EwKYQPQzPYRQ3z_3AqZax7Kx_1gPc2KOwpYcfng",
		 "http://localhost:8080/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBT2yXp_ZAY8_ufC3CFXhHIE1NvwkxSDa0ddjCYzkO8e2ju3MJj5OD7KLA",
		 "http://egbuck.s43.eatj.com/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBRxzaHSig9vSzJ9bM-RiQlVbTCjJhQ08-o6ByxDaQNJb-jwp9DQdHiqZg"]
}