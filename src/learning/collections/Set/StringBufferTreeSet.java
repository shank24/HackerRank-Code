package learning.collections.Set;

import learning.collections.comparator.SBComparator;

import java.util.Set;
import java.util.TreeSet;

public
class StringBufferTreeSet {
    public static
    void main (String[] args) {

        Set <StringBuffer> set = new TreeSet <> (new SBComparator () );
        set.add ( new StringBuffer ( "ABC"  ));
        set.add ( new StringBuffer ( "DEF"  ));
        set.add ( new StringBuffer ( "XYZ"  ));
        set.add ( new StringBuffer ( "MNO"  ));


        for (StringBuffer str : set) {
            System.out.println (str );

        }
    }
}
