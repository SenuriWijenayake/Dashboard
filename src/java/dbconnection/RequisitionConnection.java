package dbconnection;

import db.DB;
import model.Requisition;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RequisitionConnection {
     public static String addRequisition(Requisition requisition) {
        try{
        Connection conn = DB.getConnection();
        String sql="insert into purchaserequisition (materialId, materialName, quantity, requiredDate, productionLine)"
                + "values(?,?,?,?,?)";
        
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setInt(1, requisition.getmaterialId());
        ps.setString(2, requisition.getmaterialName());
        ps.setInt(3, requisition.getquantity());
        ps.setString(4, requisition.getrequiredDate());
        ps.setString(5, requisition.getproductionLine());
        
        ps.executeUpdate();
        return "success";
        
        }catch(Exception ie){
            ie.printStackTrace();
	    return ie.getLocalizedMessage();
        }
        
    
}
}
