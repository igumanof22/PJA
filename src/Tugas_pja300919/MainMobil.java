/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_pja300919;

import Materi_pja090919.InputJOption;
import javax.swing.JOptionPane;

/**
 *
 * @author LABSIKOMP
 */
public class MainMobil extends Mobil{
    public static void main(String[] args) {
        MainMobil main = new MainMobil();
        InputJOption a = new InputJOption();
        
        main.setMerk(JOptionPane.showInputDialog("Masukkan Merk Mobil"));
        main.setWarna(JOptionPane.showInputDialog("Masukkan Warna"));
        main.setHarga(Double.parseDouble(JOptionPane.showInputDialog("Masukkan Harga")));
        
//        System.out.println(main.getMerk());
//        System.out.println(main.getWarna());
//        System.out.println(main.getHarga());
        
        JOptionPane.showMessageDialog(null, "Merk : "+main.getMerk()+"\nWarna : "+main.getWarna()+"\nHarga : "+main.getHarga());
    }
}
