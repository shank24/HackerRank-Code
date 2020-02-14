package learning.Stream;

import java.io.*;

public
class FileOutputStreamDemo {
    public static
    void main (String[] args) throws IOException {
        FileInputStream  fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream ( new File ( "/home/shanky/Downloads/pic.jpg" ) );
            fos = new FileOutputStream ( "/home/shanky/Downloads/image.jpg" );
            int data;

            while ((data = fis.read ( )) != -1) {
                fos.write ( data );
            }
            System.out.println ("File Copied" );
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
        catch (IOException e) {
            e.printStackTrace ( );
        }
        finally {
            fis.close ();
            fos.close ();
        }

    }
}
