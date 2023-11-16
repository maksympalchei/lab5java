/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackclasses;

import java.util.ArrayList;

/**
 * Class that contains information about dealer-player.
 *
 * @author korjk
 */
public class Dealer {

    private ArrayList<Card> Dealercards;

    public Dealer() {
        this.Dealercards = new ArrayList();
    }

    /**
     * This method makes dealer to take a card.
     *
     * @param deck
     */
    public void getCard(Deck deck) {
        Card card = deck.DealCard();
        if (card != null) {
            getDealercards().add(card);
        } else {
            System.out.println("Колода пуста.");
        }
    }

    /**
     * This method shows that dealer stands.
     */
    public void Stand() {
        System.out.println("Зупинка взяття карт.");
    }

    /**
     * Getter of Dealercards.
     *
     * @return the Dealercards
     */
    public ArrayList<Card> getDealercards() {
        return Dealercards;
    }

    /**
     * Method that returns weight of dealers cards.
     *
     * @return value
     */
    public int getCardsWeight() {
        int value = 0;
        int aces = 0;
        for (int i = 0; i < Dealercards.size(); i++) {
            Card card = Dealercards.get(i);
            if (card.getName() == "A" && aces > 0) {
                value += card.getWeight() - 10;
                aces++;
            } else if (card.getName() == "A" && aces == 0) {
                value += card.getWeight();
                aces++;
            } else {
                value += card.getWeight();
            }
        }
        return value;
    }
}
