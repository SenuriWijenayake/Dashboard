package dbconnection;
import model.PurchaseOrder;
import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PurchaseOrderConnection {
    public static ResultSet getTotal(int materialId){
        ResultSet result = null;
         try {
            Connection conn = DB.getConnection();
            String sql = "SELECT SUM(quantity) as total,materialId FROM purchaserequisition WHERE materialId=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, materialId);
                      
            result = ps.executeQuery();
            return result;

        } catch (Exception ie) {
            ie.printStackTrace();
            return result;
        }
    }
    
    public static ResultSet getSupplierInfo(int materialId){
        ResultSet result = null;
         try {
            Connection conn = DB.getConnection();
            String sql = "SELECT * FROM supplier WHERE materialId=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, materialId);
                      
            result = ps.executeQuery();
            return result;

        } catch (Exception ie) {
            ie.printStackTrace();
            return result;
        }
    }
    
    public static ResultSet getRequiredDate(int materialId){
        ResultSet result = null;
         try {
            Connection conn = DB.getConnection();
            String sql = "SELECT MIN(requiredDate)as requiredDate FROM purchaserequisition WHERE materialId=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, materialId);
                      
            result = ps.executeQuery();
            return result;

        } catch (Exception ie) {
            ie.printStackTrace();
            return result;
        }
    }
    
    public static String addOrder(PurchaseOrder order){
         try {
            Connection conn = DB.getConnection();
            String sql = "insert into purchaseorder(`productId`, `supplierId`, `quantity`, `totalPrice`, `requiredDate`)\n" +
                "values (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, order.getProductId());
            ps.setInt(2, order.getSupplierId());
            ps.setInt(3, order.getQuantity());
            ps.setFloat(4, order.getTotalPrice());
            ps.setString(5, order.getRequiredDate());
             //System.out.println(ps);
            ps.executeUpdate();
            return "success";

        } catch (Exception ie) {
            ie.printStackTrace();
            return ie.getLocalizedMessage();
        }
    }
}
