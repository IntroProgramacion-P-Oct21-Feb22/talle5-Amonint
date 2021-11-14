import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String desproducto;
        int cantrequerida;
        double preciounitario;
        double descuento;
        double porcentaje = 15;
        double valortotal;

        System.out.println("Ingrese el noñmbre del producto");
        desproducto = entrada.nextLine();

        System.out.println("Ingrese la cantidad requerida");
        cantrequerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario");
        preciounitario = entrada.nextDouble();

        valortotal = cantrequerida * preciounitario;

        if (cantrequerida >= 50) {
            descuento = (valortotal * porcentaje) / 100;
            valortotal = valortotal - descuento;

        }
        System.out.printf("El nombre del producto es: %s\n",
        desproducto);
        System.out.printf("El valor a pagar es: %.2f", valortotal);
    }
}
