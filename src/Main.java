import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = scanner.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.next();

        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();

        System.out.print("Podaj numer indeksu: ");
        long numerIndeksu = scanner.nextLong();

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.printf("Wiek: %d%nNumer indeksu: %d", wiek, numerIndeksu);
    }
}
