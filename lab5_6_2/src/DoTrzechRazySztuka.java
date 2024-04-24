import java.util.Scanner;

public class DoTrzechRazySztuka {

    public static float PobierzLiczbe(int max) {
        Scanner scanner = new Scanner(System.in);
        int proby = 0;
        float liczba = 0;

        while (proby < max) {
            System.out.print("Podaj liczbę: ");
            String input = scanner.nextLine();

            try {
                liczba = Float.parseFloat(input);
                break;  // Przerwij pętlę po udanym odczycie float
            } catch (NumberFormatException e) {
                proby++;
                System.out.println("Nieprawidłowy format liczby. Spróbuj jeszcze raz.");
            }
        }

        if (proby == max) {
            System.out.println("Przekroczono maksymalną liczbę prób.");
        }

        return liczba;
    }
}
