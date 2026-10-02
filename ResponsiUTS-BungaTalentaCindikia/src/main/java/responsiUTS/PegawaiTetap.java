/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author hi
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan; // Atribut khusus pegawai tetap

    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji); // Memanggil constructor kelas induk (Pegawai)
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan info dari Pegawai (nama & gaji)
        System.out.println("Tunjangan: " + (long) tunjangan);
    }
}
