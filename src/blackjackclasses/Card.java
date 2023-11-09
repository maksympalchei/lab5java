/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackclasses;

/**
 *
 * @author korjk
 */
public class Card {

    /**
     * @return the Suit
     */
    public String getSuit() {
        return Suit;
    }

    /**
     * @param Suit the Suit to set
     */
    public void setSuit(String Suit) {
        this.Suit = Suit;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Weight
     */
    public int getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }
    private String Suit;
    private String Name;
    private int Weight;
    /**
     * 
     * @param suit
     * @param name
     * @param weight 
     */
    public Card(String suit, String name, int weight)
    {
        this.Suit = suit;
        this.Name = name;
        this.Weight = weight;
    }
    /**
     * 
     * @return the Suit and the Name
     */
    @Override
    public String toString() {
        return Suit + " " + Name;
    }
}
