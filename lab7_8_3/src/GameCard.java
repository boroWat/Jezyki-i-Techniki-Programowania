import java.util.List;

public class GameCard {
    private CardSuit cardSuit;
    private int cardPower;
    public GameCard(CardSuit cardSuit, int cardPower) {
        this.cardPower = cardPower;
        this.cardSuit = cardSuit;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }
    public int compare(GameCard gameCard) {
        if (cardPower > gameCard.getCardPower()) {
            System.out.println(cardPower + " bije " + gameCard.getCardPower());
            return 1;
        }
        else if (cardPower < gameCard.getCardPower()) {
            System.out.println(cardPower + " bije " + gameCard.getCardPower());
            return -1;
        }
        else {
            System.out.println("Remis");
            return 0;
        }
    }


    public int getCardPower() {
        return cardPower;
    }
}
