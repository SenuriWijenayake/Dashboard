<%-- 
    Document   : viewExistingRequisitions
    Created on : Nov 27, 2015, 6:30:48 AM
    Author     : Asus - PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Existing Requisitions</title>
    </head>
    <body>
        <s:label type="text" value= "Material Requisitions" style="font-size: 20pt;"></s:label><br/><br/>
            <table cellpadding="5" border=1>

                <tr valign="bottom">
                    <th>Requisition Id</th>
                    <th>Material Id</th>
                    <th>Material Name</th>
                    <th>Quantity</th>
                    <th>Required Date</th>
                    <th>Authorized By</th>
                    <th></th>
                </tr>

            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="req" items="${existingReqs}">
                <tr valign="top">
                    <td><p>${req.requisitionId}</td>
                    <td><p>${req.materialId}</td>
                    <td><p>${req.materialName}</td>
                    <td><p>${req.quantity}</td>
                    <td><p>${req.requiredDate}</td>
                    <td><p>${req.authorizedBy}</td>
                    <td>Update</td>
                </tr>
            </c:forEach>

        </table>


    </body>
</html>
