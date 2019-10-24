/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan61.bangunruang;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BolaBasket BolaBasket= new BolaBasket();
        BolaBasket.setJarijari(7);
        System.out.println("hasil :" +BolaBasket.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setJarijari(10);
        tabung.setTinggi(21);
        System.out.println("hasil :" +tabung.hitungVolume());
        
        Kerucut kerucut= new Kerucut();
        kerucut.setJarijari(14);
        kerucut.setTinggi(9);
        System.out.println("hasil :" +kerucut.hitungVolume());
        
        System.out.println("developed by fikri");
        
        
    }
    
}
