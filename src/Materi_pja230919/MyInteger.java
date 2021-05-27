/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja230919;

/**
 *
 * @author LABSIKOMP
 */
public class MyInteger implements Relation{
    public boolean isGreater(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a > nilai_b;
    }
    
    public boolean isLess(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a < nilai_b;
    }
    
    public boolean isEqual(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a == nilai_b;
    }
}
