/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Acer
 */
public class Elektronik extends Produk{
    Elektronik(String nama, double harga){
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon(){
        return harga * 0.15; 
    }
}