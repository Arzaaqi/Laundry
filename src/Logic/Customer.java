/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author 62811
 */
public class Customer {
    private String name;
    private String phoneNumber;
    private ListOrder listOrder;
    
    public Customer(String name, String phoneNumber, ListOrder listOrder){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.listOrder = listOrder;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ListOrder getListOrder() {
        return listOrder;
    }

    public void setListOrder(ListOrder listOrder) {
        this.listOrder = listOrder;
    }
}