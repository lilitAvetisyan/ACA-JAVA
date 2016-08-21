package VIsaApplicationTypes;

/**
 * Created by Lill on 8/21/16.
 */
public class ApplicationFee {
    int amount;
    boolean isPaid;

    public ApplicationFee(int amount)
    {
        this.amount = amount;
        this.isPaid = false;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
