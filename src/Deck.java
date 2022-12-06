//switch
//string.charAt(0)
//case '4' = int 4
//case 'A' = int 1
//case '1' = int 10
//case 'J' = int 11

//player hand1=deck[0...25]
//player hand2=deck[26...51]

//this is supposed to make a deck of 52 cards and shuffle them
import java.util.ArrayList;
public class Deck {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] deck = new String[52];
        // ArrayList<player> playerList = new ArrayList<player>();

        // create deck of 52 cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = values[i % 13] +" of " +  suits[i / 13];
            //System.out.println(deck[i]);
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



        //playing the game (comparing the cards)

        //start for loop (hand1.length>0 || hand2.length>0){

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
        switch(card1Char){
            case 'A': card1Value = 1; break;
            case '2': card1Value = 2; break;
            case '3': card1Value = 3; break;
            case '4': card1Value = 4; break;
            case '5': card1Value = 5; break;
            case '6': card1Value = 6; break;
            case '7': card1Value = 7; break;
            case '8': card1Value = 8; break;
            case '9': card1Value = 9; break;
            case '1': card1Value = 10; break;
            case 'J': card1Value = 11; break;
            case 'Q': card1Value = 12; break;
            case 'K': card1Value = 13; break;
        }
        switch(card2Char){
            case 'A': card2Value = 1; break;
            case '2': card2Value = 2; break;
            case '3': card2Value = 3; break;
            case '4': card2Value = 4; break;
            case '5': card2Value = 5; break;
            case '6': card2Value = 6; break;
            case '7': card2Value = 7; break;
            case '8': card2Value = 8; break;
            case '9': card2Value = 9; break;
            case '1': card2Value = 10; break;
            case 'J': card2Value = 11; break;
            case 'Q': card2Value = 12; break;
            case 'K': card2Value = 13; break;
        }
        //comparing the card integer values to determine which is greater
        System.out.println("Player 1 has: " + card1 );
        System.out.println("Player 2 has: " + card2 );
            if(card1Value>card2Value){
                System.out.println("Player 1 wins");
                hand1.add(card1);
                hand1.add(card2);
            } else if (card1Value==card2Value) {
                System.out.println("War begins: ");
                //pull 4 cards from each hand into a list
                //4th card from each is compared
                //winner gets all the cards
            }else{
                System.out.println("Player 2 wins");
                hand2.add(card1);
                hand2.add(card2);
            }
        System.out.println(hand1);
        System.out.println(hand2);

    }//end main
}//end deck
