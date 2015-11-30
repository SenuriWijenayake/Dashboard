<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to AZD Procurement!</title>
    </head>
    <body>
        <s:label type="text" value= "Procurement Home" style="font-size: 20pt;"></s:label>
        <br/><br/><br><br>
        <a href="materialRequisition.jsp">
            <s:label type="text" value= "Create New Procurement" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
        <a href="viewExistingRequisitions.jsp">
            <s:label type="text" value= "View Existing Procurements" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
        <a href="updateReq.jsp">
            <s:label type="text" value= "Update Procurement Details" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
        <a href="deleteRequisition.jsp">
            <s:label type="text" value= "Delete Requisitions" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
        <a href="placePurchaseOrder.jsp">
            <s:label type="text" value= "Place Purchase Order" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
        <a href="viewPurchaseOrders.jsp">
            <s:label type="text" value= "View Purchase Orders" style="font-size: 15pt;"></s:label> 
        </a> <br><br><br>
    </body>
</html>
