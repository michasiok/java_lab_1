public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 5;
        int d = 8;

        System.out.println("((a == b) && !(c == d)) : " + ((a == b) && !(c == d)));
        System.out.println("(a != b) && (c != d) : " + ((a != b) && (c != d)));
        System.out.println("(a > b) || (c > d): " + ((a > b) || (c > d)));
    }
}
