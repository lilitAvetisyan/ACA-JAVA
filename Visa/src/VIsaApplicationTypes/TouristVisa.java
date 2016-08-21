package VIsaApplicationTypes;

/**
 * Created by Lill on 8/21/16.
 */
public class TouristVisa extends VisaApplication {
    public  final int touristVisaPrice = 100;
    private String placeToStay;
    private int durationDays;

    public TouristVisa(String placeToStay, int durationDays)
    {
        this.placeToStay = placeToStay;
        this.durationDays = durationDays;
    }

    public void payFee()
    {
        fee.setIsPaid(true);

    }


}
