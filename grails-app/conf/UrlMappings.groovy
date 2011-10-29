class UrlMappings {
    static mappings = {
        "/" {
           controller = "trip"
           action = "list"
    	}
    
      "/$controller/$action?/$id?"{
	      constraints {
			 // apply constraints here
		  }
	  }
	  "500"(view:'/error')
	}
}
