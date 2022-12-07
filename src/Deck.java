/**
 * Names: Churina Sa, Lucas Prieto
 * Date: 07DEC2022
 * Class: CP-CO Alpha 1
 * Description: This program will play the game of war with itself and run until it has a winner.
 */

import java.util.ArrayList;
public class Deck {
    public static void main(String[] args) {
        //this is making the suits and values for the cards
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] deck = new String[52];

        // create deck of 52 cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = values[i % 13] +" of " +  suits[i / 13];
        }

        // shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //distributing the deckList into two hand array lists
        ArrayList<String> deckList = new ArrayList<String>();
        ArrayList<String> hand1 = new ArrayList<String>();
        ArrayList<String> hand2 = new ArrayList<String>();
        for(int counter = 0; counter < deck.length; counter++){
            deckList.add(deck[counter]);
        }

        //loops through the decklist and adds all even values to hand 1 and all odd values to hand 2
        for(int i = 0; i < 52; i++){
            String tempCard = deckList.get(i);
            if(i%2 == 0){
                hand1.add(tempCard);
            }else{
                hand2.add(tempCard);
            }
        }
        System.out.println(hand1);
        System.out.println(hand2);


        int roundCounter = 1;
        //playing the game (comparing the cards)
        while(hand1.size() > 0 && hand2.size() > 0){

            System.out.println("It is now round: " + roundCounter);
            roundCounter++;

            //assign card from array list to a variable, then get the first char
            String card1 = hand1.get(0);
            String card2 = hand2.get(0);
            Character card1Char = card1.charAt(0);
            Character card2Char = card2.charAt(0);
            int card1Value = 0;
            int card2Value = 0;
            //remove selected cards from each hand
            hand1.remove(0);
            hand2.remove(0);

            //assign an integer value to the char
            card1Value = CardValue.getCardValue(card1Char, card1Value);
            card2Value = CardValue.getCardValue(card2Char, card2Value);
            //comparing the card integer values to determine which is greater

            System.out.println("Player 1 has: " + card1 );
            System.out.println("Player 2 has: " + card2 );
            if(card1Value > card2Value){
                System.out.println("Player 1 won the round");
                if(Math.random() > 0.5){
                    hand1.add(card1);
                    hand1.add(card2);
                }else{
                    hand1.add(card2);
                    hand1.add(card1);
                }

            }else if (card1Value < card2Value){
                System.out.println("Player 2 won the round");
                if(Math.random() > 0.5){
                    hand2.add(card1);
                    hand2.add(card2);
                }else{
                    hand2.add(card2);
                    hand2.add(card1);
                }
            }else {
                if (War.warMethod(hand1, hand2, card1Value, card2Value)) break;
            }//end else war
       if(hand1.size() == 0){
           System.out.println("Player 1 ran out of cards, Player 2 wins the game in " + (roundCounter-1) + " rounds!");
           break;
       }
       if(hand2.size() == 0){
           System.out.println("Player 2 ran out of cards, Player 1 wins the game in " + (roundCounter-1) + " rounds!");
           break;
         }

        }//end while
    }//end main
}//end deck