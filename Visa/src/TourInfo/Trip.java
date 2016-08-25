package TourInfo;

import java.util.Calendar;

/**
 * Created by Lill on 8/21/16.
 */
public class Trip {
    public void setFlightDate(Calendar flightDate) {
        this.flightDate = flightDate;
    }

    Calendar flightDate;
    String country;

    public Trip(Calendar flightDate, String country)
    {
        this.flightDate = flightDate;
        this.country  = country;
    }

    public String getCountry() {
        return country;
    }

    public Calendar getFlightDate() {
        return flightDate;
    }
}
