/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackclasses;

/**
 * Class with cards.
 *
 * @author korjk
 */
public class Card {

    /**
     * Getter of Suit.
     *
     * @return the Suit
     */
    public String getSuit() {
        return Suit;
    }

    /**
     * Setter of Suit.
     *
     * @param Suit the Suit to set
     */
    public void setSuit(String Suit) {
        this.Suit = Suit;
    }

    /**
     * Getter of Name.
     *
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Setter of Name.
     *
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Getter of Weight.
     *
     * @return the Weight
     */
    public int getWeight() {
        return Weight;
    }

    /**
     * Setter of Weight.
     *
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
    public Card(String suit, String name, int weight) {
        this.Suit = suit;
        this.Name = name;
        this.Weight = weight;
    }

    /**
     * Method that overrides default toString and returns Suit and Name.
     *
     * @return the Suit and the Name
     */
    @Override
    public String toString() {
        return Suit + " " + Name;
    }
}
