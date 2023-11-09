/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackclasses;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author korjk
 */
public class Deck {
    ArrayList<Card> deck = new ArrayList<>();
    String[] arrnames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits = {"Червова", "Бубнова", "Хрестова", "Пікова"};
    /**
     * This method makes new deck for new rounx of your game
     */
    public void MakeDeck()
    {
        for( String n : arrnames )
    {
        for( String s : suits)
        {
            if( n == "J" || n == "Q" || n == "K")
            {
                Card newCard = new Card(s,n,10);
                deck.add(newCard);
            }
            else if( n == "A")
            {
                Card newCard = new Card(s,n,11);
                deck.add(newCard);
            }
            else
            {
                Card newCard = new Card(s,n,Integer.parseInt(n));
                deck.add(newCard);
            }
        }
    }
    }
    /**
     * This method gets random card for player or dealer
     * @return card or null 
     */
    public Card DealCard()
    {
        if(!deck.isEmpty())
        {
            Random random = new Random();
            int rnindex = random.nextInt(deck.size());
            Card card = deck.get(rnindex);
            deck.remove(card);
            return card;
        }
        return null;
    }
}
