

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>other places > ${tripInstance.name}</title>
        <script type="text/javascript"> document.observe("dom:loaded", function() {
	      	newMap = createLargeMap(
	      				"map_canvas",${tripInstance.geocode.latitude},
	      				${tripInstance.geocode.longitude},
	      				${tripInstance.zoomLevel}
	      				);
		    newMap.setMapType(G_NORMAL_MAP);
			<g:each var="album" status="j" in="${tripInstance.albums.sort([compare:{a,b->a.distance.compareTo(b.distance) } ] as Comparator)}" }">
				addIndexedMapPoint(
                    		newMap,
                    		${j},
                    		'<ed:albumMarkerHtml album="${album}"/>',
                    		${album.geocode.latitude},
                    		${album.geocode.longitude});
			</g:each>
			smallMap = createSmallMap("map_canvas_small",${tripInstance.geocode.latitude},${tripInstance.geocode.longitude},0);
	        addSmallMapPoint(
                		smallMap,
                		"${tripInstance.color}",
                		${tripInstance.geocode.latitude},
                		${tripInstance.geocode.longitude});
                		
		});
	    </script>
	</head>
    <body>
        <div class="body">
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <table style="border: 0px; margin: 0px 0px 0px 0px;">
            	<tr>
		         <td width=50%>
		        	<h2 class="breadcrumbs"><B>${tripInstance.name} <g:if test="${tripInstance.id > 1}">(<g:formatDate date="${tripInstance.date}" format="yyyy"/>)</g:if></B></h2>
					<div style="padding:3px 0px;">${tripInstance.description}</div>
				    <div id="map_canvas" style="width:500px;height:400px"></div>
	                <table>
						<tr>
						    <td>
						       	<div id="map_canvas_small" style="width:200px;height:100px"></div>
						    </td>
						    <td style="vertical-align:middle;">
						    	<TABLE>
							    	<TR><TD><b>Trip:</b></td><TD><g:link controller="trip" action="show" id="${tripInstance.id}" style="color: ${tripInstance.rgb};">${tripInstance.name}</g:link></TD></TR>
							    	<TR><TD><b>Date:</b></td><TD><g:formatDate date="${tripInstance.date}" format="MMMMM yyyy"/></TD></TR>
	                            	<TR><TD><B>Latitude:</B></td><TD><ed:latString latlong="${tripInstance.geocode.latitude}"/></TD></TR>
									<TR><TD><B>Longitude:</B></td><TD><ed:longString latlong="${tripInstance.geocode.longitude}"/></TD></TR>
								</TABLE>
						    </td>
						</tr>
	                </table>
		         </td>
            	<td  width=50%>
		        	<h2 class="breadcrumbs"><B>Galleries</B></h2>
		            <div class="triplist">
		                <table>
		                    <thead>
		                        <tr>
		                   	        <g:sortableColumn property="id" title="Map" />
		                   	        <th></th>
		                   	        <g:sortableColumn property="dirName" title="Gallery Name" />
		                        </tr>
		                    </thead>
		                    <tbody>
		                    <g:each in="${tripInstance.albums.sort([compare:{a,b->a.distance.compareTo(b.distance) } ] as Comparator)}" status="i" var="albumInstance">
		                        <tr class="even">
		                            <td >
		                            	<img src="http://www.google.com/mapfiles/marker${(char)(65 + i)}.png">
		                            </td>
									<td nowrap nobreak style="vertical-align:middle;" id="terse">
		                            	<g:link action="show" controller="album" id="${albumInstance.id}">
			                            	<ul id="albumthumbs">
			                            		<li style="background-image: url(${(albumInstance.pictures as List)[0].medImageUrl}); width: 200px; height: 100px;"></li>
			                            	</ul>
		                            	</g:link>
		                            </td>
		                            <td>
		                            	<h2 class="breadcrumbs">
		                            	<g:link action="show" controller="album" id="${albumInstance.id}">
		                            		${fieldValue(bean:albumInstance, field:'location')}
										</g:link></h2>
		                            	${albumInstance.pictures.size()} Photos<BR>
		                            </td>
		                         </tr>
		                    </g:each>
		                    </tbody>
		                </table>
		            </div>
		         </td>
	      	</tr>
	      	</table>
        </div>
    </body>
</html>
