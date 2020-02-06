package learning.basic.Static;

public
class StaticBlock {

    public static
    void main (String[] args) {

        System.out.println ("DMAIN" );
    }

    // It runs in order
    static {
        System.out.println ("DSFDSFSDF 1" );
    }



    static {
        System.out.println ("DSFDSFSDF 2 " );
    }


    static {
        System.out.println ("DSFDSFSDF 3 " );
    }


    static {
        System.out.println ("DSFDSFSDF 4 " );
    }



}
