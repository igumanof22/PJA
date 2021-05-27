//BufferedReader Tidak Harus Pakai "try'
package Materi_pja100919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedReader {
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        String nama = "";
//        System.out.print("Masukkan Nama Anda : ");
//        
//        try{
//            nama = dataIn.readLine();
//        }catch(IOException e){
//            System.out.println("Error....");
//        }
//        
//        System.out.println("Heloo... "+nama+"!");
//---------------------------------------------------------------------------------------
        
//        String id = "";
//        String nama = "";
//        String alamat = "";
//        String jk = "";
//        String nohp = "";
//
//        
//        try{
//            System.out.print("Masukkan Id : ");
//            id = dataIn.readLine();
//            
//            System.out.print("Masukkan Nama : ");
//            nama = dataIn.readLine();  
//            
//            System.out.print("Masukkan Alamat : ");
//            alamat = dataIn.readLine();
//            
//            System.out.print("Masukkan Jenis Kelamin : ");
//            jk = dataIn.readLine();
//        
//            System.out.print("Masukkan No. Hp : ");
//            nohp = dataIn.readLine();
//        }catch(IOException e){
//            System.out.println("Error.... "+e);
//        }
//        
//        System.out.println();
//        System.out.println(id);
//        System.out.println(nama);
//        System.out.println(alamat);
//        System.out.println(jk);
//        System.out.println(nohp);
//---------------------------------------------------------------------------------------------
        
        InputBufferedReader a = new InputBufferedReader() ;
        System.out.print("Masukkan Angka 1 = ");
        String x = dataIn.readLine();
        System.out.print("Masukkan Angka 2 = ");
        String y = dataIn.readLine();
        
        a.x = Integer.parseInt(x);
        a.y = Integer.parseInt(y);
                
        System.out.println("\nAngka 1 : "+a.x
                +"\nAngka 2 : "+a.y
                +"\n"+a.x+" + "+a.y+" = "+a.getTambah()
                +"\n"+a.x+" - "+a.y+" = "+a.getKurang()
                +"\n"+a.x+" * "+a.y+" = "+a.getKali()
                +"\n"+a.x+" / "+a.y+" = "+a.getBagi()
                +"\nSisa = "+a.getMod()
                +"\nCek Angka 1 Genap : "+a.cekGenap());
//--------------------------------------------------------------------------------------------------
    }    
}
