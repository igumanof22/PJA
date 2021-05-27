/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja170919;

/**
 *
 * @author DENSHIN
 */
public class Student extends Person {
    protected String nobp;
    
    
    
    public String getName(){
        System.out.println("Student Name : "+name);
        return name;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }
    
    
    public Student(){
        super ("Deni","Padang");
        System.out.println("Inside Student:Construktor");
    }
    
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Ali";
//        student.address = "Padang";
        student.nobp ="1811081003";
        System.out.println("Nama = "+student.name);
        System.out.println("Alamat = "+student.address);
        System.out.println("No Bp = "+student.nobp);
        
       
    }
    
    
    
    
}
