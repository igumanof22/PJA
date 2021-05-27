package dicoding.modul2.m2_05accessmodifier.package1;

/**
 *
 * @author GUMANOF
 */
public class KelasA {
//    private int memberA = 5;
//    private int functionA() {
//        return memberA;
//    }
//    int functionB() {
//        // Pemanggilan private member dan private function
//        int hasil = functionA() + memberA;
//        return hasil;
//    }
    private int memberA = 5;
    
    char memberB = 'A';
    double memberC = 1.5;
    
    private int functionA() {
        return memberA;
    }
 
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
    
    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
