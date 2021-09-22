import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int wiek = 25;

        if(wiek % 3 == 0){
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        int nrIndeksu = 57680;
        boolean parzysty = (nrIndeksu % 2 == 0) ? true : false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbę zmiennoprzecinkową: ");
        float wejsciowaLiczba = scanner.nextFloat();

        if(wejsciowaLiczba > 0) {
            System.out.println("Liczba " + wejsciowaLiczba + " jest dodatnia");
        } else if (wejsciowaLiczba == 0){
            System.out.println("Liczba jest równa zero");
        } else {
            System.out.println("Liczba " + wejsciowaLiczba + " nie jest dodatnia");
        }
    }
}
