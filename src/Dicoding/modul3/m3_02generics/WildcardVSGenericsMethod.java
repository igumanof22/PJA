package dicoding.modul3.m3_02generics;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author GUMANOF
 */
public class WildcardVSGenericsMethod {
    // mengunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }
    
    // menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }
 
    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
