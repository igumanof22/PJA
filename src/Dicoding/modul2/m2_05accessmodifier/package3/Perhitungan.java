package dicoding.modul2.m2_05accessmodifier.package3;

/**
 *
 * @author GUMANOF
 */
public class Perhitungan {
    public static int nilai = 0;
 
    protected static int getNilai(){
        return nilai;
    }
    
    Perhitungan() {
        nilai++;
    }
//    final int nilai = 5;
// 
//    void ubahNilai(){
//        // Kode di bawah akan menampilkan error
//        nilai = 10;
//    }
}
