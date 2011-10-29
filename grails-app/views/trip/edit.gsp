

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Edit Trip</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Trip List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Trip</g:link></span>
        </div>
        <div class="body">
            <h1>Edit Trip</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${tripInstance}">
            <div class="errors">
                <g:renderErrors bean="${tripInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${tripInstance?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="albums">Albums:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:tripInstance,field:'albums','errors')}">
                                    
<ul>
<g:each var="a" in="${tripInstance?.albums?}">
    <li><g:link controller="album" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
</ul>
<g:link controller="album" params="['trip.id':tripInstance?.id]" action="create">Add Album</g:link>

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="date">Date:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:tripInstance,field:'date','errors')}">
                                    <g:datePicker name="date" value="${tripInstance?.date}" ></g:datePicker>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="dirName">Dir Name:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:tripInstance,field:'dirName','errors')}">
                                    <input type="text" id="dirName" name="dirName" value="${fieldValue(bean:tripInstance,field:'dirName')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name">Name:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:tripInstance,field:'name','errors')}">
                                    <input type="text" id="name" name="name" value="${fieldValue(bean:tripInstance,field:'name')}"/>
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
