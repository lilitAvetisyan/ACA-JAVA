package com.gcard.card;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Lill on 8/17/16.
 */
public interface PayableInterface {
    void doPayment(UserCard card, int amount);

}
