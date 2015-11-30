
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

            <label style="font-size: 20pt;">Place Purchase Order</label>
            <br/><br/>
                <table cellpadding="5" border=1>

                    <tr valign="bottom">
                        <th>Material Id</th>
                        <th>Material Name</th>

                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Engine Block</td>

                    </tr>
                    <tr>
                        <td>2</td>
                        <td>ECU</td>

                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Engine Mounts</td>

                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Engine Heat Sensors</td>

                    </tr>
                    <tr>
                        <td>5</td>
                        <td>Engine Fuses</td>

                    </tr>
                    <tr>
                        <td>6</td>
                        <td>Thermo Valves</td>

                    </tr>

                </table>
            <br/><br/>
            <s:select label="Select Material Id"
                      list="{'1', '2', '3', '4', '5', '6'}" 
                      name="rawId" 

                      />
            <br/><br/>
            <s:submit type="submit" name="total" value="Create Purchase Order" align="left" action="getTotal"></s:submit>

        </s:form> 
    </body>
</html>

