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
public class Mobil extends Kendaraan{
    protected double Harga;
    
    public String getMerk(){
        return Merk;
    }
    
    public String getWarna(){
        return Warna;
    }
    
    public double getHarga(){
        return Harga;
    }
    
    public void setMerk(String merk){
        this.Merk = merk;
    }
    
    public void setWarna(String warna){
        this.Warna = warna;
    }
    
    public void setHarga(double harga){
        this.Harga = harga;
    }
    
    
}
