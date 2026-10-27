
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Error: introduce un número del 1 al 5.");
                teclado.next();
                System.out.print("Elige una opción: ");
            }

            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Introduce el primer número: ");

                while (!teclado.hasNextDouble()) {
                    System.out.println("Error: introduce un número válido.");
                    teclado.next();
                    System.out.print("Introduce el primer número: ");
                }

                double num1 = teclado.nextDouble();

                System.out.print("Introduce el segundo número: ");

                while (!teclado.hasNextDouble()) {
                    System.out.println("Error: introduce un número válido.");
                    teclado.next();
                    System.out.print("Introduce el segundo número: ");
                }

                double num2 = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + (num1 / num2));
                        }
                        break;
                }

            } else if (opcion == 5) {
                System.out.println("Cerrando calculadora...");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        teclado.close();
    }
}
