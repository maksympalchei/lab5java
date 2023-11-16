/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import blackjackclasses.Dealer;
import blackjackclasses.Deck;
import blackjackclasses.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author korjk
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Boolean variable = true;
        while (variable) {
            Deck deck = new Deck();
            deck.MakeDeck();
            Player player = new Player();
            Dealer dealer = new Dealer();
            player.getCard(deck);
            player.getCard(deck);
            dealer.getCard(deck);
            dealer.getCard(deck);
            System.out.println("Гра у блекджек");
            OUTER:
            while (true) {
                System.out.println("Ваші карти: " + player.getPlayercards());
                System.out.println("Вага ваших карт: " + player.getCardsWeight());
                System.out.println("Оберіть варіант:");
                System.out.println("1. Взяти карту");
                System.out.println("2. Зупинитися");
                System.out.println("3. Вийти з гри");
                int var = scanner.nextInt();
                switch (var) {
                    case 1 -> {
                        Boolean k = player.getCard(deck);
                        if (!k) {
                            break OUTER;
                        }
                    }
                    case 2 -> {
                        player.Stand();
                        break OUTER;
                    }
                    default -> {
                        variable = false;
                        break OUTER;
                    }
                }
            }
            Random random = new Random();
            for (int i = 0; i <= 4; i++) {
                Boolean l = random.nextBoolean();
                if (l) {
                    dealer.getCard(deck);
                } else {
                    break;
                }
            }

            if (variable) {
                System.out.println("Результати гри:");
                System.out.println("Ваші карти: " + player.getPlayercards());
                System.out.println("Вага ваших карт: " + player.getCardsWeight());
                System.out.println("Дилерові карти: " + dealer.getDealercards());
                System.out.println("Вага дилерових карт: " + dealer.getCardsWeight());

                if ((dealer.getCardsWeight() > 21 && player.getCardsWeight() <= 21)
                        || (player.getCardsWeight() == 21 && dealer.getCardsWeight() <= 20)) {
                    System.out.println("Ви перемогли, кількість очок дилера - " + dealer.getCardsWeight());
                } else if ((dealer.getCardsWeight() <= 21 && player.getCardsWeight() > 21) || (dealer.getCardsWeight() == 21 && player.getCardsWeight() <= 20)) {
                    System.out.println("Ви програли, кількість очок дилера - " + dealer.getCardsWeight());
                } else {
                    System.out.println("Нічия");
                }
            }
        }

        System.out.println("Дякую за гру. Завершення...");
    }
}
