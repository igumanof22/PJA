package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan1_JOptionPane {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai Ujian pertama : "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai Ujian kedua   : "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai Ujian ketiga  : "));
        
        int hasil = (a+b+c)/3;
        
        if(hasil >= 60){
            JOptionPane.showMessageDialog(null, ":)");
        }else{
            JOptionPane.showMessageDialog(null, ":(");
        }
    }    
}
