package Logic;

public class OrderItem {

    private ItemType itemType;
    private double berat;
    private String jenisCuci;
    private String waktuPengerjaan;
    private int jumlah;

    public OrderItem(ItemType itemType, double berat, String jenisCuci, String waktuPengerjaan, int jumlah) {
        this.itemType = itemType;
        this.berat = berat;
        this.jenisCuci = jenisCuci;
        this.waktuPengerjaan = waktuPengerjaan;
        this.jumlah = jumlah;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getBerat() {
        return berat;
    }

    public String getJenisCuci() {
        return jenisCuci;
    }

    public String getWaktuPengerjaan() {
        return waktuPengerjaan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setJenisCuci(String jenisCuci) {
        this.jenisCuci = jenisCuci;
    }

    public void setWaktuPengerjaan(String waktuPengerjaan) {
        this.waktuPengerjaan = waktuPengerjaan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}