package learning.string.immutable;

public
class ImmutableDemo {

    public static
    void main (String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println ("Before Concat" );
        System.out.println (s1 );
        System.out.println (s2 );

        System.out.println (s1.concat ( s2 ) );


        // It is still immutable
        System.out.println ("After Concat" );
        System.out.println (s1 );
        System.out.println (s2 );


    }
}
