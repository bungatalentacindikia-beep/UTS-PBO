/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author hi
 */
public class Elektronik extends Produk {
    private int garansi; // Atribut khusus elektronik (dalam tahun)

    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); // Memanggil constructor kelas induk (Produk)
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan info dari Produk (nama & harga)
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
