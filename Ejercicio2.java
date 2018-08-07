import java.util.Scanner;
/**
 * Escriba una clase en Java un programa que modele el camión de una empresa de transporte: 
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

public class Ejercicio2
{

    public static void main(String[] args) 
   {
     double carga_camion, distancia_total, consumo_camion, carga_total;
     double numero_viajes, numero_galones, total_galones;
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Camión de una empresa de transporte");
     
     System.out.print("Digite cual es la capacidad del camion en Kilos?: ");
     carga_camion = teclado.nextDouble();
     
     System.out.print("Digite Consumo Gasolina x Camion x kilometro?: ");
     consumo_camion = teclado.nextDouble();
     
     System.out.print("Digite Tot Kilometros a viajar(Ejem:distancia desde Bogota - sasaima es 80,4 ");
     distancia_total = teclado.nextDouble();
     
     System.out.print("Digite la Carga que va a llevar en kilos?: ");
     carga_total = teclado.nextDouble();
     
     // 2. Determinar el numero de viajes x la carga que lleva
     numero_viajes = carga_total/carga_camion;
     
     // 3. Numero de galones que se necesitan x viaje (carga)
     numero_galones = distancia_total/consumo_camion;
     
     // 4. Numero de galones que se necesitan x viaje (carga)
     total_galones = numero_viajes*numero_galones;
     
     // 5. Mostrar los datos de salida en pantalla
     System.out.println("Numero de Viajes que necesita el camion pora llever carga: " + numero_viajes);
     
     System.out.println("Totales de galones requeridos x viaje x carga : " + numero_galones);
     
     System.out.println("Totales de galones requeridos en Toda la carga : " + total_galones);
     

     
     
     
    }
}