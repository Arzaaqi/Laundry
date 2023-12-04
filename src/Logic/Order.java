package Logic;

import java.util.ArrayList;
import java.util.List;

import Controller.*;

public class Order extends ViewController {

    private String namaPelanggan;
    private String nomorTeleponPelanggan;
    private String alamatPelanggan;
    private double totalHarga;
    private boolean statusOrderan = false;

    private List<OrderItem> orderItems = new ArrayList<>();

    public double calculateTotalHarga() {
        double total = 0;

        for (OrderItem item : orderItems) {
            KalkulatorHarga kalkulatorHarga = new KalkulatorHarga(item);
            total += kalkulatorHarga.calculatePrice();
        }

        return total;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorTeleponPelanggan() {
        return nomorTeleponPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public boolean isStatusOrderan() {
        return statusOrderan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setNomorTeleponPelanggan(String nomorTeleponPelanggan) {
        this.nomorTeleponPelanggan = nomorTeleponPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public void setStatusOrderan(boolean statusOrderan) {
        this.statusOrderan = statusOrderan;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setStatusOrderan(String statusOrderan) {
        if (statusOrderan == "Selesai") {
            this.statusOrderan = true;
        } else {
            this.statusOrderan = false;
        }
    }
}
