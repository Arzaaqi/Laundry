/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author kimi reza
 */
public class Transaction {

    private Customer customer;
    private boolean payStatus;

    public Transaction(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double countPayment(Double money) {
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
