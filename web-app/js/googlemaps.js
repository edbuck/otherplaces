function createMapMarker(point,html) {
  var marker = new GMarker(point);

  GEvent.addListener(marker, "click", function() {
      marker.openInfoWindowHtml(html);
  });
  return marker;
}

function createColoredMapMarker(point,color,html) {
	var iloc = new GIcon();
	iloc.image = "http://labs.google.com/ridefinder/images/mm_20_" + color + ".png";
	iloc.shadow = "http://labs.google.com/ridefinder/images/mm_20_shadow.png";		
	iloc.iconSize = new GSize(12, 20);
	iloc.shadowSize = new GSize(22, 20);
	iloc.iconAnchor = new GPoint(6, 20);
	var icon = new GIcon(iloc);
	var marker = new GMarker(pt,icon);
	GEvent.addListener(marker, "click", function() {
	      marker.openInfoWindowHtml(html);
	});
	return marker;
}

function createFlagMapMarker(point,html) {
  var baseIcon = new GIcon();
  baseIcon.image = "http://maps.google.com/mapfiles/arrow.png";
  baseIcon.shadow = "http://maps.google.com/mapfiles/arrowshadow.png";		
  baseIcon.iconSize = new GSize(39, 34);
  baseIcon.shadowSize = new GSize(39, 34);
  baseIcon.iconAnchor = new GPoint(10, 34);
  baseIcon.infoWindowAnchor = new GPoint(9, 2);
  baseIcon.infoShadowAnchor = new GPoint(18, 25);
  var icon = new GIcon(baseIcon);
  var marker = new GMarker(point, icon);
  return marker;
}

function createIndexedMapMarker(point,index,html) {
  var baseIcon = new GIcon();
  baseIcon.shadow = "http://www.google.com/mapfiles/shadow50.png";
  baseIcon.iconSize = new GSize(20, 34);
  baseIcon.shadowSize = new GSize(37, 34);
  baseIcon.iconAnchor = new GPoint(9, 34);
  baseIcon.infoWindowAnchor = new GPoint(9, 2);
  baseIcon.infoShadowAnchor = new GPoint(18, 25);
	
  // Create a lettered icon for this point using our icon class
  var letter = String.fromCharCode("A".charCodeAt(0) + index);
  var icon = new GIcon(baseIcon);
  icon.image = "http://www.google.com/mapfiles/marker" + letter + ".png";
  var marker = new GMarker(point, icon);
  GEvent.addListener(marker, "click", function() {
      marker.openInfoWindowHtml(html);
  });
  return marker;
}

function createSmallMap(elementId,latitude,longitude,zoomLevel) {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById(elementId));
	map.addControl(new GSmallZoomControl ());
	p1 = new GLatLng(latitude,longitude)
    map.setCenter(p1, zoomLevel);
    return map;
  }
}

function createLargeMap(elementId,latitude,longitude,zoomLevel) {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById(elementId));
    
    switch(Math.ceil(Math.random() * 3))
    {
    case 1:
        map.setMapType(G_HYBRID_MAP);
        break;
    case 2:
        map.setMapType(G_SATELLITE_MAP);
        break;
    case 3:
    	map.setMapType(G_NORMAL_MAP);
        break;
    default:
        map.setMapType(G_HYBRID_MAP);
    }
    var bottomLeft = new GControlPosition(G_ANCHOR_BOTTOM_LEFT, new GSize(10,10));
    map.addControl(new GSmallMapControl(), bottomLeft);
	//map.addControl(new GScaleControl(), topLeft);
	map.addControl(new GMapTypeControl()); 
   	p1 = new GLatLng(latitude,longitude)
    map.setCenter(p1, zoomLevel);
    return map;
  }
}

function addSmallMapPoint(map,color,geocodeLatitude,geocodeLongitude) {
	pt = new GLatLng(geocodeLatitude,geocodeLongitude)
    map.setCenter(pt);
	var iloc = new GIcon();
	iloc.image = "http://labs.google.com/ridefinder/images/mm_20_" + color + ".png";
	iloc.shadow = "http://labs.google.com/ridefinder/images/mm_20_shadow.png";		
	iloc.iconSize = new GSize(12, 20);
	iloc.shadowSize = new GSize(22, 20);
	iloc.iconAnchor = new GPoint(6, 20);
	mkloc = new GMarker(pt,{icon:iloc, clickable:false});
	map.addOverlay(mkloc);
}

function addFlagMapPoint(map,markerHtml,geocodeLatitude,geocodeLongitude) {
	pt = new GLatLng(geocodeLatitude,geocodeLongitude)
    var mkloc = createFlagMapMarker(pt,markerHtml)
	map.addOverlay(mkloc);
}

function addUnindexedMapPoint(map,markerHtml,geocodeLatitude,geocodeLongitude) {
	pt = new GLatLng(geocodeLatitude,geocodeLongitude)
    var mkloc = createMapMarker(pt,markerHtml)
	map.addOverlay(mkloc);
}

function addColoredMapPoint(map,color,markerHtml,geocodeLatitude,geocodeLongitude) {
	pt = new GLatLng(geocodeLatitude,geocodeLongitude)
    var mkloc = createColoredMapMarker(pt,color,markerHtml)
	map.addOverlay(mkloc);
}

function addIndexedMapPoint(map,index,markerHtml,geocodeLatitude,geocodeLongitude) {
	pt = new GLatLng(geocodeLatitude,geocodeLongitude)
    var mkloc = createIndexedMapMarker(pt,index,markerHtml)
	map.addOverlay(mkloc);
}
