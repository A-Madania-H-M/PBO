/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Kucing dan Anjing
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Cetak suara dari masing-masing hewan
        System.out.println("Kucing mengeluarkan suara: " + kucing.suara());
        System.out.println("Anjing mengeluarkan suara: " + anjing.suara());
    }
}
