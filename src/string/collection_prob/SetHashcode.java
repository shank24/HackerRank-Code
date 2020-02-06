package string.collection_prob;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public
class SetHashcode {


    public static
    void main (String[] args) {

        EmployeeKey12 ek1 = new EmployeeKey12 ( "100" , "10/10/1984" );
        EmployeeKey12 ek2 = new EmployeeKey12 ( "100" , "10/10/1985" );
        EmployeeKey12 ek3 = new EmployeeKey12 ( "100" , "10/10/1986" );
        EmployeeKey12 ek4 = new EmployeeKey12 ( "100" , "10/10/1987" );

        Set<EmployeeKey12> set = new HashSet <> (  );

        set.add ( ek1 );
        set.add ( ek2 );
        set.add ( ek3 );
        set.add ( ek4 );


        System.out.println (set.toString () );
     }

}

class EmployeeKey12 {


    String empId;
    String dob;


    public
    EmployeeKey12 (String theId , String thedob) {

        empId = theId;
        dob = thedob;
    }


    @Override
    public
    boolean equals (Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        EmployeeKey that = (EmployeeKey) o;
        return Objects.equals ( empId , that.empId ) &&
               Objects.equals ( dob , that.dob );
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash ( empId , dob );
    }

}
