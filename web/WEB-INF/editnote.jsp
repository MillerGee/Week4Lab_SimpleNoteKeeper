<%-- 
    Document   : editnote
    Created on : Sep 27, 2022, 1:32:30 PM
    Author     : Miller Gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form method="post" action="note">
            Title: ${title}
            Contents: ${contents}
        </form>
    </body>
</html>
