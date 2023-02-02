package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * modifier Fadil Nizar
 */
public class CardTrick {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;

        Card hand[] = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            Card c1 = new Card();
            c1.setValue((int) (Math.random() * 13 + 1));
            c1.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            hand[i] = c1;
            System.out.println(hand[i].getValue() + " of " + hand[i].getSuit());
        }
        
        System.out.println();
        System.out.println("Pick one card with value: ");
        a = sc.nextInt();
        System.out.println("Pick suit of the deck: ");
        b = sc.next();
        System.out.println("Your Card is " + a + " of " + b);

        boolean flag = false;
        for (int i = 0; i <= 6; i++) {
            if (a == hand[i].getValue() && b.equalsIgnoreCase(hand[i].getSuit())) {
                flag = true;
            }
        }
        if (flag == true) {
            printInfo();
        } else {
            System.out.println("Sorry, no match!!!");
        }
    }


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * modifier Fadil Nizar
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Fadil, but you can call me Fd, Fadil or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
