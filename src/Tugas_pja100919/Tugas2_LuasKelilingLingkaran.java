package Tugas_pja100919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas2_LuasKelilingLingkaran {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Radius Lingkaran : ");
        String R = dataIn.readLine();
        
        double r = Double.parseDouble(R);
        
        double L = 3.14*r*r;
        double K = 2*3.14*(2*r);
        
        System.out.println("\nHasil Perhitungan :");
        System.out.println("Luas Lingkaran      : "+L);
        System.out.println("Keliling Lingkaran  : "+K);
    }
}
