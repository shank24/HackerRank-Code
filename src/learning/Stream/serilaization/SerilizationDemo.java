package learning.Stream.serilaization;

import java.io.*;

public
class SerilizationDemo {
    public static
    void main (String[] args) {

        FileOutputStream   fos;
        ObjectOutputStream oos;

        // .ser is a common extension.
        try {
            fos = new FileOutputStream ( "/home/shanky/Downloads/Emp.ser" );
            oos = new ObjectOutputStream ( fos );

            Employee emp = new Employee ( 1 , "Bharath" , 1000 , 12345 );
            oos.writeObject ( emp );
            System.out.println ( "Serialized Object " + emp );
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
        catch (IOException e) {
            e.printStackTrace ( );
        }


    }
}
