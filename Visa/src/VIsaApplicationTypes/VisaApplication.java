package VIsaApplicationTypes;

import TourInfo.Trip;
import User.Applicant;

/**
 * Created by Lill on 8/21/16.
 */
public class VisaApplication {
    protected  Applicant applicant;
    protected Trip tripInfo;


    public Applicant getApplicant() {
        return applicant;
    }

    public Trip getTripInfo()
    {
        return tripInfo;
    }
}
