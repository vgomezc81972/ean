import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/**
 * Vamos a construir un programa para un hexagono regular
   - hallar el area
 * Datos de Entrada : 
   - lado
   - ap = apotema
 * Datos de Salida : 
   - area del hexagono regular
 * @author (victor)
 * @version (6 agosto 2018)
 */
public class Ejercicio6
{
    public static void main(String[] args) 
   {
     double lado, area, apotema;
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Hexagono Regular");
     
     System.out.print("Digite la dimension del lado osea L: ");
     lado = teclado.nextDouble();
     
     System.out.print("Digite la dimension del apotema osea ap: ");
     apotema = teclado.nextDouble();
     
     // 2. Hallar los datos de salida del area
     area =  (6*lado*apotema)/2;
     
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("Area del hexagono: " + convertir(area));
     
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}
