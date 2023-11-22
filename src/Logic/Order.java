/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author kimi reza
 */
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
