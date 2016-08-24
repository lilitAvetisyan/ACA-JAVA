package com.gcard;
import com.gcard.system.CardManagmentSystem;
import com.gcard.card.UserCard;
import com.gcard.terminal.MetroTerminal;

import java.io.IOException;

/**
 * Created by Lill on 8/17/16.
 */
public class GamprCard {

    public static void main(String ... args) throws IOException {
        // loadTerminalsAndCards()
        // example usage
        UserCard card = new UserCard();
        MetroTerminal terminal = new MetroTerminal();
        terminal.cardTapped(card);

        CardManagmentSystem.printTransactions();
        while (true) {
            //String text = read from console; goggle - reading from command line
            // travel from station 1 to station 4

            //if (inputMsg.equals("printTransaction"))
            // printTransaction

            // exit

            // issue card

            // new user
        }
    }
}
