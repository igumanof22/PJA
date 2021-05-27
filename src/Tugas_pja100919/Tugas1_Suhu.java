package Tugas_pja100919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas1_Suhu {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("masukkan Nilai Derajat Celcius : ");
        String cel = dataIn.readLine();
        
        double c = Double.parseDouble(cel);
        
        double f = 1.8*c+32;
        double r = 0.8*c;
        
        System.out.println("\nHasil Konversi : ");
        System.out.println("Derajat Fahrenheit : "+f);
        System.out.println("Derajat Reamur     : "+r);
    }
    
}
