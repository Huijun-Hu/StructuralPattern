package src;

public class LoyaltyStatus {
    private String customerName;
    private boolean status;

    public LoyaltyStatus(String name, boolean status) {
        this.customerName = name;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
