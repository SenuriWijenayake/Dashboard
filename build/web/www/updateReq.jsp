<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Requisition</title>
    </head>
    <body>
        <s:form action="updateRequisition" method="post">

            <s:label type="text" value= "Update Material Quantity" style="font-size: 20pt;"></s:label>

            <s:textfield type="text" name="requisitionId" label="Requisition Id" size="20"></s:textfield>
            <s:textfield type="text" name="quantity" label="Quantity" size="20"></s:textfield>
            
            <s:submit name="submit" label="Update Requisition" align="center" action="updateRequisition"></s:submit>
        </s:form>  
    </body>
</html>
