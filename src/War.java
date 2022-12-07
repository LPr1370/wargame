import java.util.ArrayList;

public class War {
    public static boolean warMethod(ArrayList<String> hand1, ArrayList<String> hand2, int card1Value, int card2Value) {
        for(int counter=0;counter<100;counter++) {
            System.out.println("War begins: ");

            if (hand1.size() < 4) {
                System.out.println("Player 1 ran out of cards in a war battle.");
                System.out.println("Player 2 wins the game!");
                return true;
            }

            // Not enough cards for player 2 to carry out the war
            else if (hand2.size() < 4) {
                System.out.println("Player 2 ran out of cards in a war battle.");
                System.out.println("Player 1 wins the game!");
                return true;
            }

            // Have a battle
            else {
                ArrayList<String> tempList1 = new ArrayList<String>();
                ArrayList<String> tempList2 = new ArrayList<String>();

                //pull 4 cards from each hand into a temp list
                for (int i = 0; i < 4; i++) {
                    tempList1.add(hand1.remove(0));
                    tempList2.add(hand2.remove(0));
                }
                //select the first cards drawn from the templist and assign them to a variable
                String tempCard1 = tempList1.get(0);
                String tempCard2 = tempList2.get(0);
                //get the first char from the cards
                Character tempCard1Char = tempCard1.charAt(0);
                Character tempCard2Char = tempCard2.charAt(0);
                int tempCard1Value = 0;
                int tempCard2Value = 0;
                //remove selected cards from each hand
                tempList1.remove(0);
                tempList2.remove(0);

                System.out.println("Player 1 has: " + tempCard1);
                System.out.println("Player 2 has: " + tempCard2);


                //assign an integer value to the char
                tempCard1Value = CardValue.getCardValue(tempCard1Char, card1Value);
                tempCard2Value = CardValue.getCardValue(tempCard2Char, card2Value);
                //comparing the cards to determine winner
                if (tempCard1Value > tempCard2Value) {
                    System.out.println("Player 1 won the war!");
                    tempList1.addAll(tempList2);
                    break;
                } else if (tempCard1Value < tempCard2Value) {
                    System.out.println("Player 2 won the war!");
                    tempList2.addAll(tempList1);
                    break;
                } else {
                    System.out.println("War again!");
                }
            }//end else
        }//end loop
        return false;
    }//end main
}//end war
