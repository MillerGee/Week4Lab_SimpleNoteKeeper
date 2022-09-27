<%-- 
    Document   : viewnote
    Created on : Sep 27, 2022, 1:32:17 PM
    Author     : Miller Gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${title}</p>
        <p>Contents: ${contents}</p>
        <a href="/WEB-INF/editnote.js">Edit</a>

    </body>
</html>
