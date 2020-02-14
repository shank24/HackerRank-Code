package learning.Stream.serilaization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public
class DeserializedDemo {
    public static
    void main (String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream ( "/home/shanky/Downloads/Emp.ser" );

        try {
            ObjectInputStream ois = new ObjectInputStream ( fis );
            Object            o   = ois.readObject ( );
            //Typecasting the Object back to Employee class
            Employee emp = (Employee) o;

            System.out.println ( "Employee ID " + emp.id );
            System.out.println ( "Employee Name " + emp.name );
            System.out.println ( "Employee Salary " + emp.salary );
            System.out.println ( "Employee SSN " + emp.ssn );

        }
        catch (IOException e) {
            e.printStackTrace ( );
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }

    }
}
