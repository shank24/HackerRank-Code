package learning.collections.sortingObjects;

import java.util.Set;
import java.util.TreeSet;

public
class Test {

    public static
    void main (String[] args) {
        Set <Employee> set = new TreeSet <> ( new EmpNameComparator ());

        set.add ( new Employee ( 101 , "Obama" ) );
        set.add ( new Employee ( 100 , "John" ) );
        set.add ( new Employee ( 200 , "Shanks" ) );
        set.add ( new Employee ( 2000 , "Abhi" ) );


        for (Employee emp : set) {
            System.out.println ( emp.id );
            System.out.println ( emp.name );
        }
    }
}
