/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja170919;

/**
 *
 * @author DENSHIN
 */
public class IdentitasDiri extends Student {
    
    protected String jurusan;
    protected String prodi;
    protected String asalsekolah;
    
    
    
    public static void main(String[] args) {
        IdentitasDiri id = new IdentitasDiri();
        id.name = "Bambang";
        id.address ="Padang";
        id.nobp = "1811081003";
        id.jurusan = "Teknologi Informasi";
        id.prodi = "TRPL";
        id.asalsekolah = "SMA";
        System.out.println("Name = "+id.name);
        System.out.println("Alamat = "+id.address);
        System.out.println("No Bp = "+id.nobp);
        System.out.println("Jurusan = "+id.jurusan);
        System.out.println("Prodi = "+id.prodi);
        System.out.println("Asal  = "+id.asalsekolah);
    }
    
}
