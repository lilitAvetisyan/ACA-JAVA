package com.gcard.card;
import com.gcard.terminal.Terminal;


/**
 * Created by Lill on 8/17/16.
 */
public class CardAction {
    void topUp(UserCard card, int amount)
    {
        card.balance += amount;
        System.out.println("The card has done the following payment");
        System.out.println("The amount: " + amount);
        System.out.println("Balance is: " + card.balance);

    }
    void tap(Terminal terminal)
    {
        System.out.println("The card has been tapped on this terminal: " + terminal.address);
    }
}
