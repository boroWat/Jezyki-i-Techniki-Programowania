// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Kowalski");
        namesList.add("Nowak");
        namesList.add("Wiśniewski");

        Names names = new Names(namesList);

        String chosenName = names.choose();
        System.out.println("Wybrane nazwisko: " + chosenName);
        System.out.println("Pozostałe nazwiska: " + names.getNames());

        System.out.println("\nZadanie 3:\n");

        FrequentNames frequentNames = new FrequentNames();
        frequentNames.insert("Kuba");
        frequentNames.insert("Kuba");
        frequentNames.insert("Kuba");
        frequentNames.insert("Kuba");
        frequentNames.insert("Hubert");
        frequentNames.insert("Hubert");
        frequentNames.insert("Hubert");
        frequentNames.insert("Maciek");
        frequentNames.insert("Maciek");

        System.out.println(frequentNames.choose()); // Kuba
        System.out.println(frequentNames.choose()); // Hubert
        System.out.println(frequentNames.choose()); // Kuba
        System.out.println(frequentNames.choose()); // Hubert

        frequentNames.insert("Maciek");

        System.out.println(frequentNames.choose()); // Maciek

        System.out.println("\nZadanie 4:\n");


        Anchor list1 = new Anchor();
        list1.insertAtTheFront(3);
        list1.insertAtTheFront(2);
        list1.insertAtTheFront(1);
        System.out.println("Lista 1: " + list1.toString()); // Lista 1: 1 2 3

        Anchor list2 = new Anchor();
        list2.insertAtTheEnd(1);
        list2.insertAtTheEnd(2);
        list2.insertAtTheEnd(3);
        System.out.println("Lista 2: " + list2.toString()); // Lista 2: 1 2 3

        System.out.println("Czy równe? " + list1.equals(list2)); // Czy równe? true

        list1.removeFirst();
        list2.removeLast();
        System.out.println("Lista 1 po zabraniu pierwszego: " + list1.toString()); // Lista 1 po zabraniu pierwszego:: 2 3
        System.out.println("Lista 2 po zabraniu ostatnigo: " + list2.toString()); // Lista 2 po zabraniu ostatnigo: 1 2

        System.out.println("Czy równe? " + list1.equals(list2)); // Czy równe? false
    }
}