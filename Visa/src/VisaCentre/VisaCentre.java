package VisaCentre;

import VIsaApplicationTypes.VisaApplication;

import java.util.Calendar;


/**
 * Created by Lill on 8/21/16.
 */
public class VisaCentre implements VisaCentreInterface {

public static final int procedureTime = 10;

    public boolean applyToVisa(VisaApplication visaApplication)
    {

       if (checkApplicationDeadline(visaApplication))
//       if (true)
        {
            if (visaApplication.getApplicant().isEligable())
            {
                System.out.println("Fee is paid.\n");
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
    boolean checkApplicationDeadline(VisaApplication visaApplication) {

        Calendar c1 = visaApplication.getTripInfo().getFlightDate().getInstance();
        Calendar c2 = visaApplication.getApplicant().dateApplied.getInstance();
        c2.add(Calendar.DAY_OF_MONTH, procedureTime);
        if (c1.compareTo(c2) > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}