/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Tamao");
        kucing.tampilkanInfo();
        kucing.suara();
        
        System.out.println();

        Anjing anjing = new Anjing("Zacian");
        anjing.tampilkanInfo();
        anjing.suara();
    }
}
 

