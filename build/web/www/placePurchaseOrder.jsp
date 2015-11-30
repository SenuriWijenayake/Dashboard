
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Place Purchase Order</title>
    </head>
    <body>
        <s:form action="getTotal" method="post" name="total">

            <s:label type="text" value= "Material Requisition Form" style="font-size: 20pt;"></s:label>

            <s:select label="Material Id"
                      list="{'1', '2', '3', '4', '5', '6'}" 
                      name="rawId" 

                      />
            <s:submit type="submit" name="total" value="Create Purchase Order" align="center" action="getTotal"></s:submit>
           
        </s:form> 
    </body>
</html>

