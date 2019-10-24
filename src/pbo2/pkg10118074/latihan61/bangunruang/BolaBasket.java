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
public class BolaBasket implements BangunDatar {
    
    private int jarijari;

    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    
       
 
    public void setjarijari(int jarijari){
        this.jarijari = jarijari;
    }

    @Override
    public double hitungVolume() {
        return 4*Math.PI*(jarijari*jarijari*jarijari)/3;
    }
    
   
        
    
}
