/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi_pja160919;

/**
 *
 * @author LABSIKOMP
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathgrade;
    private double englishgrade;
    private double sciencegrade;
    private double averagegrade;
    private static int studentCount;

    public StudentRecord (String temp){
        studentCount++;
        this.name = temp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathgrade() {
        return mathgrade;
    }

    public void setMathgrade(double mathgrade) {
        this.mathgrade = mathgrade;
    }

    public double getEnglishgrade() {
        return englishgrade;
    }

    public void setEnglishgrade(double englishgrade) {
        this.englishgrade = englishgrade;
    }

    public double getSciencegrade() {
        return sciencegrade;
    }

    public void setSciencegrade(double sciencegrade) {
        this.sciencegrade = sciencegrade;
    }

    public double getAveragegrade() {
        /*
        average = (mathgrade+englishgrade+sciencegrade)/3;
        return average;
        */
        
        double result = 0; 
        result = (mathgrade+englishgrade+sciencegrade)/3; 
        return result;
    }

    public void setAveragegrade(double averagegrade) {
        this.averagegrade = averagegrade;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        StudentRecord.studentCount = studentCount;
    }
    
    
    public static void main(String[] args) {
        
    }
}
