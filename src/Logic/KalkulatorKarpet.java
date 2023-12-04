package Logic;

public class KalkulatorKarpet implements InterfaceKalkulator {

    @Override
    public int calculateJenisCucianPrice(String jenisCuci) {
        return 0;
    }

    @Override
    public int calculateWaktuPengerjaanPrice(String waktuPengerjaan) {
        int biayaPengerjaan = 0;
        if (waktuPengerjaan.equalsIgnoreCase("Express (1 Hari)")) {
            biayaPengerjaan = 20000;
        } else if (waktuPengerjaan.equalsIgnoreCase("Standar (3 Hari)")) {
            biayaPengerjaan = 15000;
        } else if (waktuPengerjaan.equalsIgnoreCase("Hemat (5 Hari)")) {
            biayaPengerjaan = 10000;
        } else {
            biayaPengerjaan = 0;
        }
        return biayaPengerjaan;
    }
}
