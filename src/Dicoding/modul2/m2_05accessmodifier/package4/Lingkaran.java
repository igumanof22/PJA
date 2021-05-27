package dicoding.modul2.m2_05accessmodifier.package4;

/**
 *
 * @author GUMANOF
 */
final class Lingkaran {
    static final double PI = 3.141;
    int jari = 7;
 
    final double getLuas() {
        return PI * (jari * jari);
    }
}
