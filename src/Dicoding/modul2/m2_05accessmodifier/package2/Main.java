package dicoding.modul2.m2_05accessmodifier.package2;
import dicoding.modul2.m2_05accessmodifier.package1.KelasA;

/**
 *
 * @author GUMANOF
 */
public class Main {
    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error
        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.functionB());
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);
        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
