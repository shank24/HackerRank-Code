package learning.exception;

public
class Test {
    public static
    void main (String[] args) throws CheckedCustomException {
        //throw new UncheckedCustomException ( "Business Exception Occured" );
        throw new CheckedCustomException ( "Business Again" );
    }
}
