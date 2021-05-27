package dicoding.modul3.m3_04inputOutput;
import java.io.File;

/**
 *
 * @author GUMANOF
 */
public class FileNavigation {
    public static void main(String[] args) {
//        String dirname = "/java/latihan1"; //di data D://
//        File file = new File(dirname);
//        // Buat directory
//        file.mkdirs();
        
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file = new File(dirname);
            file.mkdirs();
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
