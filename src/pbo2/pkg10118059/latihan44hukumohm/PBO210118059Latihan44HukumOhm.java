/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan44hukumohm;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
 
public class PBO210118059Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai batre = new Baterai();
        Baterai batre2 = new Baterai(3, 12);
        
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung - ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan");
        
        System.out.println("");
        
        System.out.println("Kuat Arus : " + batre.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batre.getHambatan() + " ohm");
        System.out.println("Hasil Tengangan : " + batre.hitungTegangan());
    }
    
}
