package Source;

import LaundryApplication.*;

public class Customer {
    private String name;
    private String phoneNumber;
    private Order order;

    public Customer(String name, String phoneNumber, Order order) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Order getOrder(){
        return order;
    }
    
    public void setOrder(Order order){
        this.order = order;
    }
}
