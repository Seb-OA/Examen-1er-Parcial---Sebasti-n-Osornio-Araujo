
package examen;

import java.util.Scanner;

/**
 *
 * @author Sebastián Osornio Araujo
 */

public abstract class ClasePadre {
    
    Scanner s = new Scanner(System.in);

    // Constructor //
    public ClasePadre() {

    }
    
    public void Pop(){

    }
    
    public void PopLatino(){

    }
    
     public void HipHop(){

    }
     
     public void UrbanoLatino(){
         
     }
     
    // Se muestra el area del genero seleccionado //
    public abstract void Recomendacion();
    
}

