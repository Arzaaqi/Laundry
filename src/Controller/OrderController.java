package Controller;

import java.util.ArrayList;
import Logic.*;

public class OrderController {
    
    private ArrayList<Order> listOrder;
    
    public OrderController() {
        this.listOrder = new ArrayList<Order>();
    }
    
    public void tambahOrderBaju(double beratBarang, String jenisCuci, int durasiCuci) {
        Order order = new Order();
        listOrder.add(order);
        order.tambahBaju(beratBarang, jenisCuci, durasiCuci);
    }
    
    public void tambahOrderSelimut(int jumlahBarang, String jenisCuci, int durasiCuci) {
        Order order = new Order();
        listOrder.add(order);
        order.tambahSelimut(jumlahBarang, jenisCuci, durasiCuci);
    }
    
    public void tambahOrderSepatu(int jumlahBarang, int durasiCuci) {
        Order order = new Order();
        listOrder.add(order);
        order.tambahSepatu(jumlahBarang, durasiCuci);
    }

    public void tambahOrderKarpet(int jumlahBarang, int durasiCuci) {
        Order order = new Order();
        listOrder.add(order);
        order.tambahKarpet(jumlahBarang, durasiCuci);
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
