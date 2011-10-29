

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>other places > ${pictureInstance.album.location} > ${pictureInstance.title}</title>
        <script type="text/javascript"> document.observe("dom:loaded", function() {
			smallMap = createSmallMap("map_canvas_small",${pictureInstance.album.geocode.latitude},${pictureInstance.album.geocode.longitude},0);
	        addSmallMapPoint(
                		smallMap,
                		"${pictureInstance.album.trip.color}",
                		${pictureInstance.album.geocode.latitude},
                		${pictureInstance.album.geocode.longitude});
		});
	    </script>        
    </head>
    <body>
        <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
        </g:if>
        <div align="center">
            <div >
            	<BR/>
	        	<table style="border-width: 1px; border-color: #000000; border-style: solid;width: 10%; margin: 10px;">
	        		<tr><td>
                			<img id="${pictureInstance.title}" src="${pictureInstance.url}?imgmax=800" style="border-width: 15px; border-color: #FFFFFF; border-style: solid;"/><BR/>
                		</td></tr>
                	</table>
			<B>${pictureInstance.title}</B> 
			    <!--
            	<TABLE style="border:0px;"><TR><TD width="50%">
	        	<h2>View Trip: <B>
	        		<g:link action="show" controller="trip" id="${pictureInstance.album.trip.id}">
	        		<FONT  style="color: ${pictureInstance.album.trip.rgb};">${pictureInstance.album.trip.name}, <g:formatDate date="${pictureInstance.album.trip.date}" format="MMM yyyy"/></font>
	        		</g:link>
	        		</H2></B>
	        	</TD><TD  width="50%">
	        		<H2>View Album:<B>
	        		<g:link action="show" controller="album" id="${pictureInstance.album.id}">
	        		<FONT  style="color: ${pictureInstance.album.trip.rgb};">${pictureInstance.album.location}</font>
	        		</g:link>
	        		</h2></B>
	        	</td></tr></table>
	        	-->
            	<TABLE style="border:0px;"><TR>
            		<TD width="50%">
	                <table>
						<tr class="prop">
						    <td>
						       	<div id="map_canvas_small" style="width:200px;height:100px"></div>
						    </td>
						    <td style="vertical-align:middle;">
						    	<TABLE>
							    	<TR>
							    		<TD><b>View Trip:</b></td>
							    		<TD>
									    	<g:link controller="trip" action="show" id="${pictureInstance.album.trip.id}">
										    	<FONT  style="color: ${pictureInstance.album.trip.rgb};">
										    		${pictureInstance.album.trip.name}, <g:formatDate date="${pictureInstance.album.trip.date}" format="MMM yyyy"/>
										    	</font>
								    		</g:link>
							    		</TD>
							    	</TR>
							    	<TR>
							    		<TD><b>View Gallery:</b></td>
							    		<TD>
									    	<g:link controller="album" action="show" id="${pictureInstance.album.id}">
										    	<FONT  style="color: ${pictureInstance.album.trip.rgb};">
									    			${pictureInstance.album.location}
										    	</font>
								    		</g:link>
							    		</TD>
							    	</TR>
	                            	<TR><TD><B>Latitude:</B></td><TD><ed:latString latlong="${pictureInstance.album.trip.geocode.latitude}"/></TD></TR>
									<TR><TD><B>Longitude:</B></td><TD><ed:longString latlong="${pictureInstance.album.trip.geocode.longitude}"/></TD></TR>
								</TABLE>
						    </td>
						</tr>
	                </table>
	            	</td>
					<td width="50%">
					<TABLE><TR><TD>
			    	<TABLE>
				    	<TR><TD><b>Date:</b></td><TD><g:formatDate date="${pictureInstance.dateTaken}" format="MM/dd/yyyy hh:MM aa, z"/></TD></TR>
				    	<TR><TD><b>Camera:</b></td><TD>${pictureInstance.model}</TD></TR>
                    	<TR><TD><B>Exposure:</B></td><TD>${pictureInstance.exposure}</TD></TR>
						<TR><TD><B>Aperture:</B></td><TD>${pictureInstance.aperture}</TD></TR>
					</TABLE>
					</td></tr></table>
	        		</td>
	        	</tr></table>
            </div>
        </div>
    </body>
</html>
