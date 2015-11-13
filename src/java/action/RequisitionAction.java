package action;
import model.Requisition;
import dbconnection.RequisitionConnection;

public class RequisitionAction {
    
     public String materialName,requiredDate,productionLine,materialId,quantity;
     public int matId, matQuantity;
     
     public String execute(){
        
        Requisition details = new Requisition();
        matId = Integer.parseInt(materialId);
        matQuantity = Integer.parseInt(quantity);
        
        details.setmaterialId(matId);
        details.setmaterialName(materialName);
        details.setquantity(matQuantity);
        details.setrequiredDate(requiredDate);
        details.setproductionLine(productionLine);
        RequisitionConnection.addRequisition(details);        
        return "success";
    }
    
}
