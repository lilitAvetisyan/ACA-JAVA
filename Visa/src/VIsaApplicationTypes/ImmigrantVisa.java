package VIsaApplicationTypes;

/**
 * Created by Lill on 8/21/16.
 */
public class ImmigrantVisa extends VisaApplication {

    public static   int immigrantVisaPrice = 500;
    private String permanentPlaceToLive;

    public ImmigrantVisa(String permanentPlaceToLive)
    {
        this.permanentPlaceToLive = permanentPlaceToLive;
    }
    public void payFee()
    {
        fee.setIsPaid(true);

    }


    public String getPermanentPlaceToLive() {
        return permanentPlaceToLive;
    }



}
