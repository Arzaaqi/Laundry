package Logic;

public class KalkulatorKarpet implements InterfaceKalkulator {

    private int jumlah;
    private String jenisPengerjaan;

    public KalkulatorKarpet() {
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setJenisPengerjaan(String jenisPengerjaan) {
        this.jenisPengerjaan = jenisPengerjaan;
    }

    @Override
    public int hitung() {
        int biayaPengerjaan = ubahJenisPengerjaan();

        int totalBiaya = jumlah * biayaPengerjaan;

        return totalBiaya;

    }

    @Override
    public int ubahJenisPengerjaan() {
        int biayaPengerjaan = 0;
        if (jenisPengerjaan.equalsIgnoreCase("Express")) {
            biayaPengerjaan = 20000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Standar")) {
            biayaPengerjaan = 15000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Hemat")) {
            biayaPengerjaan = 10000;
        } else {
            System.out.println("Jenis Pengerjaan tidak valid.");
        }
        return biayaPengerjaan;
    }

}
