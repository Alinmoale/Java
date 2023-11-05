import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul N pentru afișarea șirului Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        afiseazaSirFibonacci(n);
    }

    public static void afiseazaSirFibonacci(int n) {
        int numar1 = 0, numar2 = 1;

        System.out.print("Șirul Fibonacci până la " + n + ": ");

        while (numar1 <= n) {
            System.out.print(numar1 + " ");
            int suma = numar1 + numar2;
            numar1 = numar2;
            numar2 = suma;
        }
    }
}