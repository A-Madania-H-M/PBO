/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek dari seluruh subclass
        Elektronik elektronik = new Elektronik("Redmi 12", 300000, 5);
        Makanan makanan = new Makanan("Ayam Goreng Crispy", 8000, "15-05-2024");
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Ishtar Inanna", 700000, 200000);
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak("Ereshkigal Ir", 400000, 24);

        //Menggunakan objek
        elektronik.tampilkaninfo();
        System.out.println();
        makanan.tampilkaninfo();
        System.out.println();
        pegawaiTetap.tampilkaninfo();
        System.out.println();
        pegawaiKontrak.tampilkaninfo();
    }
}