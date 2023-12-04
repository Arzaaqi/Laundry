package Logic;

public class LogicKeranjang {

    private double beratCucianPakaian;
    private String jenisCuciPakaian;
    private String waktuPengerjaanPakaian;

    private int jumlahCucianSelimut;
    private String jenisCuciSelimut;
    private String waktuPengerjaanSelimut;

    private int jumlahCucianSepatu;
    private String waktuPengerjaanSepatu;

    private int jumlahCucianKarpet;
    private String waktuPengerjaanKarpet;

    public double getBeratCucianPakaian() {
        return beratCucianPakaian;
    }

    public void setBeratCucianPakaian(double beratCucianPakaian) {
        this.beratCucianPakaian = beratCucianPakaian;
    }

    public String getJenisCuciPakaian() {
        return jenisCuciPakaian;
    }

    public void setJenisCuciPakaian(String jenisCuciPakaian) {
        this.jenisCuciPakaian = jenisCuciPakaian;
    }

    public String getWaktuPengerjaanPakaian() {
        return waktuPengerjaanPakaian;
    }

    public void setWaktuPengerjaanPakaian(String waktuPengerjaanPakaian) {
        this.waktuPengerjaanPakaian = waktuPengerjaanPakaian;
    }

    public int getJumlahCucianSelimut() {
        return jumlahCucianSelimut;
    }

    public void setJumlahCucianSelimut(int jumlahCucianSelimut) {
        this.jumlahCucianSelimut = jumlahCucianSelimut;
    }

    public String getJenisCuciSelimut() {
        return jenisCuciSelimut;
    }

    public void setJenisCuciSelimut(String jenisCuciSelimut) {
        this.jenisCuciSelimut = jenisCuciSelimut;
    }

    public String getWaktuPengerjaanSelimut() {
        return waktuPengerjaanSelimut;
    }

    public void setWaktuPengerjaanSelimut(String waktuPengerjaanSelimut) {
        this.waktuPengerjaanSelimut = waktuPengerjaanSelimut;
    }

    public int getJumlahCucianSepatu() {
        return jumlahCucianSepatu;
    }

    public void setJumlahCucianSepatu(int jumlahCucianSepatu) {
        this.jumlahCucianSepatu = jumlahCucianSepatu;
    }

    public String getWaktuPengerjaanSepatu() {
        return waktuPengerjaanSepatu;
    }

    public void setWaktuPengerjaanSepatu(String waktuPengerjaanSepatu) {
        this.waktuPengerjaanSepatu = waktuPengerjaanSepatu;
    }

    public int getJumlahCucianKarpet() {
        return jumlahCucianKarpet;
    }

    public void setJumlahCucianKarpet(int jumlahCucianKarpet) {
        this.jumlahCucianKarpet = jumlahCucianKarpet;
    }

    public String getWaktuPengerjaanKarpet() {
        return waktuPengerjaanKarpet;
    }

    public void setWaktuPengerjaanKarpet(String waktuPengerjaanKarpet) {
        this.waktuPengerjaanKarpet = waktuPengerjaanKarpet;
    }

    public double hargaPakaian() {
        if (jenisCuciPakaian == null || waktuPengerjaanPakaian == null || beratCucianPakaian == 0) {
            return 0;
        } else {
            InterfaceKalkulator kalkulatorPakaian = new KalkulatorPakaian();
            return (beratCucianPakaian * kalkulatorPakaian.calculateJenisCucianPrice(jenisCuciPakaian) + kalkulatorPakaian.calculateWaktuPengerjaanPrice(waktuPengerjaanPakaian));
        }
    }

    public double hargaSelimut() {
        if (jenisCuciSelimut == null || waktuPengerjaanSelimut == null || jumlahCucianSelimut == 0) {
            return 0;
        } else {
            InterfaceKalkulator kalkulatorSelimut = new KalkulatorSelimut();
            return (jumlahCucianSelimut * kalkulatorSelimut.calculateJenisCucianPrice(jenisCuciSelimut) + kalkulatorSelimut.calculateWaktuPengerjaanPrice(waktuPengerjaanSelimut));
        }
    }

    public double hargaSepatu() {
        if (waktuPengerjaanSepatu == null || jumlahCucianSepatu == 0) {
            return 0;
        } else {
            InterfaceKalkulator kalkulatorSepatu = new KalkulatorSepatu();
            return (jumlahCucianSepatu * kalkulatorSepatu.calculateWaktuPengerjaanPrice(waktuPengerjaanSepatu));
        }
    }

    public double hargaKarpet() {
        if (waktuPengerjaanKarpet == null || jumlahCucianKarpet == 0) {
            return 0;
        } else {
            InterfaceKalkulator kalkulatorKarpet = new KalkulatorKarpet();
            return (jumlahCucianKarpet * kalkulatorKarpet.calculateWaktuPengerjaanPrice(waktuPengerjaanKarpet));
        }
    }

    public double getTotalHarga() {
        return (hargaPakaian() + hargaSelimut() + hargaSepatu() + hargaKarpet());
    }

    public double updateHarga(Order order) {
        for (OrderItem item : order.getOrderItems()) {
            switch (item.getItemType()) {
                case PAKAIAN:
                    setBeratCucianPakaian(item.getBerat());
                    setJenisCuciPakaian(item.getJenisCuci());
                    setWaktuPengerjaanPakaian(item.getWaktuPengerjaan());
                    break;
                case SELIMUT:
                    setJumlahCucianSelimut(item.getJumlah());
                    setJenisCuciSelimut(item.getJenisCuci());
                    setWaktuPengerjaanSelimut(item.getWaktuPengerjaan());
                    break;
                case SEPATU:
                    setJumlahCucianSepatu(item.getJumlah());
                    setWaktuPengerjaanSepatu(item.getWaktuPengerjaan());
                    break;
                case KARPET:
                    setJumlahCucianKarpet(item.getJumlah());
                    setWaktuPengerjaanKarpet(item.getWaktuPengerjaan());
                    break;
            }
        }

        return getTotalHarga();
    }

}
