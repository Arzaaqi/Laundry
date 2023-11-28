package Controller;

import java.util.ArrayList;
import Logic.*;

public class OrderController {
    
    private Order order;
    private ArrayList<Order> listOrder;
    
    public OrderController() {
        this.listOrder = new ArrayList<Order>();
    }
    
    public void addOrder(){
        listOrder.add(order);
    }
    
    public void tambahNama(String namaPelanggan, String nomorTelepon) {
        this.order = new Order();
        order.setNamaPelanggan(namaPelanggan);
        order.setNomorTeleponPelanggan(nomorTelepon);
        order.setStatusOrderan("Belum Selesai");
    }
    
    public void hapusOrder(int index) {
        listOrder.remove(index);
        order = null;
    }
    
    public void tambahBaju(double beratCucianBaju, String jenisCuciBaju, String waktuPengerjaanBaju){
        order.setBeratCucianBaju(beratCucianBaju);
        order.setJenisCuciBaju(jenisCuciBaju);
        order.setWaktuPengerjaanBaju(waktuPengerjaanBaju);
    }
    
    public void tambahSelimut(int jumlahCucianSelimut, String jenisCucianSelimut, String waktuPengerjaanSelimut){
        order.setJumlahCucianSelimut(jumlahCucianSelimut);
        order.setJenisCuciSelimut(jenisCucianSelimut);
        order.setWaktuPengerjaanSelimut(waktuPengerjaanSelimut);
    }
    
    public void tambahSepatu(int jumlahCucianSepatu, String waktuPengerjaanSepatu){
        order.setJumlahCucianSepatu(jumlahCucianSepatu);
        order.setWaktuPengerjaanSepatu(waktuPengerjaanSepatu);
    }
    
    public void tambahKarpet(int jumlahCucianKarpet, String waktuPengerjaanKarpet){
        order.setJumlahCucianKarpet(jumlahCucianKarpet);
        order.setWaktuPengerjaanKarpet(waktuPengerjaanKarpet);
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
    
    public Order getOrder(int index) {
        return listOrder.get(index);
    }

    public int getOrderSize() {
        return listOrder.size();
    }
}
