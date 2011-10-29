

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Edit Album</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Album List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Album</g:link></span>
        </div>
        <div class="body">
            <h1>Edit Album</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${albumInstance}">
            <div class="errors">
                <g:renderErrors bean="${albumInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${albumInstance?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="description">Description:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'description','errors')}">
                                    <input type="text" id="description" name="description" value="${fieldValue(bean:albumInstance,field:'description')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="dirName">Dir Name:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'dirName','errors')}">
                                    <input type="text" id="dirName" name="dirName" value="${fieldValue(bean:albumInstance,field:'dirName')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="geocodeAccuracy">Geocode Accuracy:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'geocodeAccuracy','errors')}">
                                    <input type="text" id="geocodeAccuracy" name="geocodeAccuracy" value="${fieldValue(bean:albumInstance,field:'geocodeAccuracy')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="geocodeLatitude">Geocode Latitude:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'geocodeLatitude','errors')}">
                                    <input type="text" id="geocodeLatitude" name="geocodeLatitude" value="${fieldValue(bean:albumInstance,field:'geocodeLatitude')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="geocodeLongitude">Geocode Longitude:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'geocodeLongitude','errors')}">
                                    <input type="text" id="geocodeLongitude" name="geocodeLongitude" value="${fieldValue(bean:albumInstance,field:'geocodeLongitude')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="location">Location:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'location','errors')}">
                                    <input type="text" id="location" name="location" value="${fieldValue(bean:albumInstance,field:'location')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="pictures">Pictures:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'pictures','errors')}">
                                    
<ul>
<g:each var="p" in="${albumInstance?.pictures?}">
    <li><g:link controller="picture" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
</ul>
<g:link controller="picture" params="['album.id':albumInstance?.id]" action="create">Add Picture</g:link>

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="trip">Trip:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:albumInstance,field:'trip','errors')}">
                                    <g:select optionKey="id" from="${Trip.list()}" name="trip.id" value="${albumInstance?.trip?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="Update" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
