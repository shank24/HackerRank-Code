package learning.string.immutable;

public
class StringPoolDemo {
    public static
    void main (String[] args) {

        User user1=new User ( 1,"abc" );
        User user2=new User ( 1,"abc" );

        // It is displaying hashcode, because it is mutable
        System.out.println (user1 );
        System.out.println (user2 );

        System.out.println (user1==user2 );
        System.out.println (user1.equals ( user2 ) );
        String s1="abc";
        String s2="abc";
        String s3="abc";

        // It is displaying the values, because it is Immutable.
        System.out.println (s1 );

        // We can check the hashcode for checking the String location
        // they point to the same location
        System.out.println (s1.hashCode () );
        System.out.println (s2.hashCode () );
        System.out.println (s3.hashCode () );


    }
}
