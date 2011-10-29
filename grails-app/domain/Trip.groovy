import javax.jdo.annotations.*
class Trip {
	String name
	String location
	String color
	String rgb
	int zoomLevel
	Geocode geocode
	Date date
	String description
	String[] albumUrls
	static hasMany = [albums:Album]
  	String toString() {"${this.name} ${this.date}" }
	static optionals = ["albums"]
}
