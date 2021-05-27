package Tugas_pja160919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nomor_MAX {
    public static void main(String[] args) throws IOException {
        String angka[] = null;
        int a[] = null;
        int max = 0;
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        for(int x = 0;x < 10;x++){
            System.out.print("Masukkan Angka ke-"+(x+1)+" = ");
            angka[x] = dataIn.readLine();
        }
        
        for(int x = 0;x < 10;x++){
            a[x] = Integer.parseInt(angka[x]);
        }
        
        for(int x = 0;x < 10;x++){
            for(int y = 0;y < 10;y++){
                if(a[x] > a[y]){
                    max = a[x];
                }
            }
        }
        System.out.println(max);
    }
    
}
