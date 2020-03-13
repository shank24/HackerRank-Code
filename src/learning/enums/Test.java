package learning.enums;

public class Test {
    public static void main(String[] args) {
        PaymentType pt = PaymentType.CASH;
        //System.out.println(pt);

        PaymentType[] values = PaymentType.values();
        for (PaymentType paymentType: values) {
            System.out.println(paymentType);
            System.out.println(paymentType.ordinal());
            System.out.println("$" + paymentType.getFee());
        }

    }
}
