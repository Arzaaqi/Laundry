# Plystarios - Aplikasi Laundry

Aplikasi desktop sederhana untuk mengelola pesanan laundry. Proyek ini dibuat
dengan Java Swing dan form GUI NetBeans.

## Fitur

- Membuat pesanan berdasarkan jenis layanan dan berat cucian.
- Menghitung total harga: Cuci Kering Rp8.000/kg dan Cuci + setrika Rp10.000/kg.
- Mencatat nama dan nomor telepon pelanggan.
- Memilih pembayaran sekarang atau nanti.
- Mencari pesanan menggunakan nama dan nomor telepon.
- Melihat daftar pesanan dan detailnya melalui menu admin.

## Persyaratan

- JDK 20 atau lebih baru.
- Apache Ant untuk menjalankan perintah build dari terminal.
- NetBeans IDE direkomendasikan karena proyek menggunakan form GUI NetBeans
  dan library `AbsoluteLayout`.

Pastikan library `AbsoluteLayout` tersedia di konfigurasi library NetBeans
sebagai `absolutelayout`, sesuai referensi di `nbproject/project.properties`.

## Menjalankan aplikasi

### Dengan NetBeans

1. Buka folder proyek ini sebagai proyek NetBeans.
2. Pastikan proyek menggunakan JDK 20 atau lebih baru.
3. Pastikan library `AbsoluteLayout` sudah terkonfigurasi.
4. Jalankan proyek dengan **Run Project**. Titik masuk aplikasi adalah
   `LaundryApplication.MainMenu`.

### Dengan Apache Ant

Jalankan dari direktori utama proyek:

```shell
ant clean
ant jar
ant run
```

Perintah tersebut memerlukan JDK yang sesuai serta konfigurasi library
`AbsoluteLayout` yang dapat diakses oleh Ant.

## Login admin demo

- Username: `Admin`
- Password: `123`

Kredensial tersebut ditetapkan langsung di source code dan hanya ditujukan
untuk demonstrasi. Jangan gunakan konfigurasi ini untuk aplikasi produksi.

## Struktur proyek

```text
src/
  LaundryApplication/   Antarmuka Swing dan alur aplikasi
  Source/               Model pelanggan, pesanan, dan transaksi
nbproject/               Konfigurasi proyek NetBeans
build.xml                Skrip build Ant
```

Data transaksi disimpan sementara di memori selama aplikasi berjalan; data
akan hilang ketika aplikasi ditutup. Proyek ini belum menggunakan database
atau penyimpanan permanen.
