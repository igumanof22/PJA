package Materi_pja090919;

import javax.swing.JOptionPane;

public class InputJOption {
    private int x;
    private int y;
    
    public int getTambah(){
        return x + y;
    }
    
    public int getKurang(){
        return x - y;
    }
    
    public int getKali(){
        return x * y;
    }
    
    public int getBagi(){
        return x / y;
    }
    
    public int getMod(){
        return x % y;
    }
    
    public boolean cekGanjil(){
        return (x%2 != 0) || (y%2 != 0);
    }
    
    public boolean cekGenap(){
        return (x%2 == 0) || (y%2 == 0);
    }
 

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void print(){
        System.out.println("Angka 1 : "+x);
        System.out.println("Angka 2 : "+y);
        System.out.println(x+" + "+y+" = "+ getTambah());
    }
    
    public static void main(String[] args) {
//        String name = "";
//        name = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
//        String msg = "Hello "+name+"!";
//        
//        JOptionPane.showMessageDialog(null, msg);
//        -----------------------------------------------------------------------------
//
//        String[] msg = new String[10];
//        
//        String id = "";
//        String nama = "";
//        String alamat = "";
//        String jk = "";
//        String nohp = "";
//        
//        for(int x = 0; x < 3; x++){
//            id = JOptionPane.showInputDialog("Masukkan id : ");
//            nama = JOptionPane.showInputDialog("Masukkan nama : ");
//            alamat = JOptionPane.showInputDialog("Masukkan alamat : ");
//            jk = JOptionPane.showInputDialog("Masukkan jk : ");
//            nohp = JOptionPane.showInputDialog("Masukkan nohp : ");
//            
//            msg[x] = "Id : "+id+"\nNama : "+nama+"\nAlamat : "+alamat+"\nJenis Kelamin : "+jk+"\nNo. Hp : "+nohp;
//        } 
//        for(int x = 0; x < 3; x++){
//            JOptionPane.showMessageDialog(null, msg[x]);
//        }
//        -----------------------------------------------------------------------------------------------------------------

        InputJOption a = new InputJOption();
        a.x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka 1 : "));
        a.y = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka 2 : "));
        
        
        JOptionPane.showMessageDialog(null, "Angka 1 : "+a.x
                +"\nAngka 2 : "+a.y
                +"\n"+a.x+" + "+a.y+" = "+a.getTambah()
                +"\n"+a.x+" - "+a.y+" = "+a.getKurang()
                +"\n"+a.x+" * "+a.y+" = "+a.getKali()
                +"\n"+a.x+" / "+a.y+" = "+a.getBagi()
                +"\nSisa = "+a.getMod()
                +"\nCek Angka 1 Genap : "+a.cekGenap());
        
    }
    
}
