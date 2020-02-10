package learning.assertions;

public
class AssertTest {
    public static
    void main (String[] args) {
        int withdrawlAmount=300;
        int currentBalance = 200;
        assert(withdrawlAmount<currentBalance)
                :"Withdrawl Amount should be less than current Balance";

    }
}
