package dicoding.modul2.m2_01kelas;

/**
 *
 * @author GUMANOF
 */
public class KucingAnggora {
    String nama_kucing;
    int berat_badan;
    
    //ini adalah contoh parameterized constructor
    //dengan memberikan nilai awal data member nama_kucing dan berat_badan
    //dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        nama_kucing = nama;
        berat_badan = berat;
    }
}
