/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Acer
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Mobil (bukan Kendaraan)
        pekerja worker = new pekerja("Andi", 25, "Software Engineer", 4000000);
        
        // Menampilkan informasi kendaraan
        worker.infopekerja();
        
        // Mengubah nama kendaraan
        worker.setNama("Budi");
        System.out.println();
        System.out.println("Nama baru: " + worker.getNama());
        
        // Menampilkan informasi spesifik mobil
        worker.DescPekerja();
    }
}

