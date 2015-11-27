<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Requisition</title>
    </head>
    <body>
        <s:form action="deleteRequisition" method="post">

            <s:label type="text" value= "Cancel Material Requisition" style="font-size: 20pt;"></s:label>

            <s:textfield type="text" name="requisitionId" label="Requisition Id" size="20"></s:textfield>
            
            <s:submit name="submit" label="Cancel Requisition" align="center" action="deleteRequisition"></s:submit>
        </s:form>  
    </body>
</html>
