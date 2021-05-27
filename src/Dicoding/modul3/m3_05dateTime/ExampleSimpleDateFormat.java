package dicoding.modul3.m3_05dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GUMANOF
 */
public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);
    }
}
