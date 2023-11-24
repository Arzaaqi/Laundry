/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author ZAQI
 */
public class KalkulatorBaju implements Kalkulator {

    private int berat;
    private String jenisCucian;

    public KalkulatorBaju(int berat, String jenisCucian) {
        this.berat = berat;
        this.jenisCucian = jenisCucian;

    }

    @Override
    public int ubahJenisCucian() {
        int biayacuci = 0;
        if (jenisCucian.equalsIgnoreCase("Cuci Kering")) {
            biayacuci = 1000;
        } else if (jenisCucian.equalsIgnoreCase("Cuci Kering + Setrika")) {
            biayacuci = 2000;
        } else if (jenisCucian.equalsIgnoreCase("Setrika")) {
            biayacuci = 3000;
        } else {
            // Handle unknown jenisCucian
            System.out.println("Jenis cucian tidak valid.");
        }
        return biayacuci;
    }

    @Override
    public int hitung() {
        int biayaCucian = ubahJenisCucian();

        int totalBiaya = berat * biayaCucian;

        return totalBiaya;

    }

}
