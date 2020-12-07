
/*
 * 13.	Una empresa automotriz necesita un sistema para seleccionar el tipo 
de carro (auto, SUV o camioneta) lo cual debe de aparecer en un menú,
y el color (negro, blanco o rojo) en otro menú. Al final se necesita que despliegue la selección realizada.
Nota. Debe de anidarse una estructura de selección múltiple dentro de otra.
 */
package auto;

import java.util.Scanner;

/**
 *
 * @author Karol Martinez
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- ELIJA EL TIPO DE CARRO-----");
        System.out.println("");
        System.out.println("1. par carro");
        System.out.println("2. para SUV");
        System.out.println("3. para camioneta ");
        
        int n1,n2;
        String TipoA = "a",color= "a";
        
        n1 = leer.nextInt();
        switch (n1){
          case 1: 
                    TipoA="Carro";
                  System.out.println("----- ELIJA EL COLOR DEL CARRO -----");
                  System.out.println("");
                  System.out.println("1. para negro");
                  System.out.println("2. para rojo");
                  System.out.println("3. para blanco ");
                    n2 = leer.nextInt();
                    switch (n2){
                        case 1:
                            color="negro";
                            break;
                        case 2: 
                            color="rojo";
                            break;
                        case 3:
                            color="blanco";
                            break;
                        default:
                             System.out.println("SELECCIONO UN NUMERO ERRONEO");
                    }
              
            break;
          case 2:
                            TipoA="SUV";
                          System.out.println("----- ELIJA EL COLOR DEL CARRO -----");
                          System.out.println("");
                          System.out.println("1. para negro");
                          System.out.println("2. para rojo");
                          System.out.println("3. para blanco ");
                            n2 = leer.nextInt();
                            switch (n2){
                                case 1:
                                    color="negro";
                                    break;
                                case 2: 
                                    color="rojo";
                                    break;
                                case 3:
                                    color="blanco";
                                    break;
                                default:
                                     System.out.println("SELECCIONO UN NUMERO ERRONEO"); }
            break;
          case 3:
                        TipoA="Camioneta";
                        System.out.println("----- ELIJA EL COLOR DEL CARRO -----");
                        System.out.println("");
                        System.out.println("1. para negro");
                        System.out.println("2. para rojo");
                        System.out.println("3. para blanco ");
                          n2 = leer.nextInt();
                          switch (n2){
                              case 1:
                                  color="negro";
                                  break;
                              case 2: 
                                  color="rojo";
                                  break;
                              case 3:
                                  color="blanco";
                                  break;
                              default:
                                   System.out.println("SELECCIONO UN NUMERO ERRONEO");}
          break;
          default:System.out.println("Seleciono un numero erroneo"); }
        System.out.println("Su tipo de Auto es: "+TipoA);
        System.out.println("Su COLOR DE AUTO ES: "+color);
        
        
    }
    
}
