import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // if-else
        if (x > 5) {
            System.out.println("x es mayor que 5");
        } else {
            System.out.println("x es menor o igual que 5");
        }
    }
}
