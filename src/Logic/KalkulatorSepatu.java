/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author ZAQI
 */
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
            // Handle unknown jenisCucian
            System.out.println("Jenis Pengerjaan tidak valid.");
        }
        return biayaPengerjaan;
    }
}