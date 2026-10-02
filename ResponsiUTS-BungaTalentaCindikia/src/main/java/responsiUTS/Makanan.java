/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author hi
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa; // Atribut khusus makanan

    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga); // Memanggil constructor kelas induk (Produk)
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan info dari Produk (nama & harga)
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}
