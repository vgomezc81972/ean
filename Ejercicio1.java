import java.util.Scanner;
/**
 * Escriba programa en Java que solicite la información necesaria para armar un tronco de pirámide, y que calcule y muestre:
   - El área del tronco de pirámide
   - El volumen del tronco
 * Datos de Entrada : 
   - b (es la dimensión del lado del cuadrado superior)
   - B (es la dimensión del lado de cuadrado inferior)
   - h (es la altura del tronco)
 * Datos de Salida 
   - area tronco
   - volumen
 * @author (victor)
 * @version (6 agosto 2018)
*/

public class Ejercicio1 
{

    public static void main(String[] args) 
   {
     int lsuperior, linferior, area_tronco, base, apotema;
     int perimetro_superior,perimetro_inferior, area_superior, area_inferior;
     double altura,volumen;
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Un tronco de pirámide cuadrangular");
     
     System.out.print("Digite la base superior osea b: ");
     lsuperior = teclado.nextInt();
     
     System.out.print("Digite la base inferior osea B: ");
     linferior = teclado.nextInt();
     
     System.out.print("Digite la altura del tronco osea h: ");
     altura = teclado.nextInt();
     
     System.out.print("Digite la altura de una cara osea ap: ");
     apotema = teclado.nextInt();
     
     // 2. Hallar los datos de salida del area
     area_superior =  lsuperior*lsuperior;
     perimetro_superior = 4*lsuperior;
     area_inferior =  linferior*linferior;
     perimetro_inferior = 4*linferior;
     area_tronco=area_superior + area_inferior+((perimetro_superior+perimetro_inferior)/2)* apotema;
     
     // 3. Hallar los datos de salida del volumen
    
     volumen=(altura/3) * (area_superior + area_inferior + Math.sqrt(area_superior * area_inferior));
     
     // 4. Mostrar los datos de salida en pantalla
     System.out.println("Area del tronco de pirámide: " + area_tronco);
     
     System.out.println("Volumen del tronco de pirámide: " + volumen);
    }
}
