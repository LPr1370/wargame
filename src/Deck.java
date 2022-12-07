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


        //playing the game (comparing the cards)
        while(hand1.size() > 0 && hand2.size() > 0){
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
            if(card1Value > card2Value){
                System.out.println("Player 1 wins");
                hand1.add(card1);
                hand1.add(card2);
            }else if (card1Value < card2Value){
                System.out.println("Player 2 wins");
                hand2.add(card1);
                hand2.add(card2);
            }else {
                System.out.println("War begins: ");

//                if (hand1.size() < 4) {
//                    System.out.println("Player 1 ran out of cards in a war battle.");
//                    System.out.println("Player 2 win!");
//                }
//
//                // Not enough cards for player 2 to carry out the war
//                else if (hand2.size() < 4) {
//                    System.out.println("Player 2 ran out of cards in a war battle.");
//                    System.out.println("Player 1 win!");
//                }
//
//                // Have a battle
//                else {
//                    ArrayList<String> tempList1 = new ArrayList<String>();
//                    ArrayList<String> tempList2 = new ArrayList<String>();
//
//                    //pull 4 cards from each hand into a temp list
//                    for (int i = 0; i < 3; i++) {
//                        tempList1.add(hand1.remove(0));
//                        tempList2.add(hand2.remove(0));
//                    }
//                    String tempCard1 = tempList1.get(0);
//                    String tempCard2 = tempList2.get(0);
//                    Character tempCard1Char = tempCard1.charAt(0);
//                    Character tempCard2Char = tempCard2.charAt(0);
//                    int tempCard1Value = 0;
//                    int tempCard2Value = 0;
//                    //remove selected cards from each hand
//                    tempList1.remove(0);
//                    tempList2.remove(0);
//
//                    //assign an integer value to the char
//                    switch (tempCard1Char) {
//                        case 'A':tempCard1Value = 1;break;
//                        case '2':tempCard1Value = 2;break;
//                        case '3':tempCard1Value = 3;break;
//                        case '4':tempCard1Value = 4;break;
//                        case '5':tempCard1Value = 5;break;
//                        case '6':tempCard1Value = 6;break;
//                        case '7':tempCard1Value = 7;break;
//                        case '8':tempCard1Value = 8;break;
//                        case '9':tempCard1Value = 9;break;
//                        case '1':tempCard1Value = 10;break;
//                        case 'J':tempCard1Value = 11;break;
//                        case 'Q':tempCard1Value = 12;break;
//                        case 'K':tempCard1Value = 13;break;
//                    }
//                    switch (tempCard2Char) {
//                        case 'A':tempCard2Value = 1;break;
//                        case '2':tempCard2Value = 2;break;
//                        case '3':tempCard2Value = 3;break;
//                        case '4':tempCard2Value = 4;break;
//                        case '5':tempCard2Value = 5;break;
//                        case '6':tempCard2Value = 6;break;
//                        case '7':tempCard2Value = 7;break;
//                        case '8':tempCard2Value = 8;break;
//                        case '9':tempCard2Value = 9;break;
//                        case '1':tempCard2Value = 10;break;
//                        case 'J':tempCard2Value = 11;break;
//                        case 'Q':tempCard2Value = 12;break;
//                        case 'K':tempCard2Value = 13;break;
//                    }
//                    if (tempCard1Value > tempCard2Value) {
//                        tempList1.addAll(tempList2);
//                    } else if (tempCard1Value < tempCard2Value) {
//                        tempList2.addAll(tempList1);
//                    } else {
//                        System.out.println("War again!");
//                    }
//                }
//            }//end else war
                System.out.println(hand1);
                System.out.println(hand2);
//       if(hand1.size() == 0){
//           System.out.println("Player 1 ran out of the card, Player 2 win!");
//           break;
//       }
//       if(hand2.size() == 0){
//           System.out.println("Player 2 ran out of the card, Player 1 win!");
//           break;
         }
        }//end while
    }//end main
}//end deck