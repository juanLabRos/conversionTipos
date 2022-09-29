/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Vamos a solicitar al usuario un entero por teclado que va a ser realmente un to String 
package conversiontipos;

import java.util.Scanner;

/**
 *
 * @author Alumnos Mañana
 */
public class ConversionTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciar una variable de tipo Scanner
        Scanner lectura = new Scanner (System.in);
        
        //Solicitamos por teclado el número entero 
        System.out.println("Introduce el número entero que quieres que muestre");
        
        //Convierto el String a tipo entero
        int entero = Integer.parseInt(lectura.nextLine());
        
        //Muestro el resultado por pantalla
        System.out.println("El número que has tecleado es "+entero);
        
        //En función de una nota decir si el alumno está suspenso, aprobado, bien, notable, sobresaliente
        
        
       
    }
    
}
