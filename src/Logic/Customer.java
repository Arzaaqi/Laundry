/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 62811
 */
public class Customer {
    private String name;
    private String phoneNumber;
    private List<Order> orderList = new ArrayList<>();
    
    public Customer(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void addOrder(String itemType, String washingType, double weight, int totalItem, int duration) {
        Order order = new Order(String itemType, String washingType, double weight, int totalItem, int duration);
        orderList.add(order);
    }

    public Keranjang getKeranjanglist(int indeks) {
        return keranjanglist.get(indeks);
    }

    public int getJumlahKeranjang() {
        return keranjanglist.size();
    }

    public void hapusKeranjang(int indeks) {
        keranjanglist.remove(indeks);
    }
}