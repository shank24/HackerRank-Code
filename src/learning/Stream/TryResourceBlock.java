package learning.Stream;

import java.io.*;
import java.util.StringTokenizer;

public
class TryResourceBlock {
    public static
    void main (String[] args) throws IOException {


        int count = 0;
        // Here we are defining the resource in try Braces, so we need not
        // think about closing the resources, it is automatically done from the Try block.
        try (FileReader fr = new FileReader ( new File ( "/home/shanky/Downloads/QA Microservices API.postman_collection" ) );
             BufferedReader br = new BufferedReader ( fr );) {


            String line;
            // It returns line of Strings until it reaches the end of Strings
            while ((line = br.readLine ( )) != null) {
                StringTokenizer st = new StringTokenizer ( line );
                while (st.hasMoreTokens ( )) {
                    System.out.println ( st.nextToken ( ) );
                    count++;
                }
            }

            System.out.println ( "Number of words in a file are :" + count );
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
        catch (IOException e) {
            e.printStackTrace ( );
        }

    }
}
