package Source;

public class Transaction {
    private Customer customer;
    private boolean payStatus;
    
    public Transaction(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public Double countPayment(Double money){
        Double price = customer.getOrder().getTotalPrice();
        
        return money - price;    
    }

    public boolean isStatus() {
        return payStatus;
    }

    public void setStatus(boolean status) {
        this.payStatus = status;
    }    
}
