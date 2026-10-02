/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsiUTS;

/**
 *
 * @author hi
 */
public class ResponsiUTSBungaTalentaCindikia {

    public static void main(String[] args) {
        // 1. Output Produk
        System.out.println(" PRODUK ELEKTRONIK ");
        Produk produk1 = new Elektronik("Smartwatch", 2500000, 1); // polimorfisme
        produk1.tampilkanInfo();

        System.out.println(); // Spasi antar baris

        // 2. Output Pegawai
        System.out.println(" DATA PEGAWAI ");
        Pegawai pegawai1 = new PegawaiTetap("BUNGA TALENTA CINDIKIA", 20000000, 50000000);
        pegawai1.tampilkanInfo();

        System.out.println();

        // 3. Output Polimorfisme
        System.out.println(" POLIMORFISME PRODUK & PEGAWAI ");
        Produk produk2 = new Makanan("Dubai chewy cookie", 65000, "2027-11-15");
        produk2.tampilkanInfo();

        System.out.println();

        Pegawai pegawai2 = new PegawaiKontrak("KIA", 4000000, 10);
        pegawai2.tampilkanInfo();
    }
}