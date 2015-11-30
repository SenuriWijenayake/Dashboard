package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Requisition;
import dbconnection.RequisitionConnection;



public class RequisitionAction extends ActionSupport{

    public String materialName, requiredDate, productionLine, materialId, quantity, requisitionId, authorizedBy;
    public int matId, matQuantity, reqId;

    public String execute() {

        Requisition details = new Requisition();
        matId = Integer.parseInt(materialId);
        matQuantity = Integer.parseInt(quantity);

        details.setmaterialId(matId);
        details.setmaterialName(materialName);
        details.setquantity(matQuantity);
        details.setrequiredDate(requiredDate);
        details.setproductionLine(productionLine);
        details.setAuthorizedBy(authorizedBy);
        RequisitionConnection.addRequisition(details);
        return "success";
    }

    public String updateRequisition() {

        reqId = Integer.parseInt(requisitionId);
        matQuantity = Integer.parseInt(quantity);

        RequisitionConnection.updateReq(reqId, matQuantity);
        return "success";
    }

    public String deleteRequisition() {

        reqId = Integer.parseInt(requisitionId);

        RequisitionConnection.deleteReq(reqId);
        return "success";
    }
   

}
