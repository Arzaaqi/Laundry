package Logic;

public class KalkulatorHarga {

    private OrderItem item;

    public KalkulatorHarga(OrderItem item) {
        this.item = item;
    }

    public double calculatePrice() {
        InterfaceKalkulator kalkulator;
        double jenisCucianPrice = 0;
        double waktuPengerjaanPrice = 0;

        switch (item.getItemType()) {
            case PAKAIAN:
                kalkulator = new KalkulatorPakaian();
                jenisCucianPrice = kalkulator.calculateJenisCucianPrice(item.getJenisCuci());
                waktuPengerjaanPrice = kalkulator.calculateWaktuPengerjaanPrice(item.getWaktuPengerjaan());
                return item.getBerat() * jenisCucianPrice + waktuPengerjaanPrice;

            case SELIMUT:
                kalkulator = new KalkulatorSelimut();
                jenisCucianPrice = kalkulator.calculateJenisCucianPrice(item.getJenisCuci());
                waktuPengerjaanPrice = kalkulator.calculateWaktuPengerjaanPrice(item.getWaktuPengerjaan());
                return item.getJumlah() * jenisCucianPrice + waktuPengerjaanPrice;

            case SEPATU:
                kalkulator = new KalkulatorSepatu();
                waktuPengerjaanPrice = kalkulator.calculateWaktuPengerjaanPrice(item.getWaktuPengerjaan());
                return item.getJumlah() + waktuPengerjaanPrice;

            case KARPET:
                kalkulator = new KalkulatorKarpet();
                jenisCucianPrice = kalkulator.calculateJenisCucianPrice(item.getJenisCuci());
                waktuPengerjaanPrice = kalkulator.calculateWaktuPengerjaanPrice(item.getWaktuPengerjaan());
                return item.getJumlah() * jenisCucianPrice + waktuPengerjaanPrice;

            default:
                return 0;
        }
    }

}
