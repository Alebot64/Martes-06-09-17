/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alejandra
 */
public class Num 
{
        Scanner leer = new Scanner (System.in);
        int ingresado = 0;
        int pares = 0;
        int suma = 0;
        // N U M E R O S
        
        while (pares < 5){
   
        ingresado = leer.nextInt();
    
        if(ingresado%2==0)
         {
            pares++;
         }
            if(ingresado >=20)
         {
          suma=suma+ingresado;
       
         }
     
         }
 
    }
