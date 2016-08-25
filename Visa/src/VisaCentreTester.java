/**
 * Created by Lill on 8/21/16.
 */

//import TourInfo.*;
import TourInfo.Trip;
import User.*;
import VIsaApplicationTypes.*;
import VisaCentre.*;

import javax.swing.plaf.synth.SynthPainter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class VisaCentreTester {
    public static void main (String []args)
    {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();

        Calendar c1 = new GregorianCalendar(2020, 0, 31);
        Calendar c2 = new GregorianCalendar(2016, 1, 28);
        Calendar tripDate = new GregorianCalendar(2016, 2, 15);


        VisaCentre centre = new VisaCentre();
        Applicant applicant = new Applicant(id1, c1, "Jon Smith", c2);
        Trip trip = new Trip(tripDate, "Spain");
        ApplicationFee fee = new ApplicationFee(200);
        fee.setIsPaid(true);

        VisaApplication visaApplication = new VisaApplication();
        visaApplication.setApplicant(applicant);
        visaApplication.setFee(fee);
        visaApplication.setTripInfo(trip);


        TouristVisa touristVisa = new TouristVisa("Alicante", 14);

        centre.applyToVisa(touristVisa);


    }
}
