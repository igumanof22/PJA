/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_pja300919;

/**
 *
 * @author LABSIKOMP
 */
public class Kendaraan {
    protected String Merk;
    protected String Warna;
    
    public String getMerk(){
        return Merk;
    }
    
    public String getWarna(){
        return Warna;
    }
    
    public void setMerk(String merk){
        this.Merk = merk;
    }
    
    public void setWarna(String warna){
        this.Warna = warna;
    }
    
    
    
}
