import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular área del triángulo
        double area = (base * altura) / 2;

        // Mostrar resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerrar scanner
        scanner.close();
    }
}
