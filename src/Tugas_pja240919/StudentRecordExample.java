/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_pja240919;


/**
 *
 * @author LABSIKOMP
 */
public class StudentRecordExample {
    public static void main(String[] args) throws Exception {
        try{
        StudentRecord anna = new StudentRecord("Anna");
        StudentRecord rasya = new StudentRecord("Rasya");
        //membuat 3 object StudentRecord 
        /*
        StudentRecord anna = new StudentRecord(); 
        StudentRecord ani  = new StudentRecord(); 
        
        
        //Memberi nama siswa 
        anna.setName("Anna");
        */
        
        anna.setAddress("Padang");
        anna.setAge(20);
        anna.setMathgrade(70);
        anna.setEnglishgrade(80);
        anna.setSciencegrade(60);
        
        rasya.setAddress("Padang");
        rasya.setAge(20);
        rasya.setMathgrade(110);
        rasya.setEnglishgrade(100);
        rasya.setSciencegrade(100);
        
        //Menampilkan nama siswa “Anna” 
        System.out.println("Nama           : "+anna.getName());
        System.out.println("Alamat         : "+anna.getAddress());
        System.out.println("Umur           : "+anna.getAge());
        System.out.println("Matematika     : "+anna.getMathgrade());
        System.out.println("Bahasa Inggris : "+anna.getEnglishgrade());
        System.out.println("Sains          : "+anna.getSciencegrade());
        System.out.println("Rata-rata      : "+anna.getAveragegrade());
        System.out.print("\n");
        System.out.println("Nama           : "+rasya.getName());
        System.out.println("Alamat         : "+rasya.getAddress());
        System.out.println("Umur           : "+rasya.getAge());
        System.out.println("Matematika     : "+rasya.getMathgrade());
        System.out.println("Bahasa Inggris : "+rasya.getEnglishgrade());
        System.out.println("Sains          : "+rasya.getSciencegrade());
        System.out.println("Rata-rata      : "+rasya.getAveragegrade());
        
        
        //Menampilkan jumlah siswa 
        System.out.print("\n");
        System.out.println("Count = "+StudentRecord.getStudentCount());
        }catch(Exception exp){
            System.out.println("Error..."+exp.getMessage());
        }
    }
}
