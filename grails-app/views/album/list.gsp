

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Album List</title>
		<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBT2yXp_ZAY8_ufC3CFXhHIE1NvwkxSDa0ddjCYzkO8e2ju3MJj5OD7KLA"
            type="text/javascript"></script>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" controller="trip" action="list">Trip List</g:link></span>
        </div>
        <div class="body">
            <h1>Album List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
       
                   	        <g:sortableColumn property="dirName" title="Trip" />
                        
                   	        <g:sortableColumn property="dirName" title="Album" />
                        
                   	        <g:sortableColumn property="geocodeAccuracy" title="Geocode Accuracy" />
                        
                   	        <g:sortableColumn property="geocodeLatitude" title="Geocode Latitude" />
                        
                   	        <g:sortableColumn property="geocodeLongitude" title="Geocode Longitude" />
                        	<th>Map</th>
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${albumInstanceList}" status="i" var="albumInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${albumInstance.id}">${fieldValue(bean:albumInstance, field:'id')}</g:link></td>
                        
                            <td><g:link controller="trip" action="show" id="${albumInstance?.trip?.id}">${albumInstance?.trip?.encodeAsHTML()}</g:link></td>
       
                            <td><g:link action="show" id="${albumInstance.id}">${fieldValue(bean:albumInstance, field:'location')}</g:link></td>
                        
                            <td>${fieldValue(bean:albumInstance, field:'geocodeAccuracy')}</td>
                        
                            <td>${fieldValue(bean:albumInstance, field:'geocodeLatitude')}</td>
                        
                            <td>${fieldValue(bean:albumInstance, field:'geocodeLongitude')}</td>

                        	<td>
                        		<div id="map_canvas_${fieldValue(bean:albumInstance, field:'id')}" style="width:363px; height:100px; overflow:hidden">
									<script  type="text/javascript">
										newMap = createSmallMap("map_canvas_${fieldValue(bean:albumInstance, field:'id')}",
												${fieldValue(bean:albumInstance, field:'geocodeLatitude')},
												${fieldValue(bean:albumInstance, field:'geocodeLongitude')},
												2);
										addSmallMapPoint(
					                    		newMap,
					                    		${fieldValue(bean:albumInstance, field:'geocodeLatitude')},
					                    		${fieldValue(bean:albumInstance, field:'geocodeLongitude')});
									</script>
                        		</div>
                        	</td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Album.count()}" />
            </div>
        </div>
    </body>
</html>
