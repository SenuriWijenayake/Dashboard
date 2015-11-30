<%-- 
    Document   : materialRequisition
    Created on : Nov 13, 2015, 2:37:15 PM
    Author     : Asus - PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Material Requisition Form</title>
    </head>
    <body>
       <s:form action="newRequisition" method="post" name="requisition">
           
           <s:label type="text" value= "Material Requisition Form" style="font-size: 20pt;"></s:label>
		
                <s:select label="Material Id"
		list="{'1', '2', '3', '4', '5', '6'}" 
		name="materialId" 
		
                />
                <s:select label="Material Name"
		list="{'Engine Block', 'ECU', 'Engine Mounts', 'Engine Heat Sensors', 'Engine Fuses', 'Thermo Valves'}" 
		name="materialName" 
		
                />
                <s:textfield type="text" name="quantity" label="Quantity" size="20"></s:textfield>
                <s:textfield type="text" name="requiredDate" label="Required Date" size="20"></s:textfield>
                <s:select label="Production Line" 
                          headerKey="-1" headerValue="Production line"
                          
		list="{'Engine Block', 'Transmission', 'ECU Programming', 'Tuning', 'Dynamometer'}" 
		name="productionLine" 
		value="5" 
                />
                <s:textfield type="text" name="authorizedBy" label="Authorized Person" size="20"></s:textfield>
                
		<s:submit type="submit"  name="submit" label="Submit Requisition" align="center" action="newRequisition"></s:submit>
       </s:form> 
    </body>
</html>

