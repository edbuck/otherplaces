class PictureController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ pictureInstanceList: Picture.list( params ) ]
    }

    def show = {
    	if(params.id=="random") {
        	def int pictureCount = Picture.list(params).size().intValue()
        	def random = new Random()
        	def pictureId = random.nextInt(pictureCount) + 1
        	println("Random Picture = " + pictureId)
    		params.id=pictureId
    	}
        	
        def pictureInstance = Picture.get( params.id )
        def tripListParams = ["sort":"name","order":"asc"]

        if(!pictureInstance) {
            flash.message = "Picture not found with id ${params.id}"
            redirect(action:list)
        }
        
        else { return [ tripInstanceList: Trip.list( tripListParams ), pictureInstance : pictureInstance ] }
    }

    def delete = {
        def pictureInstance = Picture.get( params.id )
        if(pictureInstance) {
            pictureInstance.delete()
            flash.message = "Picture ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Picture not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def pictureInstance = Picture.get( params.id )

        if(!pictureInstance) {
            flash.message = "Picture not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ pictureInstance : pictureInstance ]
        }
    }

    def update = {
        def pictureInstance = Picture.get( params.id )
        if(pictureInstance) {
            pictureInstance.properties = params
            if(!pictureInstance.hasErrors() && pictureInstance.save()) {
                flash.message = "Picture ${params.id} updated"
                redirect(action:show,id:pictureInstance.id)
            }
            else {
                render(view:'edit',model:[pictureInstance:pictureInstance])
            }
        }
        else {
            flash.message = "Picture not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def pictureInstance = new Picture()
        pictureInstance.properties = params
        return ['pictureInstance':pictureInstance]
    }

    def save = {
        def pictureInstance = new Picture(params)
        if(!pictureInstance.hasErrors() && pictureInstance.save()) {
            flash.message = "Picture ${pictureInstance.id} created"
            redirect(action:show,id:pictureInstance.id)
        }
        else {
            render(view:'create',model:[pictureInstance:pictureInstance])
        }
    }
}
