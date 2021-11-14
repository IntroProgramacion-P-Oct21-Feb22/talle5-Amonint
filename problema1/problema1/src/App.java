import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        extracted(entrada);
        double costokvh;
        double consumidos;
        int edad;
        double descuento;
        double porcentaje;
        double valortotal;
        
        porcentaje = 10;
        
        
        System.out.println("Ingrese el costo de Kilovatio/hora");
        costokvh = entrada.nextDouble();
        
        System.out.println("Ingrese los Kilovatios consumidos en el mes");
        consumidos = entrada.nextDouble();
        
        System.out.println("Ingrese la edad del usuario");
        edad = entrada.nextInt();
        
        valortotal = costokvh * consumidos;
        
        if (edad >= 65) { 
            descuento = (valortotal * porcentaje)/100;
            valortotal = (valortotal - descuento);        
        }
        System.out.printf("Elvalor a pagar es: %.2f,", valortotal);
    }

    private static void extracted(Scanner entrada) {
        entrada.useLocale(Locale.US);
    }
}