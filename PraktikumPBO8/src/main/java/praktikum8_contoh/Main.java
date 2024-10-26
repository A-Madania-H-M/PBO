/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8_contoh;

/**
 *
 * @author Acer
 */
// Kode utama untuk pengujian
public class Main {   
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        sepeda.berjalan();
        sepeda.info();
        System.out.println();
        
        mobil.berjalan();
        mobil.info();
        
    }
}