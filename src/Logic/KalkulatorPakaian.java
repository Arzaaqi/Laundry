package Logic;

public class KalkulatorPakaian implements InterfaceKalkulator {

    private double berat;
    private String jenisPengerjaan;
    private String jenisCucian;
    

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setJenisPengerjaan(String jenisPengerjaan) {
        this.jenisPengerjaan = jenisPengerjaan;
    }

    public void setJenisCucian(String jenisCucian) {
        this.jenisCucian = jenisCucian;
    }

    private int biayaCucian() {
        int biayaCucian = 0;
        if (jenisCucian.equalsIgnoreCase("Cuci Kering")) {
            biayaCucian = 3000;
        } else if (jenisCucian.equalsIgnoreCase("Cuci Kering + Setrika")) {
            biayaCucian = 4000;
        } else if (jenisCucian.equalsIgnoreCase("Setrika")) {
            biayaCucian = 3000;
        } else {
            biayaCucian = 0;
        }
        return biayaCucian;
    }

    @Override
    public double hitung() {
        int biayaCucian = biayaCucian();
        int biayaPengerjaan = ubahJenisPengerjaan();

        double totalBiaya = berat * biayaCucian + biayaPengerjaan;

        return totalBiaya;

    }

    @Override
    public int ubahJenisPengerjaan() {
        int biayaPengerjaan = 0;
        if (jenisPengerjaan.equalsIgnoreCase("Express (1 Hari)")) {
            biayaPengerjaan = 4000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Standar (3 Hari)")) {
            biayaPengerjaan = 3000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Hemat (5 Hari)")) {
            biayaPengerjaan = 2000;
        } else {
            biayaPengerjaan = 0;
        }
        return biayaPengerjaan;
        
    }

}
