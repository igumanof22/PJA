package dicoding.modul1.m1_04string;

/**
 *
 * @author GUMANOF
 */
public class Main {
    public static void main(String[] args) {
        char[] dicodingChar = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChar);
        System.out.println(dicodingString);

//        Mengetahui Panjang String
        int length = dicodingString.length();
        System.out.println(length);
        
//        Mengambil Karakter Dari Sebuah String
        char result = dicodingString.charAt(7);
        System.out.println(result);
    }
}
/**
 * Selain method length() dan charAt(int index), masih banyak method lain yang
 * disediakan oleh kelas String yang bisa mempermudah kita  memanipulasi sebuah teks.
 * Berikut adalah kumpulan beberapa method yang sering digunakan:
No.
	Nama
	Deskripsi
1
	length()
	Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.
2
	charAt(int index)
	Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
3
	format(String format, Object… args)
	Digunakan untuk memformat sebuah string.
4
	substring(int beginIndex)
	Mengembalikan substring berdasarkan indeks yang diberikan.
5
	contains(CharSequence s)
	Mengembalikan true atau false setelah mencocokkan karakter.
6
	equals(Object object)
	Memeriksa apakah nilai objek sama dengan nilai string.
7
	isEmpty()
	Memeriksa apakah sebuah string itu kosong atau tidak.
8
	concat(String s)
	Mengkonsolidasikan sebuah string.
9
	replace(char a, char b)
	Mengganti suatu karakter di dalam string.
10
	indexOf(String a)
	Mengetahui indeks dari sebuah substring.
11
	toLowerCase()
	Mengubah format string menjadi huruf kecil semua.
12
	toUpperCase()
	Mengubah format string menjadi huruf kapital semua.
13
	trim()
	Menghapus spasi awal dan akhir dari string.
14
	valueOf(int value)
	Mengkonversi tipe yang diberikan menjadi sebuah string.
15	compareTo()	Membandingkan dua nilai
 */