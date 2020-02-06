package learning.basic.NonStatic;

public
class ThisKeywordDemo {
    int x;

    ThisKeywordDemo(){
        // Points to Object reference
        System.out.println (this );

        // Use it only Non-static context
        System.out.println (this.x );
    }

    public static
    void main (String[] args) {
        new ThisKeywordDemo ();
        new ThisKeywordDemo ();
    }
}
