/**
 * @author Daw120
 
   3. Modifica el ejercicio 2 para que, indicando dos números n y m, diga que
      cantidad hay que sumarle a n para que sea múltiplo de m
 */
package com.solomongo.ejercicio3_hoja3;
import java.util.Scanner;
public class Ejercicio3_Hoja3 {
    public static void main(String[] args) { 
        
        int n, suma;
        int aux;
        int m;
        
        Scanner entrada = new Scanner(System.in); // con new nuevo elemento
        System.out.print("\n\t- Escribe numero: " );
        n =entrada.nextInt(); // la variable n sale de la entrada
        
        System.out.print("\n\t- Escribe numero para ser multiplo: ");
        m =entrada.nextInt(); // mismo que variable m tb sale de la entrada
        
        aux= n%m; // variable auxiliar realiza la operación divisoria que saca el resto
        suma= m-aux;   // variable suma dirá lo que resta el resto del total, lo que se faltara para ser multiplo
        System.out.print("\n..Hay que anadir "+suma+" para que sea multiplo de "+m);    
        
    }
}
