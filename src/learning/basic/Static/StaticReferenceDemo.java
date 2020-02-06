package learning.basic.Static;

public
class StaticReferenceDemo {

    static StaticReferenceDemo obj = new StaticReferenceDemo ();

    static {
        System.out.println (StaticReferenceDemo.obj );
        StaticReferenceDemo.obj = init ();
    }

    public static
    void main (String[] args) {
        System.out.println (StaticReferenceDemo.obj );
    }

    // Two different objects pointing to a Different Memory location
    static StaticReferenceDemo init(){
        return new StaticReferenceDemo ();
    }
}
