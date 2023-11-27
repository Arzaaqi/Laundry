package Logic;

public class Order {

    private String namaPelanggan;
    private String nomorTeleponPelanggan;
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
    
    public void tambahBaju(double beratCucianBaju, String jenisCuciBaju, int waktuPengerjaanBaju){
        this.beratCucianBaju = beratCucianBaju;
        this.jenisCuciBaju = jenisCuciBaju;
        this.waktuPengerjaanBaju = waktuPengerjaanBaju;
    }
    
    public void tambahSelimut(int jumlahCucianSelimut, String jenisCucianSelimut, int waktuPengerjaanSelimut){
        this.jumlahCucianSelimut = jumlahCucianSelimut;
        this.jenisCuciSelimut = jenisCuciSelimut;
        this.waktuPengerjaanBaju = waktuPengerjaanSelimut;
    }
    
    public void tambahSepatu(int jumlahCucianSepatu, int waktuPengerjaanSepatu){
        this.jumlahCucianSepatu = jumlahCucianSepatu;
        this.waktuPengerjaanSepatu = waktuPengerjaanSepatu;
    }
    
    public void tambahKarpet(int jumlahCucianKarpet, int waktuPengerjaanKarpet){
        this.jumlahCucianKarpet = jumlahCucianKarpet;
        this.waktuPengerjaanKarpet = waktuPengerjaanKarpet;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorTeleponPelanggan() {
        return nomorTeleponPelanggan;
    }

    public double getBeratCucianBaju() {
        return beratCucianBaju;
    }

    public void setBeratCucianBaju(double beratCucianBaju) {
        this.beratCucianBaju = beratCucianBaju;
    }

    public String getJenisCuciBaju() {
        return jenisCuciBaju;
    }

    public void setJenisCuciBaju(String jenisCuciBaju) {
        this.jenisCuciBaju = jenisCuciBaju;
    }

    public int getWaktuPengerjaanBaju() {
        return waktuPengerjaanBaju;
    }

    public void setWaktuPengerjaanBaju(int waktuPengerjaanBaju) {
        this.waktuPengerjaanBaju = waktuPengerjaanBaju;
    }

    public int getJumlahCucianSelimut() {
        return jumlahCucianSelimut;
    }

    public void setJumlahCucianSelimut(int jumlahCucianSelimut) {
        this.jumlahCucianSelimut = jumlahCucianSelimut;
    }

    public String getJenisCuciSelimut() {
        return jenisCuciSelimut;
    }

    public void setJenisCuciSelimut(String jenisCuciSelimut) {
        this.jenisCuciSelimut = jenisCuciSelimut;
    }

    public int getWaktuPengerjaanSelimut() {
        return waktuPengerjaanSelimut;
    }

    public void setWaktuPengerjaanSelimut(int waktuPengerjaanSelimut) {
        this.waktuPengerjaanSelimut = waktuPengerjaanSelimut;
    }

    public int getJumlahCucianSepatu() {
        return jumlahCucianSepatu;
    }

    public void setJumlahCucianSepatu(int jumlahCucianSepatu) {
        this.jumlahCucianSepatu = jumlahCucianSepatu;
    }

    public int getWaktuPengerjaanSepatu() {
        return waktuPengerjaanSepatu;
    }

    public void setWaktuPengerjaanSepatu(int waktuPengerjaanSepatu) {
        this.waktuPengerjaanSepatu = waktuPengerjaanSepatu;
    }

    public int getJumlahCucianKarpet() {
        return jumlahCucianKarpet;
    }

    public void setJumlahCucianKarpet(int jumlahCucianKarpet) {
        this.jumlahCucianKarpet = jumlahCucianKarpet;
    }

    public int getWaktuPengerjaanKarpet() {
        return waktuPengerjaanKarpet;
    }

    public void setWaktuPengerjaanKarpet(int waktuPengerjaanKarpet) {
        this.waktuPengerjaanKarpet = waktuPengerjaanKarpet;
    }

    
}
