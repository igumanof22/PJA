package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan2_IfElse {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Angka 1 -10 : "));
        
        if(x==1){
            JOptionPane.showMessageDialog(null, "Satu");
        }else if(x == 2){
            JOptionPane.showMessageDialog(null, "Dua");
        }else if(x == 3){
            JOptionPane.showMessageDialog(null, "Tiga");
        }else if(x == 4){
            JOptionPane.showMessageDialog(null, "Empat");
        }else if(x == 5){
            JOptionPane.showMessageDialog(null, "Lima");
        }else if(x == 6){
            JOptionPane.showMessageDialog(null, "Enam");
        }else if(x == 7){
            JOptionPane.showMessageDialog(null, "Tujuh");
        }else if(x == 8){
            JOptionPane.showMessageDialog(null, "Delapan");
        }else if(x == 9){
            JOptionPane.showMessageDialog(null, "Sembilan");
        }else if(x == 10){
            JOptionPane.showMessageDialog(null, "Sepuluh");
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }
    }
}
