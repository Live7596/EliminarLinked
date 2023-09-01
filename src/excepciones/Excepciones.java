/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author OMAR
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
      try{//intentar
          int resultado = 3/0;
      }
      catch(Exception e){//En caso de que no se pueda dividir entre cero agarrar una excepcion
          System.out.println("No se puede dividir por cero!!");
      }*/
        
    int edades [] ={15,12,23,30};

    try{
    
        System.out.println("La edad de la posicion 4 es: "+ edades [4]);
    
        }
    catch(Exception e ){
        System.out.println("Intentaste acceder a un indice que no existe");
        
    }
    }
    
}
