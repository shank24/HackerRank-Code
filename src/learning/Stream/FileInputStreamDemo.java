package learning.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public
class FileInputStreamDemo {
    public static
    void main (String[] args) throws IOException {
        FileInputStream fis = null;

        fis =new FileInputStream
                ( new File
                          ( "/home/shanky/Downloads/QA Microservices API.postman_collection"));

        int i;
        // Here -1 signifies, that it reaches the end of the File.
        while((i=fis.read ())!=- 1){
            System.out.print((char)i);
        }
        System.out.println ("File Opened" );

        // Closing the File
        fis.close ();

    }
}
