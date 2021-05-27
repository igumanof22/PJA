package dicoding.modul1.m1_06percabangan;

/**
 *
 * @author GUMANOF
 */
public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        char indeksPrestasi;
        if (nilaiUjian >= 90) indeksPrestasi = 'A';
        else if (nilaiUjian >= 80) indeksPrestasi = 'B';
        else if (nilaiUjian >= 70) indeksPrestasi = 'C';
        else if (nilaiUjian >= 60) indeksPrestasi = 'D';
        else if (nilaiUjian >= 50) indeksPrestasi = 'E';
        else indeksPrestasi = 'F';
        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
        String m = (nilaiUjian>=90)?"A":
                ((nilaiUjian>=80)?"B":
                ((nilaiUjian>=70)?"C":
                ((nilaiUjian >= 60)?"D":
                ((nilaiUjian >= 50)?"E":
                "F"))));
        System.out.println(m);
    }
}
