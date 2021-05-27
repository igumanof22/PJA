package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan4_Pangkat_While {
    public static void main(String[] args) {
        int z = 1;
        int w;
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Bilangan : "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Pangkatnya : "));
        
        w = x;
        
        while(z<y){
            int hasil = x*w;
            x = hasil;
            z++;
        }
        JOptionPane.showMessageDialog(null, x);
    }
    
}
