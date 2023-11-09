/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackclasses;
import java.util.ArrayList;

/**
 *
 * @author korjk
 */
public class Player {
    private ArrayList<Card> Playercards = new ArrayList();
    /**
     * This method makes player to take a card
     * @param deck
     * @return true or false
     */
    public Boolean getCard(Deck deck)
    {
        Card card = deck.DealCard();
        if(card!=null)
        {
            getPlayercards().add(card);
            return true;
        }
        else
        {
        System.out.println("Колода пуста.");
        return false;
        }
    }
    /**
     * This method shows that dealer stands
     */
    public void Stand()
    {
        System.out.println("Зупинка взяття карт.");
    }
    /**
     * @return the Playercards
     */
    public ArrayList<Card> getPlayercards() {
        return Playercards;
    }
    /**
     * @return value 
     */
    public int getCardsWeight()
    {
        int value = 0;
        for(int i = 0 ; i < Playercards.size(); i++)
        {
            Card card = Playercards.get(i);
            if(card.getName() == "A" && value+11>21)
            {
                value+=card.getWeight()-10;
            }
            else if(card.getName() == "A" && value+11<=21)
            {
                value+=card.getWeight();
            }
            else
            {
                value+=card.getWeight();
            }
        }
        return value;
    }
}
