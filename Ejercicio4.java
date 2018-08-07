import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/**
 * Escriba una clase en Java un programa un paseo a Melgar: 
   el camión va a llevar una carga de Bogotá a Sasaima:
   - El camión es capaz de transportar un número determinado de kilos en un viaje 
   - en cada viaje consume un número determinado de galones de gasolina por kilómetro
 * Datos de Entrada : 
   - Cual es la capacidad del camion en Kilos?
   - Consumo Gasolina x Camion x kilometro?
   - Kilometros totales a viajar (Ejemplo :distancia desde Bogota - sasaima)
   - Carga que va a llevar?
 * Datos de Salida : 
   - Determinar el numero de viajes x la carga que lleva
   - Numero de galones que se necesitan x viaje (carga)
 * @author (victor)
 * @version (6 agosto 2018)
*/

public class Ejercicio4
{

    public static void main(String[] args) 
   {
     int numero_estudiantes,  numero_estudiantes_habitacion, numero_sillas_bus, numero_habitaciones;
     double valor_habitacion,valor_plato , valor_bus;
     double gordos, flacos,buses_gordos, buses_flacos, total_buses, valor_buses, numero_dias_paseo;
     double comida_gordos, comida_flacos, total_comida_diario, total_comida_paseo;
     double total_habitacion_diario, total_habitacion_paseo;
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Paseo de Melgar");
     
     System.out.print("Digite NUmero Estudiantes: ");
     numero_estudiantes = teclado.nextInt();
     
     System.out.print("Digite Estudiantes Gordos: ");
     gordos = teclado.nextDouble();
     
     System.out.print("Digite Estudiantes Flacos: ");
     flacos = teclado.nextDouble();
     
     System.out.print("Digite Numero Sillas x Bus: ");
     numero_sillas_bus = teclado.nextInt();
     
     System.out.print("Digite Valor plato Comida: ");
     valor_plato = teclado.nextDouble();
     
     System.out.print("Digite Valor Habitacion: ");
     valor_habitacion = teclado.nextDouble();
     
     System.out.print("Digite Cantidad Estudiantes x Habitacion: ");
     numero_estudiantes_habitacion = teclado.nextInt();
     
     System.out.print("Digite Valor Alquiler Bus: ");
     valor_bus = teclado.nextDouble();
     
     System.out.print("Digite Total Dias Paseo: ");
     numero_dias_paseo = teclado.nextInt();
     
     // 2. Determinar numero buses que necesitan paseo
     buses_gordos = (gordos/(numero_sillas_bus/2));
     buses_flacos = (flacos/(numero_sillas_bus));
     total_buses = buses_gordos + buses_flacos;
     
     // 3. Cuanto cuesta el alquiler buses (ida + vuelta)
     valor_buses = total_buses * valor_bus * 2;
     
     // 4. Valor a pagar x la comida
     comida_gordos = (gordos*valor_plato*5);
     comida_flacos = (flacos*valor_plato*3);
     total_comida_diario = comida_gordos + comida_flacos;
     total_comida_paseo = total_comida_diario * numero_dias_paseo;
     
     // 5. numero de habitaciones
     numero_habitaciones = numero_estudiantes / numero_estudiantes_habitacion;
     
     // 6. Valor a pagar x habitacion
     total_habitacion_diario =  numero_habitaciones * valor_habitacion;
     total_habitacion_paseo =  total_habitacion_diario * numero_dias_paseo;

     // 8. Mostrar los datos de salida en pantalla
     
     System.out.println("Total Buses Requeridos para el paseo: " + total_buses);
     
     System.out.println("Total Alquiler Buses : " + valor_buses);

     System.out.println("Total Comida Diaria : " + convertir(total_comida_diario));

     System.out.println("Total Comida Paseo : " + convertir(total_comida_paseo));
     
     System.out.println("Numero Habitaciones : " + numero_habitaciones);
     
     System.out.println("Total Habitacion Diario : " + convertir(total_habitacion_diario));
     
     System.out.println("Total Habitacion Paseo : " + convertir(total_habitacion_paseo));
          
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###");
    return num.format(val);
    }
}