import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double porcentaje1 = 0.20;
        double porcentaje2 = 0.30;
        double porcentaje3 = 0.15;
        double porcentaje4 = 0.8;
        double subtotal;
        double iva = 0;
        
        System.out.println("Ingrese el nombre de la marca");
        marca = entrada.nextLine ();
        
        System.out.println("Ingrese El origen del vehiculo");
        origen = entrada.nextLine ();
        
        System.out.println("Ingrese El costo del vehiculo");
        subtotal = entrada.nextDouble ();
        
        costo = subtotal + iva;
        
        if (origen.equals("Alemania")){
            iva = subtotal * porcentaje1;
            costo = subtotal + iva;
            }else{
            if (origen.equals("Japon")){
            iva = subtotal * porcentaje2;
            costo = subtotal + iva;
            }else{
            if (origen.equals("Italia")){
            iva = subtotal * porcentaje3;
            costo = subtotal + iva;
            }else{
            if (origen.equals("USA")){
            iva = subtotal * porcentaje4;
            costo = subtotal + iva;
            
            }
        }
        
        
        }
        
          
        }
        
        System.out.printf("El nombre del producto es: %s \n", marca);
        System.out.printf("El total a pagar es: %.2f", costo);
    }
}
