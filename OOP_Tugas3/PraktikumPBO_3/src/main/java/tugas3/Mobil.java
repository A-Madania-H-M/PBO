/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Acer
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String jenis;
    
    public Mobil(String merk, String model, int tahun, String jenis){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.jenis = jenis;
    }
    public String getMerk() {
        return merk;
    }
    public String getModel() {
        return model;
    }
    public int getTahun() {
        return tahun;
    }
    public String getJenis() {
        return jenis;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public void displayInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jenis: " + jenis);
    }
    public void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }
}
