

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>other places > ${tripInstance.name} > ${albumInstance.location}</title>
        <script type="text/javascript"> document.observe("dom:loaded", function() {
	      	newMap = createLargeMap(
	      				"map_canvas",${tripInstance.geocode.latitude},
	      				${tripInstance.geocode.longitude},
	      				${tripInstance.zoomLevel});
		    newMap.setMapType(G_NORMAL_MAP);
			<g:each var="album" status="j" in="${tripInstance.albums.sort([compare:{a,b->a.distance.compareTo(b.distance) } ] as Comparator)}" >
				<g:if test="${album.id != albumInstance.id}">
					addIndexedMapPoint(
	                    		newMap,
	                    		${j},
	                    		'<ed:albumMarkerHtml album="${album}"/>',
	                    		${album.geocode.latitude},
	                    		${album.geocode.longitude});
				</g:if>
			</g:each>
			addFlagMapPoint(
                		newMap,
                		'',
                		${albumInstance.geocode.latitude},
                		${albumInstance.geocode.longitude});
            smallMap = createSmallMap("map_canvas_small",${albumInstance.geocode.latitude},${albumInstance.geocode.longitude},0);
	        addSmallMapPoint(
                		smallMap,
                		"${tripInstance.color}",
                		${albumInstance.geocode.latitude},
                		${albumInstance.geocode.longitude});
					                    	
		});
	    </script>
	    <script type="text/javascript">
			hs.graphicsDir = '${request.contextPath}/highslide/graphics/';
			hs.align = 'center';
			hs.transitions = ['expand', 'crossfade'];
			hs.outlineType = 'rounded-white';
			hs.fadeInOut = true;
			//hs.dimmingOpacity = 0.75;
		
			// Add the controlbar
			hs.addSlideshow({
				//slideshowGroup: 'group1',
				interval: 3000,
				repeat: false,
				useControls: true,
				fixedControls: 'fit',
				overlayOptions: {
					opacity: .75,
					position: 'bottom center',
					hideOnMouseOut: true
				}
			});
		</script>
   </head>
    <body OnUnload="GUnload()">
	    <div class="body">
            <g:if test="${flash.message}">
            	<div class="message">${flash.message}</div>
            </g:if>
			<table  style="border: 0px; margin: 0px 0px 0px 0px;"><TR>
				<TD>
		        	<h2 class="breadcrumbs"> 
		        		<g:link controller="trip" action="show" id="${albumInstance?.trip?.id}">
		        		${tripInstance.name}  
		        		<g:if test="${tripInstance.id > 1}">(<g:formatDate date="${tripInstance.date}" format="yyyy"/>)</g:if>
		        		</g:link>
		        	</h2>
			       	<div id="map_canvas" style="width:500px;height:500px"></div>
	                <table>
						<tr class="prop">
						    <td>
						       	<div id="map_canvas_small" style="width:200px;height:100px"></div>
						    </td>
						    <td style="vertical-align:middle;">
						    	<TABLE>
							    	<TR><TD><b>Trip:</b></td><TD><g:link controller="trip" action="show" id="${albumInstance?.trip?.id}" style="color: ${tripInstance.rgb};">${albumInstance?.trip?.name} (<g:formatDate date="${albumInstance.trip.date}" format="yyyy"/>)</g:link></TD></TR>
							    	<TR><TD><b>Gallery:</b></td><TD>${fieldValue(bean:albumInstance, field:'location')}</TD></TR>
	                            	<TR><TD><B>Latitude:</B></td><TD><ed:latString latlong="${albumInstance.geocode.latitude}"/></TD></TR>
									<TR><TD><B>Longitude:</B></td><TD><ed:longString latlong="${albumInstance.geocode.longitude}"/></TD></TR>
								</TABLE>
						    </td>
						</tr>
	                </table>
				</td>
				<TD>
		        	<h2 class="breadcrumbs">Gallery: 
		        		<B>${albumInstance.location}</B>
		        	</h2>
					<div class="highslide-gallery">
						<g:each var="pictureInstance" status="pictureCounter" in="${albumInstance.pictures}">
							<ed:highslideThumbnail picture="${pictureInstance}"/>
				    		<div class="highslide-caption">
							    <B>${pictureInstance.description ? pictureInstance.description : pictureInstance.title}</B><BR/>
							    Date: <g:formatDate date="${pictureInstance.dateTaken}" format="MM/dd/yyyy"/><BR/> 
							    ${albumInstance.location} - Picture ${pictureCounter + 1} of ${albumInstance.pictures.size()}<BR/>
							    <g:link action="show" controller="trip" id="${tripInstance.id}"><FONT  style="color: ${tripInstance.rgb};">${tripInstance.name}, <g:formatDate date="${tripInstance.date}" format="MMMMM yyyy"/></font></g:link>
							</div>
				    	</g:each>
					</div>
				</TD>
			</tr></table>
        </div>
    </body>
</html>
