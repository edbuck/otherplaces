class Picture {
	Album album
	String url
	String medImageUrl
	String thumbnailUrl
	String title
	String description
	Date dateTaken
	String model
	String exposure
	String aperture
	static belongsTo = Album
	static optionals = ["description" ]
}
