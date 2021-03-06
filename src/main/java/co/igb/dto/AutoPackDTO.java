package co.igb.dto;

public class AutoPackDTO {
    private String customerId;
    private Integer orderNumber;
    private Integer idPackingOrder;

    public Integer getIdPackingOrder() {
        return idPackingOrder;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setIdPackingOrder(Integer idPackingOrder) {
        this.idPackingOrder = idPackingOrder;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "AutoPackDTO{" +
                "customerId='" + customerId + '\'' +
                ", orderNumber=" + orderNumber +
                ", idPackingOrder=" + idPackingOrder +
                '}';
    }
}
