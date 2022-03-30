public interface Payable impliments Employee {


    default double getPaymentAmt() {
        return 0;
    }
}
