package string.collection_prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public
class ContractTest {

    public static
    void main (String[] args) {

        Map<EmployeeKey,String> cache = loadEmpCache ();

        EmployeeKey lookUpKey = new EmployeeKey ( "101","10/10/1984" );
        String empName = cache.get ( lookUpKey );
        System.out.println (empName );
    }

    static
    Map <EmployeeKey, String> loadEmpCache ( ) {
        EmployeeKey ek1 = new EmployeeKey ( "100" , "10/10/1984" );
        EmployeeKey ek2 = new EmployeeKey ( "101" , "10/10/1985" );
        EmployeeKey ek3 = new EmployeeKey ( "102" , "10/10/1986" );
        EmployeeKey ek4 = new EmployeeKey ( "104" , "10/10/1987" );


        Map<EmployeeKey,String> cache = new HashMap <> (  );
        cache.put ( ek1,"Bob" );
        cache.put ( ek2,"Rob" );
        cache.put ( ek3,"Tob" );
        cache.put ( ek4,"Yob" );

        return cache;
    }
}

class EmployeeKey {


    String empId;
    String dob;


    public
    EmployeeKey (String theId , String thedob) {

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
