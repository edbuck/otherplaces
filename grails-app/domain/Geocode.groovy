class Geocode {
	int returnCode
	double latitude
	double longitude
	int accuracy
	
	String toString() {"${this.returnCode},${this.accuracy},${this.latitude},${this.longitude}" }
}