package model;

public class PurchaseOrder {

    public int orderId, supplierId, productId, quantity;
    public float totalPrice, unitPrice;
    public String requiredDate;

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }
}
