package learning.Stream;

import java.io.*;
import java.util.StringTokenizer;

public
class BufferedReaderDemo {
    public static
    void main (String[] args) throws IOException {

        FileReader     fr = null;
        BufferedReader br = null;
        int count=0;

        try {
            fr =new FileReader ( new File ( "/home/shanky/Downloads/QA Microservices API.postman_collection") );
            br = new BufferedReader ( fr );

            String line;
            // It returns line of Strings until it reaches the end of Strings
            while((line=br.readLine ())!=null){
                StringTokenizer st = new StringTokenizer ( line );
                while(st.hasMoreTokens ()){
                    System.out.println (st.nextToken () );
                    count++;
                }
            }

            System.out.println ("Number of words in a file are :" +count );
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
        catch (IOException e) {
            e.printStackTrace ( );
        }
        finally {
            fr.close ();
            br.close ();
        }

    }
}
