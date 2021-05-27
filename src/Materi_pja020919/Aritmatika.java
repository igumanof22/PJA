/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja020919;

/**
 *
 * @author LABSIKOMP
 */
public class Aritmatika {
    private int x;
    private int y;
    
    public int getTambah(){
        return x + y;
    }
    
    public int getKurang(){
        return x - y;
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
        System.out.println("Angka 1 : "+x);
        System.out.println(x+" + "+y+" = "+ getTambah());
    }

    
    
    public static void main(String[] args) {
        Aritmatika a = new Aritmatika();
        a.x = 10;
        a.y = 11;
        
        System.out.println("Angka 1 = "+a.x);
        System.out.println("Angka 2 = "+a.y);
        System.out.println("Angka 1 + Angka 2 = "+a.getTambah());
        System.out.println("Angka 1 - Angka 2 = "+a.getKurang());
        System.out.println("Apakah Angka 1 Bilangan Genap : "+a.cekGenap());
        
        
//        if(a.x%2 != 0){
//            System.out.println("Angka 1 : "+a.x+" adalah Angka Ganjil");
//        }else{
//            System.out.println("Angka 1 : "+a.x+" adalah Angka Genap");
//        }
//        
//        if(a.y%2 != 0){
//            System.out.println("Angka 2 : "+a.y+" adalah Angka Ganjil");
//        }else{
//            System.out.println("Angka 2 : "+a.y+" adalah Angka Genap");
//        }
    }
}
