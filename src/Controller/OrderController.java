package Controller;

import java.util.ArrayList;
import Logic.*;

public class OrderController {

    private Order order;
    private ArrayList<Order> listOrder;

    public OrderController() {
        this.listOrder = new ArrayList<Order>();
    }

    public void addOrder() {
        if (order != null) {
            listOrder.add(order);
            order = null;
        }
    }

    public void buatOrder(String namaPelanggan, String nomorTelepon, String alamatPelanggan) {
        this.order = new Order();
        order.setNamaPelanggan(namaPelanggan);
        order.setNomorTeleponPelanggan(nomorTelepon);
        order.setAlamatPelanggan(alamatPelanggan);
        order.setStatusOrderan("Belum Selesai");
    }

    public void hapusOrder(int index) {
        listOrder.remove(index);
        order = null;
    }

    public void addItemToOrder(String itemType, double berat, String jenisCuci, String waktuPengerjaan, int jumlahCucian) {
        if (order == null) {
            throw new IllegalStateException("Order not created. Call createOrder() first.");
        }

        switch (itemType) {
            case "Pakaian":
                tambahPakaian(berat, jenisCuci, waktuPengerjaan);
                break;
            case "Selimut":
                tambahSelimut(jumlahCucian, jenisCuci, waktuPengerjaan);
                break;
            case "Sepatu":
                tambahSepatu(jumlahCucian, waktuPengerjaan);
                break;
            case "Karpet":
                tambahKarpet(jumlahCucian, waktuPengerjaan);
                break;
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
    }

    public void tambahPakaian(double beratCucianPakaian, String jenisCuciPakaian, String waktuPengerjaanPakaian) {
        OrderItem pakaian = new OrderItem(ItemType.PAKAIAN, beratCucianPakaian, jenisCuciPakaian, waktuPengerjaanPakaian, 0);
        order.addItem(pakaian);
    }

    public void tambahSelimut(int jumlahCucianSelimut, String jenisCuciSelimut, String waktuPengerjaanSelimut) {
        OrderItem selimut = new OrderItem(ItemType.SELIMUT, 0.0, jenisCuciSelimut, waktuPengerjaanSelimut, jumlahCucianSelimut);
        order.addItem(selimut);
    }

    public void tambahSepatu(int jumlahCucianSepatu, String waktuPengerjaanSepatu) {
        OrderItem sepatu = new OrderItem(ItemType.SEPATU, 0.0, null, waktuPengerjaanSepatu, jumlahCucianSepatu);
        order.addItem(sepatu);
    }

    public void tambahKarpet(int jumlahCucianKarpet, String waktuPengerjaanKarpet) {
        OrderItem karpet = new OrderItem(ItemType.KARPET, 0.0, null, waktuPengerjaanKarpet, jumlahCucianKarpet);
        order.addItem(karpet);
    }
    
    public void addHarga(double totalHarga){
        order.setTotalHarga(totalHarga);
    }

    public ArrayList<Order> cariOrder(String nama, String nomorTelepon) {
        ArrayList<Order> hasilCari = new ArrayList<Order>();

        for (Order order : listOrder) {
            if (order.getNamaPelanggan().equals(nama) && order.getNomorTeleponPelanggan().equals(nomorTelepon)) {
                hasilCari.add(order);
            }
        }

        return hasilCari;
    }

    public ArrayList<Order> cariOrder(String nomorTelepon) {
        ArrayList<Order> hasilCari = new ArrayList<Order>();

        for (Order order : listOrder) {
            if (order.getNomorTeleponPelanggan().equals(nomorTelepon)) {
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
