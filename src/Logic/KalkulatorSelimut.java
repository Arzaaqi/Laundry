package Logic;

public class KalkulatorSelimut implements InterfaceKalkulator {

    @Override
    public int calculateJenisCucianPrice(String jenisCuci) {
        int biayaCucian = 0;
        if (jenisCuci.equalsIgnoreCase("Cuci Kering")) {
            biayaCucian = 2000;
        } else if (jenisCuci.equalsIgnoreCase("Cuci Kering + Setrika")) {
            biayaCucian = 3000;
        } else if (jenisCuci.equalsIgnoreCase("Setrika")) {
            biayaCucian = 2000;
        } else {
            biayaCucian = 0;
        }
        return biayaCucian;
    }

    @Override
    public int calculateWaktuPengerjaanPrice(String waktuPengerjaan) {
        int biayaPengerjaan = 0;
        if (waktuPengerjaan.equalsIgnoreCase("Express (1 Hari)")) {
            biayaPengerjaan = 4000;
        } else if (waktuPengerjaan.equalsIgnoreCase("Standar (3 Hari)")) {
            biayaPengerjaan = 2000;
        } else if (waktuPengerjaan.equalsIgnoreCase("Hemat (5 Hari)")) {
            biayaPengerjaan = 1000;
        } else {
            biayaPengerjaan = 0;
        }
        return biayaPengerjaan;
    }
}
