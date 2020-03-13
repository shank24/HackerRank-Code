package learning.enums;

public enum PaymentType {
    DEBIT_CARD(5),CREDIT_CARD(0),CASH(10);

    int fee;

    PaymentType(int fee){
        this.fee=fee;
    }

    public int getFee(){
        return this.fee;
    }
}
