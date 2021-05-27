/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja160919;

/**
 *
 * @author DENSHIN
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        String days [] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
        
//        for(i=0;i<days.length;i++){
//            System.out.println("Hari "+days[i]+" Hari ke -: "+(i+1));
//        }
//        while(i<days.length)
//        {
//            System.out.println("Hari "+days[i]+" Hari ke -: "+(i+1));
//            i++;
//        }
//        
  do{
            System.out.println("Hari "+days[i]+" Hari ke -: "+(i+1));
            i++;
        } while(i<days.length);
        
        
        
                }
}
