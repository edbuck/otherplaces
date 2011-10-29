<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
		<meta name="verify-v1" content="bUv0P+pV9Dd9u2qUKmZVFChIkkZDHIjf6LN5m5Xb7dU=" />
        <title>other places</title>
		<script type="text/javascript"> document.observe("dom:loaded", function() {
	      	newMap = createLargeMap("map_canvas",25,148,2);
            <g:each in="${tripInstanceList}" status="i" var="tripInstance">
					addUnindexedMapPoint(
	                    		newMap,
	                    		'<ed:tripMarkerHtml trip="${tripInstance}"/>',
	                    		${tripInstance.geocode.latitude},
	                    		${tripInstance.geocode.longitude});
			</g:each>
		  var thumbArray = document.getElementsByName('tripthumb');
		  for (i=0; i<thumbArray.length; i++) {
			  thumbArray[i].style.backgroundImage = 'url(' + thumbArray[i].getElementsByTagName('img')[0].src + ')';
		  }
			
		});
	    </script>
    </head>
    <body>
		<div class="body">
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
           	<div id="map_canvas" style="overflow: hidden; width: 1000px; height: 440px; position: relative;">
           	</div>
            <div class="paginateButtons">
                <g:paginate total="${Trip.count()}" />
            </div>
            <div class="triplist">
                <table width="100%">
                    <thead>
                        <tr>
                   	        <g:sortableColumn property="date" title="Sort by: Date" />
                   	        <th></th>
                   	        <g:sortableColumn property="name" title="Sort by: Name" />
                   	        <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${paginatedTripInstanceList}" status="i" var="tripInstance">
                        <tr class="even">
                        	<td width=80>
								<g:formatDate date="${tripInstance.date}" format="MMM yyyy"/>
                        	</td>
                            <td>
								<g:link action="show" id="${tripInstance.id}">
								<ul id="tripgallery">
									<g:each in="[0, 1, 2, 3]" var="index">
										<ed:tripThumbnailListItem trip="${tripInstance}" index="${index}"/>
									</g:each>                
								</ul>
								</g:link>                         
							</td>
                            <td>
                        		<h2>
                           		<g:link action="show" id="${tripInstance.id}"><FONT  style="color:${tripInstance.rgb}">
                        		${fieldValue(bean:tripInstance, field:'name')}
                           		</FONT></g:link>                         
                        		</h2>
								<BR/>
								${fieldValue(bean:tripInstance, field:'description')}
								<BR/><BR/>
								(${tripInstance.albums.size()} photo album<g:if test="${tripInstance.albums.size() > 1}">s</g:if>)
                            </td>
                        	<td width="200">
                        		<div id="map_canvas_${fieldValue(bean:tripInstance, field:'id')}" style="width:200px; height:200px; overflow:hidden">
									<script  type="text/javascript">document.observe("dom:loaded", function() {
											newMap = createSmallMap("map_canvas_${fieldValue(bean:tripInstance, field:'id')}",${tripInstance.geocode.latitude},${tripInstance.geocode.longitude},0);
					                    	addSmallMapPoint(
						                    		newMap,
						                    		"${tripInstance.color}",
						                    		${tripInstance.geocode.latitude},
						                    		${tripInstance.geocode.longitude});
									});
									</script>
                        		</div>
                        	</td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Trip.count()}" />
            </div>
        </div>
    </body>
</html>
