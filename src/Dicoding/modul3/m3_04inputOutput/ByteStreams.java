package dicoding.modul3.m3_04inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author GUMANOF
 */
public class ByteStreams {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
 
       try {
           in = new FileInputStream("D://tempB/latihan_input.txt");
           out = new FileOutputStream("D://tempB/latihan_ouput.txt");
           int c;
 
           while ((c = in.read()) != -1) {
               out.write(c);
           }
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               if (in != null) {
                   in.close();
               }
               if (out != null) {
                   out.close();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
}
