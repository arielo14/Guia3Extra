/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numPares=0, numImpares=0, num=0;
    boolean ban = false;    
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
    System.out.println("Ingrese un numero entero");
    int numEntero = leer.nextInt(); // Leer un entero
    num=num+1;
    
        do
        {
            if ((numEntero%2)==0)
            {
                numPares=numPares+1;
            }
            else
            {
                numImpares=numImpares +1;   
            }
        if ((numEntero%5) == 0)
        {
            System.out.println("La cantidad de nros Leidos es: " + num);
            System.out.println("La cantidad de nros PARES es: " + numPares);
            System.out.println("La cantidad de nros IMPARES es: " + numImpares);
            ban = true;
        }
        else
        {
          System.out.println("Ingrese un numero entero");
          numEntero = leer.nextInt(); // Leer un entero
          num=num+1;  
        }
        } while (ban== false) ;   
                
        
    }
 }
   
