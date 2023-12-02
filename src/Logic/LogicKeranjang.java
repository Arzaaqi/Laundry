package Logic;

public class LogicKeranjang {

    private double beratCucianBaju;
    private String jenisCuciBaju;
    private String waktuPengerjaanBaju;

    private int jumlahCucianSelimut;
    private String jenisCuciSelimut;
    private String waktuPengerjaanSelimut;

    private int jumlahCucianSepatu;
    private String waktuPengerjaanSepatu;

    private int jumlahCucianKarpet;
    private String waktuPengerjaanKarpet;

    public double getBeratCucianBaju() {
        return beratCucianBaju;
    }

    public void setBeratCucianBaju(double beratCucianBaju) {
        this.beratCucianBaju = beratCucianBaju;
    }

    public String getJenisCuciBaju() {
        return jenisCuciBaju;
    }

    public void setJenisCuciBaju(String jenisCuciBaju) {
        this.jenisCuciBaju = jenisCuciBaju;
    }

    public String getWaktuPengerjaanBaju() {
        return waktuPengerjaanBaju;
    }

    public void setWaktuPengerjaanBaju(String waktuPengerjaanBaju) {
        this.waktuPengerjaanBaju = waktuPengerjaanBaju;
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

    public double hargaBaju() {
        if (jenisCuciBaju == null || waktuPengerjaanBaju == null || beratCucianBaju == 0) {
            return 0;
        } else {
            KalkulatorPakaian baju = new KalkulatorPakaian();
            baju.setBerat(beratCucianBaju);
            baju.setJenisCucian(jenisCuciBaju);
            baju.setJenisPengerjaan(waktuPengerjaanBaju);
            return baju.hitung();
        }
    }

    public double hargaSelimut() {
        if (jenisCuciSelimut == null || waktuPengerjaanSelimut == null || jumlahCucianSelimut == 0) {
            return 0;
        } else {
            KalkulatorSelimut selimut = new KalkulatorSelimut();
            selimut.setJenisCucian(jenisCuciSelimut);
            selimut.setJenisPengerjaan(waktuPengerjaanSelimut);
            selimut.setJumlah(jumlahCucianSelimut);
            return selimut.hitung();
        }

    }

    public double hargaSepatu() {
        if (waktuPengerjaanSepatu == null || jumlahCucianSepatu == 0) {
            return 0;
        } else {
            KalkulatorSepatu sepatu = new KalkulatorSepatu();
            sepatu.setJenisPengerjaan(waktuPengerjaanSepatu);
            sepatu.setJumlah(jumlahCucianSepatu);
            return sepatu.hitung();
        }
    }

    public double hargaKarpet() {
        if (waktuPengerjaanKarpet == null || jumlahCucianKarpet == 0) {
            return 0;
        } else {
            KalkulatorKarpet karpet = new KalkulatorKarpet();
            karpet.setJenisPengerjaan(waktuPengerjaanKarpet);
            karpet.setJumlah(jumlahCucianKarpet);
            return karpet.hitung();
        }
    }

    public double getTotalHarga() {
        double total = hargaBaju() + hargaKarpet() + hargaSelimut() + hargaSepatu();
        return total;
    }

    public double updateHarga(Order order) {
        setBeratCucianBaju(order.getBeratCucianBaju());
        setJenisCuciBaju(order.getJenisCuciBaju());
        setWaktuPengerjaanBaju(order.getWaktuPengerjaanBaju());

        setJumlahCucianSelimut(order.getJumlahCucianSelimut());
        setJenisCuciSelimut(order.getJenisCuciSelimut());
        setWaktuPengerjaanSelimut(order.getWaktuPengerjaanSelimut());

        setJumlahCucianSepatu(order.getJumlahCucianSepatu());
        setWaktuPengerjaanSepatu(order.getWaktuPengerjaanSepatu());

        setJumlahCucianKarpet(order.getJumlahCucianKarpet());
        setWaktuPengerjaanKarpet(order.getWaktuPengerjaanKarpet());
        
        return getTotalHarga();
    }
}
