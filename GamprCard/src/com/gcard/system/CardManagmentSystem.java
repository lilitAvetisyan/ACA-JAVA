package com.gcard.system;

import com.gcard.card.UserCard;
import com.gcard.terminal.Terminal;
import com.gcard.user.User;

import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * Created by Lill on 8/17/16.
 */
public abstract class CardManagmentSystem implements DispatcherInterface {

    private List<UserCard> cards;
    private List<User> registeredUsers;
    private List<Terminal> terminals;


    public static void processTransaction(UUID cardID, UUID terminalID, int amount) throws IOException
    {
        String transaction = cardID + "  " + terminalID + " the amount paid is: " + amount;

            BufferedWriter writer = new BufferedWriter( new FileWriter("transactions.txt"));
            writer.write(transaction);
            writer.close();


    }

    boolean isStolen(UserCard card)
    {
        if (card.isStolen()) {
            return true;
        }
        else
            return false;
    }

    public static void printTransactions() throws IOException {
        System.out.println("Print all transactions from file");
        BufferedReader in = new BufferedReader(new FileReader("transactions.txt"));
        String transaction;
        while((transaction = in.readLine()) != null)
        {
            System.out.println(transaction);
        }
        in.close();


    }


}
