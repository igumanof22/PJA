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
public class ContohAritmatika {
    public static void main(String[] args) {
        Aritmatika a = new Aritmatika();
        a.setX(12);
        a.setY(13);
        
//        System.out.println(a.getX());
//        System.out.println(a.getY());
//        System.out.println(a.getTambah());
        a.print();
        System.out.println(a.getKurang());
    }
}
