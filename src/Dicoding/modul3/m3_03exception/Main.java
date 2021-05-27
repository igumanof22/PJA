package dicoding.modul3.m3_03exception;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author GUMANOF
 */
public class Main {
    public static void main(String[] args) {
//        String location = "D://tempB/namafile.txt";
//        File file = new File(location);
//        FileReader fr = new FileReader(file);

        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("D://tempB/latihan.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }

        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}
