/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_kendaraan;

/**
 *
 * @author Acer
 */
public class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    SepedaMotor(String nama, int kecepatan, int jumlahRoda, String jenisMesin) {
        super(nama, kecepatan, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}


