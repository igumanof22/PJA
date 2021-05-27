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
public class ContohPlimorfile {
       public static void main(String[] args) {
        Person ref;
        Student st = new Student();
        Employee em = new Employee();
        
        ref = st;
        String temp = ref.getName();
        System.out.println(temp);
        
//        printInformation(st);
      
        ref = em;
        temp = ref.getName();
        System.out.println(temp);
 
        st.setName("Deni");
        st.setNobp("1811081003");
        st.setAddress("Padang");
        printInformation(st);  
        
        st.setName("Dia");
        st.setNobp("1002");
        st.setAddress("Padang");
        printInformation(em);
//        
    }
        public static void printInformation(Person person){
           if(person instanceof Student){
               System.out.println("Nama : "+person.getName());
               System.out.println("Alamat : "+person.getAddress());
               System.out.println("No BP : "+((Student)person).getNobp());
           }
           else if (person instanceof Employee){
               System.out.println("Nama : "+person.getName());
               System.out.println("Alamat : "+person.getAddress());
       }
}
   }

       
    
       
    
    
    
    

