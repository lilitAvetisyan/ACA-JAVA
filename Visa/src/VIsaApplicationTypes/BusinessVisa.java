package VIsaApplicationTypes;

/**
 * Created by Lill on 8/21/16.
 */
public class BusinessVisa extends VisaApplication {
    public  final int businessVisaPrice = 200;
    private String companyName;
    private boolean hasInvitationLetter;
    private int durationDays;


    public BusinessVisa(String companyName, int durationDays)
    {
        this.companyName = companyName;
        this.durationDays = durationDays;
        this.hasInvitationLetter = false;
    }

    public boolean isHasInvitationLetter() {
        return hasInvitationLetter;
    }
    public void payFee()
    {
        fee.setIsPaid(true);

    }

    public void setHasInvitationLetter(boolean hasInvitationLetter) {
        this.hasInvitationLetter = hasInvitationLetter;
    }
}
