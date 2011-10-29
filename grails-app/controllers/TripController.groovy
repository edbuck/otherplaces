class TripController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']
    def list = {
        if(!params.max) params.max = 10
        if(!params.sort) {
        	params.sort= "date" 
        	params.order = "desc"
        }
        def tripListParams = ["sort":"name","order":"asc"]
        [ tripInstanceList: Trip.list( tripListParams ), paginatedTripInstanceList: Trip.list( params ) ]
    }

    def show = {
    	if(params.id=="random") {
        	def int tripCount = Trip.list(params).size().intValue()
        	def random = new Random()
        	def tripId = random.nextInt(tripCount) + 1
        	println("Random Trip = " + tripId)
    		params.id=tripId
    	}
        	
        def tripInstance = Trip.get( params.id )
        def tripListParams = ["sort":"name","order":"asc"]
        
        if(!tripInstance) {
            flash.message = "Trip not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ tripInstance : tripInstance, tripInstanceList: Trip.list( tripListParams )] }
    }

    def delete = {
        def tripInstance = Trip.get( params.id )
        if(tripInstance) {
            tripInstance.delete()
            flash.message = "Trip ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Trip not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def tripInstance = Trip.get( params.id )

        if(!tripInstance) {
            flash.message = "Trip not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ tripInstance : tripInstance ]
        }
    }

    def update = {
        def tripInstance = Trip.get( params.id )
        if(tripInstance) {
            tripInstance.properties = params
            if(!tripInstance.hasErrors() && tripInstance.save()) {
                flash.message = "Trip ${params.id} updated"
                redirect(action:show,id:tripInstance.id)
            }
            else {
                render(view:'edit',model:[tripInstance:tripInstance])
            }
        }
        else {
            flash.message = "Trip not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def tripInstance = new Trip()
        tripInstance.properties = params
        return ['tripInstance':tripInstance]
    }

    def save = {
        def tripInstance = new Trip(params)
        if(!tripInstance.hasErrors() && tripInstance.save()) {
            flash.message = "Trip ${tripInstance.id} created"
            redirect(action:show,id:tripInstance.id)
        }
        else {
            render(view:'create',model:[tripInstance:tripInstance])
        }
    }
}
