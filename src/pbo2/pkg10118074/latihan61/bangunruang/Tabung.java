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
public class Tabung implements BangunDatar{
    int jarijari;
    int tinggi;

    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    

    @Override
    public double hitungVolume() {
        return 4*Math.PI*(jarijari*jarijari)*tinggi;
    }
    
   
    
}
    
   
    
    
    

