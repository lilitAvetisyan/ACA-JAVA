package com.gcard.terminal;

import com.gcard.card.UserCard;

import java.util.UUID;

/**
 * Created by LilPaymentReceivable
 */
public interface PaymentRecievable {
    void recievePayment(UserCard card,int amount);
}
