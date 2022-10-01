# EJERCICIO-3-Hoja-3
asignación de Variables en JAVA. (Modificación de EJERCICIO 2 Hoja 3)

![33](https://user-images.githubusercontent.com/80227002/193427241-a0483046-b67a-4753-91c7-1f8efdbc5a06.png)

```java
/**
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
        Scanner entrada = new Scanner(System.in); 
        System.out.print("\n\t- Escribe numero: " );
        n =entrada.nextInt();  
        System.out.print("\n\t- Escribe numero para ser multiplo: ");
        m =entrada.nextInt();       
        aux= n%m;
        suma= m-aux;  
        System.out.print("\n..Hay que anadir "+suma+" para que sea multiplo de "+m);           
    }
}
```
