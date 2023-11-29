package Logic;

public class KalkulatorSelimut implements InterfaceKalkulator {

    private int jumlah;
    private String jenisPengerjaan;
    private String jenisCucian;

    public KalkulatorSelimut() {

    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
            biayaCucian = 2000;
        } else if (jenisCucian.equalsIgnoreCase("Cuci Kering + Setrika")) {
            biayaCucian = 3000;
        } else if (jenisCucian.equalsIgnoreCase("Setrika")) {
            biayaCucian = 2000;
        } else {
            System.out.println("Jenis Cucian tidak valid.");
        }
        return biayaCucian;
    }

    @Override
    public int hitung() {
        int biayaCucian = biayaCucian();
        int biayaPengerjaan = ubahJenisPengerjaan();

        int totalBiaya = jumlah * biayaCucian + biayaPengerjaan;

        return totalBiaya;

    }

    @Override
    public int ubahJenisPengerjaan() {
        int biayaPengerjaan = 0;
        if (jenisPengerjaan.equalsIgnoreCase("Express")) {
            biayaPengerjaan = 4000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Standar")) {
            biayaPengerjaan = 2000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Hemat")) {
            biayaPengerjaan = 1000;
        } else {
            System.out.println("Jenis Pengerjaan tidak valid.");
        }
        return biayaPengerjaan;
    }

}
