package dicoding.modul3.m3_05dateTime;

/**
 *
 * @author GUMANOF
 */
public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
    }
}
