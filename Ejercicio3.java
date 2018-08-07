import java.util.Scanner;
/**
 * Escriba una clase en Java un programa que halle el volumen del tronco de cono, a partir de los datos necesarios: 
   - halle el volumen del tronco de cono
 * Datos de Entrada : 
   - Radio base mayor
   - Radio Base menor
   - Altura
 * Datos de Salida : 
   - Halle el volumen del tronco del cono
 * @author (victor)
 * @version (6 agosto 2018)
*/

public class Ejercicio3
{

    public static void main(String[] args) 
   {
     double radio_mayor, radio_menor, altura;
     double volumen1, volumen2, volumen_total;
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Un tronco de cono");
     
     System.out.print("Digite el radio base mayor osea B1: ");
     radio_mayor = teclado.nextDouble();
     
     System.out.print("Digite el radio base mayor osea b1: ");
     radio_menor = teclado.nextDouble();
     
     System.out.print("Digite la altura del tronco osea h: ");
     altura = teclado.nextDouble();
     
    
     // 2. Determinar el volumen
     
     volumen1 = (altura * Math.PI)/3;
     volumen2 = (Math.pow(radio_mayor,2)+ Math.pow(radio_menor,2)+radio_mayor+radio_menor);
     volumen_total = volumen1 * volumen2;
     
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("volumen del tronco de cono es: " + volumen_total);
     
     

     
     
     
    }
}