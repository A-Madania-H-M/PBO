/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_override;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing("Neko");
        hewan.bersuara(); // Output: Meow
        Kucing kucing = new Kucing("MiawMiaw");
        kucing.tampilkanInfo();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
        System.out.println();
        
        Anjing anjing = new Anjing("Awooo");
        anjing.tampilkanInfo();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}
