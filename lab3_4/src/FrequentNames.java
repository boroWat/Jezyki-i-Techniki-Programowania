import java.util.*;

public class FrequentNames {
    private List<String> frequentNames;

    public FrequentNames() {
        frequentNames = new ArrayList<>();
    }

    public String choose() {
        if (frequentNames.isEmpty()) {
            return null;
        }

        // Zliczamy liczbę wystąpień każdego imienia
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : frequentNames) {
            if (nameCounts.containsKey(name)) {
                nameCounts.put(name, nameCounts.get(name) + 1);
            } else {
                nameCounts.put(name, 1);
            }
        }

        // Znajdujemy imię z największą liczbą wystąpień
        String mostFrequentName = null;
        int maxCount = 0;
        int count = 0;
        for (String name : nameCounts.keySet()) {
            count = nameCounts.get(name);
            if (count > maxCount) {
                mostFrequentName = name;
                maxCount = count;
            }
        }

        // Usuwamy imię z listy i zwracamy je
        frequentNames.remove(mostFrequentName);
        return mostFrequentName;
    }

    public void insert(String name) {
        frequentNames.add(name);
    }
}
