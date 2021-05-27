package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan4_Pangkat_For {
    public static void main(String[] args) {
        int z;
        int w;
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Bilangan : "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Pangkatnya : "));
        
        w = x;
        
        for(z = 1; z < y; z++){
            int hasil = x*w;
            x = hasil;
        }
        JOptionPane.showMessageDialog(null, x);
    }
    
}
