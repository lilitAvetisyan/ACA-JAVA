package User;

import VIsaApplicationTypes.ApplicationFee;

import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Lill on 8/21/16.
 */
public class Applicant {

    private UUID passportNumber;
    private Calendar passportExpirationDate;
    private String fullName;
    String purpose;
    ApplicationFee fee;
    public Calendar dateApplied;

    public Applicant(UUID passportNumber, Calendar passportExpirationDate, String fullName, Calendar dateApplied)
    {
        this.passportNumber = passportNumber;
        this.passportExpirationDate = passportExpirationDate;
        this.fullName = fullName;
        this.dateApplied = dateApplied;
    }

    public boolean isEligable()
    {
        if (fee.isPaid())
        {
            return true;
        }
        else
            return false;
    }
    public String getFullName() {
        return fullName;
    }

    public Calendar getPassportExpirationDate() {
        return passportExpirationDate;
    }


    public UUID getPassportNumber() {
        return passportNumber;
    }

    public String getPurpose() {
        return purpose;
    }

}
