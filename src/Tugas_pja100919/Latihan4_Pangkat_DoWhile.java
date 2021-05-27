package Tugas_pja100919;

import javax.swing.JOptionPane;

public class Latihan4_Pangkat_DoWhile {
    public static void main(String[] args) {
        int z = 1;
        int w;
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Bilangan : "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Pangkatnya : "));
        
        w = x;
        
        do{
            int hasil = x*w;
            x = hasil;
            z++;
        }while(z<y);
        JOptionPane.showMessageDialog(null, x);
    }    
}
