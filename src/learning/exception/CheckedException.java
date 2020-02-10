package learning.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public
class CheckedException {
    public static
    void main (String[] args) {

        CheckedException ce = new CheckedException ( );
        ce.readFile ( );
    }

    void readFile ( ) {
        try {
            FileInputStream fis = new FileInputStream ( "" );
        }
        catch (FileNotFoundException e) {
            System.out.println ( "File Could not be found" );
        }

    }


}
