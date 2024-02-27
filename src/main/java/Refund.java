class Refund extends Transaction {
    private String reason;

    public Refund(int value, String reason) {
        super(value);
        if (value > 0) {
            this.value = -value;
        }
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}