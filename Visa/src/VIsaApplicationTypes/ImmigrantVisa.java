package VIsaApplicationTypes;

/**
 * Created by Lill on 8/21/16.
 */
public class ImmigrantVisa extends VisaApplication {

    public static   int immigrantVisaPrice = 500;
    private String permanentPlaceToLive;

    public String getPermanentPlaceToLive() {
        return permanentPlaceToLive;
    }

    public void setPermanentPlaceToLive(String permanentPlaceToLive) {
        this.permanentPlaceToLive = permanentPlaceToLive;
    }


}
