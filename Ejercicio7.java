import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/**
 * Vamos a construir un programa para un trinagulo
   - hallar el area semiperimetro
   - hallar el area 
   - hallar el circumradius
 * Datos de Entrada : 
   - lado a, lado b, ladoc
 * Datos de Salida : 
   - area semiperimetro, area y circumraius
 * @author (victor)
 * @version (6 agosto 2018)
 */
public class Ejercicio7
{
    public static void main(String[] args) 
   {
     double ladoa, ladob, ladoc;
     double semiperimetro, area, circumradius;
     
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Hexagono Regular");
     
     System.out.print("Digite la dimension del lado a: ");
     ladoa = teclado.nextDouble();
     
     System.out.print("Digite la dimension del lado b: ");
     ladob = teclado.nextDouble();
     
     System.out.print("Digite la dimension del lado c: ");
     ladoc = teclado.nextDouble();
     
     // 2. Hallar areas
     semiperimetro =  (ladoa+ladob+ladoc)/2;
     area =  Math.sqrt(semiperimetro*(semiperimetro-ladoa)*(semiperimetro-ladob)*(semiperimetro-ladoc));
     circumradius = ((ladoa*ladob*ladoc)/(4 * Math.PI * area));
     
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("Area del semiperimetro: " + convertir(semiperimetro));
     System.out.println("Area : " + convertir(area));
     System.out.println("Area circumradius: " + convertir(circumradius));
     
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}
