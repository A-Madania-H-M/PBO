/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8_contoh;

/**
 *
 * @author Acer
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    abstract void berjalan();    
    
    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}