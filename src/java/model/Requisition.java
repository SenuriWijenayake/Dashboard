package model;

public class Requisition {
     
     int materialId;
     String materialName;
     int quantity;
     String requiredDate;
     String productionLine;
     int requisitionId;
     String authorizedBy;

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }
  
    public String getAuthorizedBy() {
        return authorizedBy;
    }
     
     
    public void setRequisitionId(int requisitionId) {
        this.requisitionId = requisitionId;
    }

    public int getRequisitionId() {
        return requisitionId;
    }
     
    public String getrequiredDate() {
        return requiredDate;
    }

    public void setrequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }
    
    public String getmaterialName() {
        return materialName;
    }

    public void setmaterialName(String materialName) {
        this.materialName = materialName;
    }
    
    public String getproductionLine() {
        return productionLine;
    }

    public void setproductionLine(String productionLine) {
        this.productionLine = productionLine;
    }
    
    public int getmaterialId() {
        return materialId;
    }

    public void setmaterialId(int materialId) {
        this.materialId = materialId;
    }
    
    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
}
