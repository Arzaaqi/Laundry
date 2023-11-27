package Controller;

import java.util.ArrayList;
import Logic.*;

public class OrderController {
    
    private ArrayList<Order> listOrder;
    
    public OrderController() {
        this.listOrder = new ArrayList<Order>();
    }
    
    public void tambahOrder(String jenisBarang, String jenisCuci, double beratBarang, int durasiCuci) {
        Order order = new Order(jenisBarang, jenisCuci, beratBarang, durasiCuci);
        listOrder.add(order);
    }

    public void tambahOrder(String jenisBarang, int jumlahBarang, int durasiCuci) {
        Order order = new Order(jenisBarang, jumlahBarang, durasiCuci);
        listOrder.add(order);
    }
    
    public ArrayList<Order> cariOrder(String nama, String nomorTelepon) {
        ArrayList<Order> hasilCari = new ArrayList<Order>();
        
        for(Order order : listOrder) {
            if(order.getNamaPelanggan().equals(nama) && order.getNomorTeleponPelanggan().equals(nomorTelepon)) {
                hasilCari.add(order);
            }
        }
        
        return hasilCari;
    }
    
    public ArrayList<Order> cariOrder(String nomorTelepon) {
        ArrayList<Order> hasilCari = new ArrayList<Order>();
        
        for(Order order : listOrder) {
            if(order.getNomorTeleponPelanggan().equals(nomorTelepon)) {
                hasilCari.add(order);
            }
        }
        
        return hasilCari;
    }
    
    public void hapusOrder(Order order) {
        this.listOrder.remove(order);
    }

    public Order getOrder(int index) {
        return listOrder.get(index);
    }

    public int getOrderSize() {
        return listOrder.size();
    }
}
