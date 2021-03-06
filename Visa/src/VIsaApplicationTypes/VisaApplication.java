package VIsaApplicationTypes;

import TourInfo.Trip;
import User.Applicant;

/**
 * Created by Lill on 8/21/16.
 */
public class VisaApplication {
    protected  Applicant applicant;
    protected Trip tripInfo;
    protected ApplicationFee fee;

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public void setFee(ApplicationFee fee) {
        this.fee = fee;
    }

    public void setTripInfo(Trip tripInfo) {
        this.tripInfo = tripInfo;
    }





    public Applicant getApplicant() {
        return applicant;
    }

    public Trip getTripInfo()
    {
        return tripInfo;
    }
}
