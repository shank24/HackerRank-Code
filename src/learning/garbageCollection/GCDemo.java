package learning.garbageCollection;


public
class GCDemo {

    int objID;

    GCDemo (int objID) {
        this.objID = objID;

        System.out.println ( "Created " + this.objID );
    }

    public static
    void main (String[] args) {

        new GCDemo ( 1 );
        new GCDemo ( 2 );
        new GCDemo ( 3 );
        new GCDemo ( 4 );


        for (int i = 0; i < 100; i++) {
            System.gc ( );

        }

    }

    //We are overriding the finalize method of the Object Class
    @Override
    protected
    void finalize ( ) {
        System.out.println ( "Finalizing Objects " + objID );
    }
}
