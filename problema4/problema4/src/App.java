import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numerod;
        double preciohabit;
        double subtotal;
        double descuento1;
        double porcentaje1;
        porcentaje1 = 10;
        double totalpagar;
        double descuento2;
        double porcentaje2;
        porcentaje2 = 15;
        double porcentaje3 = 20;
        double descuento3;

        System.out.println("Ingrese el numero de dias en la hosteria");
        numerod = entrada.nextInt();

        System.out.println("Ingrese el precio de la habitacion");
        preciohabit = entrada.nextDouble();

        subtotal = preciohabit * numerod;
        if (numerod < 0) {
            subtotal = 0;
            totalpagar = 0;
        } else {

        }
        if (numerod <= 5) {
            totalpagar = numerod * preciohabit;
        } else {

            if (numerod >= 5 && numerod<= 10) {
                descuento1 = (porcentaje1 * subtotal) / 100;
                totalpagar = subtotal - descuento1;
            } else {
                if (numerod >= 10 && numerod <= 15) {
                    descuento2 = (porcentaje2 * subtotal) / 100;
                    totalpagar = subtotal - descuento2;
                } else {
                    descuento3 = (porcentaje3 * subtotal) / 100;
                    totalpagar = subtotal - descuento3;
                }
            }
        }
        System.out.printf("El total a pagar es: %.2f", subtotal);
        System.out.printf("El total a pagar es: %.2f", totalpagar);
    }
}
