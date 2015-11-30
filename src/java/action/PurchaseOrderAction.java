package action;

import com.opensymphony.xwork2.ActionSupport;
import model.PurchaseOrder;
import dbconnection.PurchaseOrderConnection;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PurchaseOrderAction extends ActionSupport {

    public String rawId, quantity, supplierId, unit, requiredDate;
    public int matId, matQuantity, suppId;
    public float tot, unitPrice;
    public ArrayList<PurchaseOrder> order = new ArrayList<PurchaseOrder>();
    public PurchaseOrder newOrder = new PurchaseOrder();

    public ArrayList<PurchaseOrder> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<PurchaseOrder> order) {
        this.order = order;
    }

    public String getTotalQuantity() {

        matId = Integer.parseInt(rawId);
        ResultSet total = PurchaseOrderConnection.getTotal(matId);
        try {
            while (total.next()) {
                matQuantity = total.getInt("total");
                ResultSet supplierInfo = PurchaseOrderConnection.getSupplierInfo(matId);
                while (supplierInfo.next()) {
                    suppId = supplierInfo.getInt("supplierId");
                    unitPrice = supplierInfo.getFloat("unitPrice");
                }
                ResultSet date = PurchaseOrderConnection.getRequiredDate(matId);
                while (date.next()) {
                    requiredDate = date.getString("requiredDate");
                }

                newOrder.setProductId(matId);
                newOrder.setSupplierId(suppId);
                newOrder.setUnitPrice(unitPrice);
                newOrder.setQuantity(matQuantity);
                newOrder.setRequiredDate(requiredDate);
                newOrder.setTotalPrice(unitPrice * matQuantity);
                PurchaseOrderConnection.addOrder(newOrder);
                order.add(newOrder);

                return "success";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
        return "success";
    }
}
