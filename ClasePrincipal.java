
package examen;

import java.util.Scanner;

/**
 *
 * @author Sebastián Osornio Araujo
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        
        int respuesta;
        Scanner s = new Scanner(System.in);

        System.out.println("-------------------Generos de Musica------------------");
        
        System.out.println("Introduce el genero de musica de tu agrado y veras recomendaciones segun tu eleccion");
        
        System.out.println("\n (1) Pop"  + "\n (2) PopLatino" + "\n (3) HipHop" + "\n (4)UrbanoLatino");
               
        respuesta=s.nextInt();
        switch(respuesta){
            
            case(1):
                ClasePadre pop = new Pop();
                System.out.println("Pop ha sido tu eleccion--->\n");
                System.out.println("Estos son algunos artistas recomendados de acuerdo a tu eleccion:\n");
                pop.Pop();
                pop.Recomendacion();
                break;
                
            case(2):
                ClasePadre pl = new PopLatino();
                System.out.println("Pop Latino ha sido tu eleccion--->\n");
                System.out.println("Estos son algunos artistas recomendados de acuerdo a tu eleccion:\n");
                pl.PopLatino();
                pl.Recomendacion();
                break;
                
            case(3):
                ClasePadre hip = new HipHop();
                System.out.println("Hip-Hop/Rap ha sido tu eleccion--->\n");
                System.out.println("Estos son algunos artistas recomendados de acuerdo a tu eleccion:\n");
                hip.HipHop();
                hip.Recomendacion();
                break;
                
            case(4):
                ClasePadre ul = new UrbanoLatino();
                System.out.println("Urbano Latino ha sido tu eleccion--->\n");
                System.out.println("Estos son algunos artistas recomendados de acuerdo a tu eleccion:\n");
                ul.UrbanoLatino();
                ul.Recomendacion();
                break;
               
            
            default:
                System.out.println("Respuesta Erronea");
        }
        
    }
    
}











