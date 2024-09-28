/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_kendaraan;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("Nissan March", 200, 4, 4);
        mobil.tampilkanInfo();

        System.out.println();
        
        // Membuat objek SepedaMotor
        SepedaMotor sepedaMotor = new SepedaMotor("Yamaha Fazzio", 160, 2, "125 cc");
        sepedaMotor.tampilkanInfo();
    }
}