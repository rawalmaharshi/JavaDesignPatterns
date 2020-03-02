package adapter;

public class RunAdapterExample {

    public static void main(String[] args) {

        //Object Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("1000-2000-3000-4000");
        xpay.setCustomerName("Maharshi Rawal");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2500.47);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
