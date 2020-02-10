package learning.interfaces;

public
class Honda implements Car{

    @Override
    public
    void stop ( ) {
        System.out.println ("Inside Honda Stop" );
    }

    @Override
    public
    void go ( ) {
        System.out.println ("Inside Honda Go" );
    }
}
