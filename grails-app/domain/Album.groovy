class Album {
	Trip trip
	String title
	String location
	String description
	Geocode geocode
	double distance
	static optionals = ["description" ]
	static hasMany = [pictures:Picture]
	String toString() {"${this.dirName}" }
	String thumbnailImage() {"${pictures[0].filename}"} 
	String url() {"/${request.contextPath}/album/show/" + id}
}
