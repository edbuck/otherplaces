<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title><g:layoutTitle default="Ed's Travel Photos" /></title>
        <link rel="stylesheet" type="text/css" href="${createLinkTo(dir: 'css', file: 'main.css')}" />
        <link rel="stylesheet" type="text/css" href="${createLinkTo(dir: 'css', file: 'ed.css')}" />
        <link rel="stylesheet" type="text/css" href="${createLinkTo(dir: 'highslide', file: 'highslide.css')}" />
        <g:javascript library="prototype/prototype" />
        <g:javascript library="prototype/effects" />
        <g:javascript library="application" />				
        <g:javascript library="highslide-full" />
        <g:javascript library="googlemaps" />
        <%
            final googleMapsKeys = 
			["http://otherplaces.morphexchange.com/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBRjvqnPOSbS1cKTSae2fIml6A4L5BRbqY7gh8pdKXegKLPPVLPNHZBnaw",
			 "http://76.118.178.178:8080/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBT4Fk1xku2dD_vXYu8EwKYQPQzPYRQ3z_3AqZax7Kx_1gPc2KOwpYcfng",
			 "http://www.egbuck.com/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBSOavzOBDk74to72YEciamohyHJlBTqLnCEW4TlGPlwAQViim840O-gIA",
			 "http://localhost:8080/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBT2yXp_ZAY8_ufC3CFXhHIE1NvwkxSDa0ddjCYzkO8e2ju3MJj5OD7KLA",
			 "http://egbuck.s43.eatj.com/":"ABQIAAAAkMHpi9Spsdb8OfAeiHiKOBRxzaHSig9vSzJ9bM-RiQlVbTCjJhQ08-o6ByxDaQNJb-jwp9DQdHiqZg"]

	    if (googleMapsKeyValue == null)
		for (googleMapsKey in googleMapsKeys) {
			if (request.getRequestURL().toString().startsWith(googleMapsKey.key)) 
				googleMapsKeyValue = googleMapsKey.value;
		}
	
	%>
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key= ${googleMapsKeyValue}" type="text/javascript"></script>
        <g:layoutHead />
    </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}" alt="Spinner" />
        </div>	
        <div id="outer-wrapper">
	        <div class="logo">
        		<img id="banner" src="${createLinkTo(dir:'images',file:'lonelyheader.jpg')}" alt="other places" />
	        </div>
	        <ul id="dropdownnav">
				<g:if test="${tripInstance}">
				<li>
					<g:link action="show" controller="trip" id="${tripInstance.id}">
						<img id="albums" src="${createLinkTo(dir:'images',file:'here.png')}" alt="here" />
					</g:link>
					<ul class="singleCol"><li><ul class="innerCol">
						<li>
							<div >
							<g:link action="show" controller="trip" id="${tripInstance.id}">
								${tripInstance.name} <g:if test="${tripInstance.id > 1}">(<g:formatDate date="${tripInstance.date}" format="yyyy"/>)</g:if> - All Galleries 
							</g:link>
							</div>
						</li>
						<li class="separator">
							<HR noshade size="2" style="color: #C3D9FF;">
						</li>
						<g:each in="${tripInstance.albums.sort([compare:{a,b->a.distance.compareTo(b.distance) } ] as Comparator)}" status="i" var="albumSelectorInstance">
							<li>
							<g:link action="show" controller="album" id="${albumSelectorInstance.id}">
							${(char)(65 + i)}. ${albumSelectorInstance.location}
							</g:link>
							</li>
						</g:each>
					</ul></li></ul>
				</li>
				</g:if>
				<g:if test="${!tripInstance}">
					<li>
					<center>
					<g:link action="show" controller="trip" id="1">
						<img id="albums" src="${createLinkTo(dir:'images',file:'home.png')}" alt="home" />
					</g:link>
					</center>
					</li>
				</g:if>
				<li>
					<center>
					<g:link controller="trip">
						<img id="home" src="${createLinkTo(dir:'images',file:'op.png')}" alt="other places" />
					</g:link>
					</center>
					<ul class="doubleCol">
						<li>
							<ul class="innerCol">
							<g:set var="tripCounter" value="${0}" />
							<g:if test="${tripInstance}">
								<g:set var="tripCounter" value="${tripCounter + 1}" />
								<li><g:link controller="trip">WORLD MAP</g:link></li>
							</g:if>
							<g:each in="${tripInstanceList}" status="tripSelectorStatus" var="tripSelectorInstance">
								<g:if test="${!tripInstance || tripInstance?.id != tripSelectorInstance.id}">
									<g:set var="tripCounter" value="${tripCounter + 1}" />
									<li><g:link action="show" controller="trip" id="${tripSelectorInstance.id}">
									${tripSelectorInstance.name} <g:if test="${tripSelectorInstance.id > 1}">(<g:formatDate date="${tripSelectorInstance.date}" format="yyyy"/>)</g:if>
									</g:link></li>
								</g:if>
								<g:if test="${(tripCounter)%17 == 0 && tripCounter>0}">
							</ul>
						</li>
						<li>
							<ul class="innerCol">	
								</g:if>
							</g:each>
							</li>
							</ul>
						</li>
					</ul>
				</li>
				<li>
					<center>
					<g:link action="show" controller="picture" id="random">
						<img id="random" src="${createLinkTo(dir:'images',file:'random.png')}" alt="random" />
					</g:link>
					</center>
					<ul class="singleCol"><li><ul class="innerCol">
						<li>
							<g:link action="show" controller="picture" id="random">
								Photo
							</g:link>
						</li>
						<li>
							<g:link action="show" controller="album" id="random">
								Photo Gallery
							</g:link>
						</li>
						<li>
							<g:link action="show" controller="trip" id="random">
								Trip
							</g:link>
						</li>
					</ul></li></ul>
				</li>
			</ul>
		   	<g:layoutBody />		
			<!--
	        <div class="logo">
        		<img id="banner" src="${createLinkTo(dir:'images',file:'lonelyfooter.jpg')}" alt="other places" />
	        </div>
	        -->
        </div> 
        <script type="text/javascript">
	var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
	document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
	</script>
	<script type="text/javascript">
	try {
	var pageTracker = _gat._getTracker("UA-9358343-1");
	pageTracker._trackPageview();
} catch(err) {}</script>
    </body>	
</html>