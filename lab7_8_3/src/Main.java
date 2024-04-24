import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
        UsersServiceImpl usersServiceImp = new UsersServiceImpl();
        System.out.println(usersServiceImp.groupByCountOfPrivileges());
         */
        int sum = calculateSumOfSquaresInRange(1, 21);
        grawKarty();

    }
    static void grawKarty() {
        LinkedList<GameCard> firstPlayerCards = new LinkedList<>();
        LinkedList<GameCard> secondPlayerCards = new LinkedList<>();
        LinkedList<GameCard> allCards = new LinkedList<>();
        //UTWORZ TALIE
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 0) {
                    allCards.add(new GameCard(CardSuit.HEARTS, j));
                }
                if (i == 1) {
                    allCards.add(new GameCard(CardSuit.TILES, j));
                }
                if (i == 2) {
                    allCards.add(new GameCard(CardSuit.CLOVERS, j));
                }
                if (i == 3) {
                    allCards.add(new GameCard(CardSuit.PIKES, j));
                }
            }
        }
        Collections.shuffle(allCards);
        //WYPELNIJ TALIE GRACZY
        for (int i = 0; i < allCards.size(); i++) {
            if (i < allCards.size() / 2) {
                firstPlayerCards.add(allCards.get(i));
            }
            if (i >= allCards.size() / 2) {
                secondPlayerCards.add(allCards.get(i));
            }
        }
        int LICZNIK_BEZ_WOJNY = 0;
        int LICZNIK_WOJNA = 0;
        while (secondPlayerCards.size() != 0 && firstPlayerCards.size() != 0) {
            /*
            System.out.println("Poczatek");
            for(GameCard gameCard : firstPlayerCards) {
                System.out.print(gameCard.getCardPower() + " ");
            }
            System.out.print("\n");
            for(GameCard gameCard : secondPlayerCards) {
                System.out.print(gameCard.getCardPower() + " ");
            }
            System.out.print("\n");

             */
            //2 Gracz wygrywa runde
            if (secondPlayerCards.getFirst().compare(firstPlayerCards.getFirst()) == 1) {
                System.out.println("2 gracz wygrywa");
                secondPlayerCards.addLast(firstPlayerCards.removeFirst());
                secondPlayerCards.addLast(secondPlayerCards.removeFirst());
            }
            //1 Gracz wygrywa runde
            else if (secondPlayerCards.getFirst().compare(firstPlayerCards.getFirst()) == -1) {
                System.out.println("1 gracz wygrywa");
                firstPlayerCards.addLast(secondPlayerCards.removeFirst());
                firstPlayerCards.addLast(firstPlayerCards.removeFirst());
            }
            //REMIS
            else {
                System.out.println("Remis");
                LinkedList<GameCard> tmpList = new LinkedList<>();
                //Wykonuj dopoki remis
                while ((secondPlayerCards.size() != 0 && firstPlayerCards.size() != 0) && secondPlayerCards.getFirst().compare(firstPlayerCards.getFirst()) == 0) {
                    System.out.println(secondPlayerCards.getFirst().getCardPower() + "=" + firstPlayerCards.getFirst().getCardPower());
                    tmpList.addFirst(firstPlayerCards.removeFirst());
                    tmpList.addFirst(secondPlayerCards.removeFirst());
                    LICZNIK_WOJNA += 1;
                }
                //2 Gracz wygrywa runde
                if ((secondPlayerCards.size() != 0 && firstPlayerCards.size() != 0) && secondPlayerCards.getFirst().compare(firstPlayerCards.getFirst()) == 1) {
                    System.out.println("2 gracz wygrywa wojne");
                    tmpList.addFirst(firstPlayerCards.removeFirst());
                    tmpList.addFirst(secondPlayerCards.removeFirst());
                    secondPlayerCards.addAll(secondPlayerCards.size(), tmpList);
                    LICZNIK_WOJNA += 1;
                }
                //1 Gracz wygrywa runde
                else if ((secondPlayerCards.size() != 0 && firstPlayerCards.size() != 0) && secondPlayerCards.getFirst().compare(firstPlayerCards.getFirst()) == -1) {
                    System.out.println("1 gracz wygrywa wojne");
                    tmpList.addFirst(firstPlayerCards.removeFirst());
                    tmpList.addFirst(secondPlayerCards.removeFirst());
                    firstPlayerCards.addAll(firstPlayerCards.size(), tmpList);
                    LICZNIK_WOJNA += 1;
                }

                //2 gracz stracil wszystkie karty
                if (secondPlayerCards.size() == 0) {
                    firstPlayerCards.addAll(firstPlayerCards.size(), tmpList);
                }
                //1 gracz stracil wszystkie karty
                else if (firstPlayerCards.size() == 0) {
                    secondPlayerCards.addAll(secondPlayerCards.size(), tmpList);
                }
                /*
                System.out.println("tmplist");
                for(GameCard gameCard : tmpList) {
                    System.out.print(gameCard.getCardPower() + " ");
                }
                System.out.print("\n");

                 */
            }
            LICZNIK_BEZ_WOJNY += 1;
        }
        if (firstPlayerCards.size() == 52) {
            System.out.println("1 wygral kart " + firstPlayerCards.size());
        } else if (secondPlayerCards.size() == 52) {
            System.out.println("2 wygral kart " + secondPlayerCards.size());
        }
        int LICZNIK_SUMA = LICZNIK_WOJNA + LICZNIK_BEZ_WOJNY;
        System.out.println(LICZNIK_BEZ_WOJNY + " rund liczac wojne jako 1 runde");
        System.out.println(LICZNIK_SUMA + " rund liczac kazda runde wojny");
    }
    static int calculateSumOfSquaresInRange(int startInclusive, int endInclusive) {
        if (endInclusive < startInclusive) {
            throw new IllegalArgumentException();
        }
        int sum = IntStream.rangeClosed(startInclusive, endInclusive)
                .map(num -> num * num)
                .sum();//range(startInclusive, endInclusive);

        return sum;
    }
}
