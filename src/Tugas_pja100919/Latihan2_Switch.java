package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan2_Switch {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Angka 1 -10 : "));
        
        switch(x){
            case 1: JOptionPane.showMessageDialog(null, "Satu"); break;
            case 2: JOptionPane.showMessageDialog(null, "Dua"); break;
            case 3: JOptionPane.showMessageDialog(null, "Tiga"); break;
            case 4: JOptionPane.showMessageDialog(null, "Empat"); break;
            case 5: JOptionPane.showMessageDialog(null, "Lima"); break;
            case 6: JOptionPane.showMessageDialog(null, "Enam"); break;
            case 7: JOptionPane.showMessageDialog(null, "Tujuh"); break;
            case 8: JOptionPane.showMessageDialog(null, "Delapan"); break;
            case 9: JOptionPane.showMessageDialog(null, "Sembilan"); break;
            case 10: JOptionPane.showMessageDialog(null, "Sepuluh"); break;
            default: JOptionPane.showMessageDialog(null, "Invalid Number"); break;
        }
    }
    
}
