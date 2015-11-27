package dbconnection;

import db.DB;
import model.Requisition;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RequisitionConnection {

    private static ArrayList<Requisition> requisitions = new ArrayList<Requisition>();

    public static String addRequisition(Requisition requisition) {
        try {
            Connection conn = DB.getConnection();
            String sql = "insert into purchaserequisition (materialId, materialName, quantity, requiredDate, productionLine)"
                    + "values(?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, requisition.getmaterialId());
            ps.setString(2, requisition.getmaterialName());
            ps.setInt(3, requisition.getquantity());
            ps.setString(4, requisition.getrequiredDate());
            ps.setString(5, requisition.getproductionLine());

            ps.executeUpdate();
            return "success";

        } catch (Exception ie) {
            ie.printStackTrace();
            return ie.getLocalizedMessage();
        }

    }

    public static String updateReq(int id, int quantity) {
        try {
            Connection conn = DB.getConnection();
            String sql = "update purchaserequisition set quantity=? where requisitionId=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, quantity);
            ps.setInt(2, id);

            ps.executeUpdate();
            return "success";

        } catch (Exception ie) {
            ie.printStackTrace();
            return ie.getLocalizedMessage();
        }

    }
    
    public static String deleteReq(int id) {
        try {
            Connection conn = DB.getConnection();
            String sql = "delete from purchaserequisition where requisitionId=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            return "success";

        } catch (Exception ie) {
            ie.printStackTrace();
            return ie.getLocalizedMessage();
        }

    }

    public static ArrayList<Requisition> viewRequisitions() {
        try {
            Connection conn = DB.getConnection();
            String sql = "SELECT * FROM `purchaserequisition`";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Requisition requisition = new Requisition();
                requisition.setRequisitionId(result.getInt("requisitionId"));
                requisition.setmaterialId(result.getInt("materialId"));
                requisition.setmaterialName(result.getString("materialName"));
                requisition.setquantity(result.getInt("quantity"));
                requisition.setrequiredDate(result.getString("requiredDate"));
                requisition.setproductionLine(result.getString("productionLine"));
                requisitions.add(requisition);
            }

            return requisitions;
        } catch (Exception ie) {
            ie.printStackTrace();
            return null;
        }

    }
}
