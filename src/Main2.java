

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        int sum = sumaCifrelor(inputNumber);
        System.out.println("Suma cifrelor este: " + sum);  // Output așteptat: Suma cifrelor
    }

    public static int sumaCifrelor(int numar) {
        int suma = 0;
        while (numar > 0) {
            int cifra = numar % 10;
            suma += cifra;
            numar = numar / 10;
        }
        return suma;
    }
}