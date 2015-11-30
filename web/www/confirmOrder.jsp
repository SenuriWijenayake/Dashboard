
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Purchase Order</title>
    </head>
    <body>
        
            <h1>Purchase Order</h1>
            <s:iterator value="order">

                <table>
                    <th><tr><td></td><td></td></th>
                    <tbody>
                        <tr>
                            <td><label>Material Id : </label></td>
                            <td><s:property value="productId"></s:property></td>
                            </tr>

                            <tr>
                                <td><label>Supplier Id : </label></td>
                                <td><s:property value="supplierId"></s:property></td>
                            </tr>

                            <tr>
                                <td><label>Quantity : </label></td>
                                <td><s:property value="quantity"></s:property></td>
                            </tr>

                            <tr>
                                <td><label>Unit Price : </label></td>
                                <td><s:property value="unitPrice"></s:property></td>
                            </tr>

                            <tr>
                                <td><label>Total Price : </label></td>
                                <td><s:property value="totalPrice"></s:property></td>
                            </tr>

                            <tr>
                                <td><label>Required Date : </label></td>
                                <td><s:property value="requiredDate"></s:property></td>
                            </tr>
                        </tbody>
                    </table>

            </s:iterator>
            <br/>
            <a href="viewPurchaseOrders.jsp">View Purchase Orders</a>
            
    </body>
</html>

