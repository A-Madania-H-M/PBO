/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_tugas9;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dengan harga tertentu
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 2000.0; // Contoh harga
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); // Output: 200.0
        
        // Membuat objek Makanan dengan harga tertentu
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 100.0; // Contoh harga
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan)); // Output: 5.0
    }
}