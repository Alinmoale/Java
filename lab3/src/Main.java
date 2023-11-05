import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] a = {"java", "test", "university"};
        String[] b = {"car", "university", "plane"};

        List<String> elementeComune = gasesteElementeComune(a, b);

        System.out.println("Elementele comune sunt: " + elementeComune);
    }

    public static List<String> gasesteElementeComune(String[] a, String[] b) {
        List<String> elementeComune = new ArrayList<>();

        for (String elementA : a) {
            for (String elementB : b) {
                if (elementA.equals(elementB)) {
                    elementeComune.add(elementA);
                    break;
                }
            }
        }

        return elementeComune;
    }
}