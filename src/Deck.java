//switch
//string.charAt(0)
//case '4' = int 4
//case 'A' = int 1
//case '1' = int 10
//case 'J' = int 11

//player hand1=deck[0...25]
//player hand2=deck[26...51]

//this is supposed to make a deck of 52 cards and shuffle them
public class Deck {
    public static void main(String[] args) {
        String[] suits = {"Heart", "Spade", "Club", "Diamond"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        // ArrayList<player> playerList = new ArrayList<player>();

        // create deck of 52 cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = values[i % 13] + suits[i / 13];
            //System.out.println(deck[i]);
        }

        // shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //print the shuffled deck
        for (String shuffledCards : deck) {
            System.out.println(shuffledCards);
        }

    }//end main
}//end deck
