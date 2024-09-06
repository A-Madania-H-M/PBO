/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobila = new Mobil("Toyota", "Corolla", 1999, "Sport");
        Mobil mobilb = new Mobil("Subaru", "WRX", 2010, "Sedan");
        mobila.displayInfo();
        mobila.startEngine();
        System.out.println();
        
        mobilb.displayInfo();
        mobilb.startEngine();
        System.out.println();
        
        mobila.setJenis("Sedan");
        System.out.println("Setelah perubahan jenis:");
        mobila.displayInfo();
    }
}