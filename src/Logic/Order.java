package Logic;

public class Order {

    private String namaPelanggan;
    private String nomorTeleponPelanggan;
    private boolean statusOrderan;

    private double beratCucianBaju;
    private String jenisCuciBaju;
    private int waktuPengerjaanBaju;

    private int jumlahCucianSelimut;
    private String jenisCuciSelimut;
    private int waktuPengerjaanSelimut;

    private int jumlahCucianSepatu;
    private int waktuPengerjaanSepatu;

    private int jumlahCucianKarpet;
    private int waktuPengerjaanKarpet;

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorTeleponPelanggan() {
        return nomorTeleponPelanggan;
    }

    public boolean isStatusOrderan() {
        return statusOrderan;
    }

    public double getBeratCucianBaju() {
        return beratCucianBaju;
    }

    public String getJenisCuciBaju() {
        return jenisCuciBaju;
    }

    public int getWaktuPengerjaanBaju() {
        return waktuPengerjaanBaju;
    }

    public int getJumlahCucianSelimut() {
        return jumlahCucianSelimut;
    }

    public String getJenisCuciSelimut() {
        return jenisCuciSelimut;
    }

    public int getWaktuPengerjaanSelimut() {
        return waktuPengerjaanSelimut;
    }

    public int getJumlahCucianSepatu() {
        return jumlahCucianSepatu;
    }

    public int getWaktuPengerjaanSepatu() {
        return waktuPengerjaanSepatu;
    }

    public int getJumlahCucianKarpet() {
        return jumlahCucianKarpet;
    }

    public int getWaktuPengerjaanKarpet() {
        return waktuPengerjaanKarpet;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setNomorTeleponPelanggan(String nomorTeleponPelanggan) {
        this.nomorTeleponPelanggan = nomorTeleponPelanggan;
    }

    public void setBeratCucianBaju(double beratCucianBaju) {
        this.beratCucianBaju = beratCucianBaju;
    }

    public void setJenisCuciBaju(String jenisCuciBaju) {
        this.jenisCuciBaju = jenisCuciBaju;
    }

    public void setWaktuPengerjaanBaju(int waktuPengerjaanBaju) {
        this.waktuPengerjaanBaju = waktuPengerjaanBaju;
    }

    public void setJumlahCucianSelimut(int jumlahCucianSelimut) {
        this.jumlahCucianSelimut = jumlahCucianSelimut;
    }

    public void setJenisCuciSelimut(String jenisCuciSelimut) {
        this.jenisCuciSelimut = jenisCuciSelimut;
    }

    public void setWaktuPengerjaanSelimut(int waktuPengerjaanSelimut) {
        this.waktuPengerjaanSelimut = waktuPengerjaanSelimut;
    }

    public void setJumlahCucianSepatu(int jumlahCucianSepatu) {
        this.jumlahCucianSepatu = jumlahCucianSepatu;
    }

    public void setWaktuPengerjaanSepatu(int waktuPengerjaanSepatu) {
        this.waktuPengerjaanSepatu = waktuPengerjaanSepatu;
    }

    public void setJumlahCucianKarpet(int jumlahCucianKarpet) {
        this.jumlahCucianKarpet = jumlahCucianKarpet;
    }

    public void setWaktuPengerjaanKarpet(int waktuPengerjaanKarpet) {
        this.waktuPengerjaanKarpet = waktuPengerjaanKarpet;
    }

    public void setStatusOrderan(String statusOrderan) {
        if(statusOrderan == "Selesai")
            this.statusOrderan = true;
        else
            this.statusOrderan = false;
    }
}
