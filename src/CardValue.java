public class CardValue {
    //assigns a comparable integer value to the card based on its first Character
    public static int getCardValue(Character cardChar, int card1Value) {
        switch(cardChar){
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
        return card1Value;
    }
}
