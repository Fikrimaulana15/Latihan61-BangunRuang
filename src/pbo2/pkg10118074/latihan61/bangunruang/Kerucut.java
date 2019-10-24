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
public class Kerucut implements BangunDatar{
    int tinggi;
    int jarijari;

    public int getTinggi() {
        return tinggi;
    }

    public int getJarijari() {
        return jarijari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungVolume() {
        return Math.PI*(jarijari*jarijari)*(tinggi/3);
    }
    
    
    
    
}
