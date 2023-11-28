/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author ZAQI
 */
public class KalkulatorBaju implements InterfaceKalkulator {

    private int berat;
    private String jenisPengerjaan;
    private String jenisCucian;

    public KalkulatorBaju() {

    }

    public void setBerat(int berat) {
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
            // Handle unknown jenisCucian
            System.out.println("Jenis Cucian tidak valid.");
        }
        return biayaCucian;
    }

    @Override
    public int hitung() {
        int biayaCucian = biayaCucian();
        int biayaPengerjaan = ubahJenisPengerjaan();

        int totalBiaya = berat * biayaCucian + biayaPengerjaan;

        return totalBiaya;

    }

    @Override
    public int ubahJenisPengerjaan() {
        int biayaPengerjaan = 0;
        if (jenisPengerjaan.equalsIgnoreCase("Express")) {
            biayaPengerjaan = 4000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Standar")) {
            biayaPengerjaan = 3000;
        } else if (jenisPengerjaan.equalsIgnoreCase("Hemat")) {
            biayaPengerjaan = 2000;
        } else {
            // Handle unknown jenisCucian
            System.out.println("Jenis Pengerjaan tidak valid.");
        }
        return biayaPengerjaan;
    }

}
