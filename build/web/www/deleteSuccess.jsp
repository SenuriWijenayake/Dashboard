<%-- 
    Document   : reqSuccess
    Created on : Nov 13, 2015, 4:36:43 PM
    Author     : Asus - PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cancellation of Requisition</title>
    </head>
    <body>
        <h1>Requisition Successfully Canceled!</h1>
        <br/><br/>
        <a href="materialRequisition.jsp">
            <s:label type="text" value= "Create New Requisition" style="font-size: 15pt;"></s:label> 
        </a>
        <br/><br/>
        <a href="procurementIndex.jsp">
            <s:label type="text" value= "Go to Home" style="font-size: 15pt;"></s:label> 
        </a>
    </body>
</html>
