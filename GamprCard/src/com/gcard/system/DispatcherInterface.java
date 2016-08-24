package com.gcard.system;

import javax.smartcardio.Card;
import java.util.Date;

/**
 * Created by Lill on 8/17/16.
 */
public interface DispatcherInterface {

    public abstract Card issuedNewCard(Date date);

}
