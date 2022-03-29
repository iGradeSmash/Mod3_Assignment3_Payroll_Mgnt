public interface Payable {


    default double getPaymentAmt() {
        return 0;
    }
}
