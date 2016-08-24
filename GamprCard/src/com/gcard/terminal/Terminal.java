package com.gcard.terminal;

import com.gcard.card.UserCard;
import java.util.UUID;

/**
 * Created by Lill on 8/17/16.
 */
public abstract class Terminal implements PaymentRecievable {
    public UUID id;
    public String address;


    public void recievePayment(UserCard card, int amount) {
        if (card.isStolen())
        {
            System.out.println("The card is stolen!\nTransaction Denied!\n");
        }
        else
        {
            if (card.getBalance() >= amount)
            {
                card.doPayment(card, amount);
                System.out.println();

            }
            else
            {
                System.out.println("There is not enough money on your card\n");
            }

        }
    }
}

