

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Picture List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Picture</g:link></span>
        </div>
        <div class="body">
            <h1>Picture List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <th>Album</th>
                   	    
                   	        <g:sortableColumn property="description" title="Description" />
                        
                   	        <g:sortableColumn property="filename" title="Filename" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${pictureInstanceList}" status="i" var="pictureInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${pictureInstance.id}">${fieldValue(bean:pictureInstance, field:'id')}</g:link></td>
                        
                            <td>${fieldValue(bean:pictureInstance, field:'album')}</td>
                        
                            <td>${fieldValue(bean:pictureInstance, field:'description')}</td>
                        
                            <td>${fieldValue(bean:pictureInstance, field:'filename')}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Picture.count()}" />
            </div>
        </div>
    </body>
</html>
