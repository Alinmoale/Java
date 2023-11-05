import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un șir de caractere: ");
        String inputText = scanner.nextLine();
        scanner.close();

        String middleChars = mijlocCaractere(inputText);
        System.out.println(middleChars);
    }

    public static String mijlocCaractere(String inputString) {
        int lungime = inputString.length();
        int mijloc = lungime / 2;

        if (lungime % 2 == 0) {

            return inputString.substring(mijloc - 1, mijloc + 1);
        } else {

            return String.valueOf(inputString.charAt(mijloc));
        }
    }
}
