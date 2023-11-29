package Logic;

public class KalkulatorSepatu implements InterfaceKalkulator {

    private int jumlah;
    private String jenisPengerjaan;

    public KalkulatorSepatu() {
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setJenisPengerjaan(String jenisPengerjaan) {
        this.jenisPengerjaan = jenisPengerjaan;
    }

    @Override
    public double hitung() {
        int biayaPengerjaan = ubahJenisPengerjaan();

        int totalBiaya = jumlah * biayaPengerjaan;

        return totalBiaya;

    }

    @Override
    public int ubahJenisPengerjaan() {
        int biayaPengerjaan = 0;
        if (jenisPengerjaan.equalsIgnoreCase("Express (1 Hari)")) {
            biayaPengerjaan = 20000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Standar (3 Hari)")) {
            biayaPengerjaan = 15000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Hemat (5 Hari)")) {
            biayaPengerjaan = 10000;
        } else {
            biayaPengerjaan = 0;
        }
        return biayaPengerjaan;
    }
}
