import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ch1 = n / 100;
        int ch2 = n % 100;
        ch2 = ch2 % 10 * 10 + ch2 / 10;
        System.out.println(ch1 - ch2 + 1);
    }
}
