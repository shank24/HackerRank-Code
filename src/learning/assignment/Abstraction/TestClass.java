package learning.assignment.Abstraction;

public
class TestClass {
    public static
    void main (String[] args) {
        HP hp = new HPNoteBook ( );
        hp.scroll ( );
        hp.click ( );

        DELL dell = new DellNoteBook ( );
        dell.scroll ( );
        dell.click ( );
    }
}
