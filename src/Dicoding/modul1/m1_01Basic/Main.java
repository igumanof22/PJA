package dicoding.modul1.m1_01Basic;

import dicoding.modul1.m1_01Basic.kendaraan.Kereta;
import dicoding.modul1.m1_01Basic.kendaraan.Mobil;
import dicoding.modul1.m1_01Basic.kendaraan.Motor;
import dicoding.modul1.m1_01Basic.music.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author GUMANOF
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Gitar.bunyi();
        
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
        
        Date today = new Date();
        System.out.println("Hari ini = "+today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = "+tomorrow);
    }
    
}
