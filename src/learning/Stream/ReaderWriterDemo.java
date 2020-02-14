package learning.Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public
class ReaderWriterDemo {

    public static
    void main (String[] args) throws Exception {

        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader ( new File ( "/home/shanky/Downloads/QA Microservices API.postman_collection" ) );

        fw = new FileWriter ( new File ( "/home/shanky/Downloads/File.txt" ) );

        int ch;

        while ((ch = fr.read ( )) != -1) {
            fw.write ( ch );
        }

        fr.close ();
        fw.close ();
    }
}
