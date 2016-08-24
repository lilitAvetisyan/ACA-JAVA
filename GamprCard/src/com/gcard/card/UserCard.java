package com.gcard.card;

import java.util.UUID;

/**
 * Created by Lill on 8/17/16.
 */
public class UserCard  implements PayableInterface {
    private UUID id;
    private int balance;
    private boolean isStolen;

    public UserCard()
    {
        this.id = UUID.randomUUID();
        this.balance = 0;
        this.isStolen = false;
    }

    public boolean isStolen() {
        return isStolen;
    }

    public void setIsStolen(boolean isStolen) {
        this.isStolen = isStolen;
    }

    public void reportStolen(UserCard card)
    {
        card.setIsStolen(true);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    @Override
    public void doPayment(UserCard card, int amount) {
        card.balance -= amount;
        System.out.println("The card has done the following payment");
        System.out.println("Pay amount: " + amount);
        System.out.println("Balance is: " + card.balance);

    }


}
