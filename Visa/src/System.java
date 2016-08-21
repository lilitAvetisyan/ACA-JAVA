/**
 * Created by Lill on 8/21/16.
 */

//import TourInfo.*;
import User.*;
import VIsaApplicationTypes.*;
import VisaCentre.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class System {
    public static void main (String []args)
    {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();

        Calendar c1 = new GregorianCalendar(2020, 0, 31);
        Calendar c2 = new GregorianCalendar(2016, 1, 28);


        VisaCentre centre = new VisaCentre();
        Applicant applicant = new Applicant(id1, c1, "Jon Smith", c2);

        TouristVisa touristVisa = new TouristVisa("Alicante", 14);

        centre.applyToVisa(touristVisa);


    }
}
