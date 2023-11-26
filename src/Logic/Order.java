package Logic;

public class Order {

    private String namaPelanggan;
    private String nomorTeleponPelanggan;
    private String jenisBarang;
    private String jenisCuci;
    private double beratBarang;
    private int jumlahBarang;
    private int durasiCuci;

    public Order(String jenisBarang, String jenisCuci, double beratBarang, int durasiCuci) {
        this.jenisBarang = jenisBarang;
        this.jenisCuci = jenisCuci;
        this.beratBarang = beratBarang;
        this.durasiCuci = durasiCuci;
    }

    public Order(String jenisBarang, int jumlahBarang, int durasiCuci) {
        this.jenisBarang = jenisBarang;
        this.jumlahBarang = jumlahBarang;
        this.durasiCuci = durasiCuci;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorTeleponPelanggan() {
        return nomorTeleponPelanggan;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getJenisCuci() {
        return jenisCuci;
    }

    public double getBeratBarang() {
        return beratBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int getDurasiCuci() {
        return durasiCuci;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setNomorTeleponPelanggan(String nomorTeleponPelanggan) {
        this.nomorTeleponPelanggan = nomorTeleponPelanggan;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setJenisCuci(String jenisCuci) {
        this.jenisCuci = jenisCuci;
    }

    public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void setDurasiCuci(int durasiCuci) {
        this.durasiCuci = durasiCuci;
    }

}
