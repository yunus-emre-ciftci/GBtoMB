import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if (n > 20) {
            System.out.println("20'den büyük bir sayı girdiniz.");
        } else {
            System.out.println("20'den küçük bir sayı girdiniz.");
        }
    }
}
