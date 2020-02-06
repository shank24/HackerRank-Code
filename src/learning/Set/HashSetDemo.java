package learning.Set;

import java.util.HashSet;

public
class HashSetDemo {

    public static
    void main (String[] args) {
        HashSet hashSet = new HashSet<>();

        if(hashSet.isEmpty ()){
            hashSet.add ( "Adidas" );
            hashSet.add ( "Java" );
            hashSet.add ( "C++" );
        }

        System.out.println (hashSet );
        System.out.println ( hashSet.size ());

        System.out.println ("Is hash contains \t" + hashSet.contains ( "Java" ) );

        System.out.println (hashSet.spliterator ());
    }

}
