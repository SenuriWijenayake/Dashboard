package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Requisition;
import dbconnection.RequisitionConnection;

public class RequisitionAction extends ActionSupport {

    public String materialName, requiredDate, productionLine, materialId, quantity, requisitionId, authorizedBy;
    public int matId, matQuantity, reqId;
    public String reg = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public String execute() {

        Requisition details = new Requisition();
        if ((Integer.parseInt(quantity)>0)&&(requiredDate).matches(reg)) {
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
        else{
            return "validationError";
        }
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
