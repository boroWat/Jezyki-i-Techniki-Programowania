import java.util.ArrayList;
import java.util.Random;

public class Names {
    private ArrayList<String> names;

    public Names(ArrayList<String> names) {
        this.names = names;
    }

    public String choose() {
        if (names.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(names.size());
        String chosenName = names.get(index);
        names.remove(index);
        return chosenName;
    }

    public ArrayList<String> getNames() {
        return names;
    }
}