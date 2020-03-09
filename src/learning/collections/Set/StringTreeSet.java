package learning.collections.Set;

import learning.collections.comparator.StringComparator;

import java.util.Set;
import java.util.TreeSet;

public
class StringTreeSet {
    public static
    void main (String[] args) {

        Set <String> set = new TreeSet <> (new StringComparator () );
        set.add ( "ABCSFDFD" );
        set.add ( "DEFCCCCCCCCCCCCCCCc" );
        set.add ( "XDSDSDSDSDSDSDSDSYZ" );
        set.add ( "MNO" );

        for (String str : set) {
            System.out.println (str );
        }


    }
}
