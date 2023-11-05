import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un cuvânt pentru a verifica dacă este palindrom: ");
        String cuvant = scanner.nextLine().toLowerCase(); // Convertim cuvântul la litere mici
        scanner.close();

        if (estePalindrom(cuvant)) {
            System.out.println("Cuvântul \"" + cuvant + "\" este palindrom.");
        } else {
            System.out.println("Cuvântul \"" + cuvant + "\" nu este palindrom.");
        }
    }

    public static boolean estePalindrom(String cuvant) {
        int lungime = cuvant.length();
        for (int i = 0; i < lungime / 2; i++) {
            if (cuvant.charAt(i) != cuvant.charAt(lungime - i - 1)) {
                return false;
            }
        }
        return true;
    }
}