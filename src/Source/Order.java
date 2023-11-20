package Source;

public class Order {
    private String serviceType;
    private double weight;
    private double totalPrice;  
    private boolean orderStatus;

    public Order(String serviceType, double weight, double totalPrice) {
        this.serviceType = serviceType;
        this.weight = weight;
        this.totalPrice = totalPrice;
    }

    public String getServiceType() {
        return serviceType;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }

    public double getWeight() {
        return weight;
    }
    
    public boolean isStatus() {
        return orderStatus;
    }

    public void setStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }  
}
