import VIsaApplicationTypes.VisaApplication;

import java.util.Calendar;


/**
 * Created by Lill on 8/21/16.
 */
public class VisaCentre  {

public static final int proccesdureTime = 10;

    boolean grantVisa( VisaApplication visaApplication)
    {
        Calendar c1 = visaApplication.getTripInfo().getFlightDate().getInstance();
        Calendar c2 = visaApplication.getApplicant().dateApplied.getInstance();
        c2.add(Calendar.DAY_OF_MONTH, 10);

        //TODO implement whether the user gets visa or no
        // if applies later than the deadline then the applicant does not get a visa

        if (c1.compareTo(c2) > 0)
        {
            if (visaApplication.getApplicant().isEligable())
            {
                return true;
            }
            else
            {
                System.out.println("The fee is not paid.");
                return false;
            }
        }
        else
        {
            System.out.println("You applied too late for the visa");
            return false;
        }


    }



}
