package Ch_03;


// Created By: Reda Elsayed
/**
 * *3.24 (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * Here is a sample run of the program:
 * The card you picked is Jack of Hearts
 */
public class Problem03_24 {
    public static void main(String[] args) {

        String card = "";
        String suit = "";
        String[] cards = new String[]{"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};

        int randomCard=(int)(Math.random()*14);
        int randomSuit=(int)(Math.random()*4);


        System.out.println("The card you picked is " + cards[randomCard] + " of " + suits[randomSuit]);

    }
}