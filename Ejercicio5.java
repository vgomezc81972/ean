import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/**
 * Vamos a construir un programa para un avión
   - NUmero pasajeros x clase
   - Valor tiquete x clase
 * Datos de Entrada : 
   - Clase
   - NUmero pasajeros x clase
   - Valor tiquete x clase
 * Datos de Salida : 
   - digite clase 
   - total pasajeros x clase y 
   - total valor x clase
 * @author (victor)
 * @version (6 agosto 2018)
 */
public class Ejercicio5
{
    public static void main(String[] args) 
   {
     int pasajeros_clase1, pasajeros_clase2, pasajeros_clase3;
     double valor1, valor2, valor3;
     double total_valor1, total_valor2, total_valor3;
     
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Avion");
     
     System.out.print("Digite cantidad pasajeros clase 1: ");
     pasajeros_clase1 = teclado.nextInt();
     
     System.out.print("Digite cantidad pasajeros clase 2: ");
     pasajeros_clase2 = teclado.nextInt();
     
     System.out.print("Digite cantidad pasajeros clase 3: ");
     pasajeros_clase3 = teclado.nextInt();
     
     System.out.print("Digite valor tiquete clase 1: ");
     valor1 = teclado.nextDouble();
     
     System.out.print("Digite valor tiquete clase 2: ");
     valor2 = teclado.nextDouble();
     
     System.out.print("Digite valor tiquete clase 3: ");
     valor3 = teclado.nextDouble();
     
     // 2. Hallar los datos 
     total_valor1 =  (pasajeros_clase1*valor1);
     total_valor2 =  (pasajeros_clase2*valor2);
     total_valor3 =  (pasajeros_clase3*valor3);
          
     // 3. Mostrar los datos de salida en pantalla
     
     Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Clase 1");
           System.out.println("2. Clase 2");
           System.out.println("3. Clase 3");
           System.out.println("4. Salir");
            
           System.out.println("Escoja una de las clases");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Total Pasajeros Clase 1: " + pasajeros_clase1);
                   System.out.println("Valor Total tiquetes clase 1: " + convertir(total_valor1));
                   break;
               case 2:
                   System.out.println("Total Pasajeros Clase 1: " + pasajeros_clase2);
                   System.out.println("Valor Total tiquetes clase 1: " + convertir(total_valor2));
                   break;
                case 3:
                   System.out.println("Total Pasajeros Clase 1: " + pasajeros_clase3);
                   System.out.println("Valor Total tiquetes clase 1: " + convertir(total_valor3));
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo Digite Clases entre 1 y 3");
           }
            
       }
     
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}
