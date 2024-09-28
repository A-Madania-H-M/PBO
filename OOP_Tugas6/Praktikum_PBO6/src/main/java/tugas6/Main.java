/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args){
        Keranjang keranjang = new Keranjang();
        
        Buku buku = new Buku("Bumi", 100000);
        Elektronik elektronik = new Elektronik("Kipas angin", 150000);
        Pakaian pakaian = new Pakaian("Kaos Polos", 70000);
        
        keranjang.addProduk(buku);
        keranjang.addProduk(elektronik);
        keranjang.addProduk(pakaian);
        
        keranjang.List();
        
        double totalHarga = keranjang.hitungTotalHarga();
        System.out.println("Total: " + totalHarga);
    }
}
