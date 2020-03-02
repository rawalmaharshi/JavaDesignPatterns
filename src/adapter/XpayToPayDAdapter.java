package adapter;

/**
 * X is the interface that PayD is implemented to
 * */
public class XpayToPayDAdapter implements PayD {
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer CVVNo;
    private Double totalAmount;

    private final Xpay xpay;

    public XpayToPayDAdapter (Xpay xpay) {
        this.xpay = xpay;
        setProp();
    }

    @Override
    public String getCustCardNo () {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName () {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate () {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo () {
        return CVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo (String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName (String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate (String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo (Integer CVVNo) {
        this.CVVNo = CVVNo;
    }

    @Override
    public void setTotalAmount (Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp() {
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo((this.xpay.getCreditCardNo()));
        setCardExpMonthDate(this.xpay.getCardExpMonth() + "/" + this.xpay.getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount((this.xpay.getAmount()));
    }
}
