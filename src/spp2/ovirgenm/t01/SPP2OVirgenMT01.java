/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.t01;
import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        Scanner keyboard = new Scanner (System.in);
        String matricula;
        double cal1;
        double cal2;
        double cal3;
        double cal4;
        double cal5;
        
        double promedio;
        
        //Ejecución del programa
        System.out.println("Introduce tu matrícula: ");
        matricula = keyboard.nextLine();
        System.out.println("Primera calificación: ");
        cal1 = keyboard.nextDouble();
        System.out.println("Segunda calificación: ");
        cal2 = keyboard.nextDouble();
        System.out.println("Tercera calificación: ");
        cal3 = keyboard.nextDouble ();
        System.out.println("Cuarta calificación");
        cal4 = keyboard.nextDouble ();
        System.out.println("Quinta calificaión: ");
        cal5 = keyboard.nextDouble ();
        
        promedio = ((cal1+cal2+cal3+cal4+cal5)/5);
        System.out.println("Promedio obtenido: " + promedio);
        
          if(promedio > 6.9)
        System.out.println("APROBADO");
    if(promedio < 7.0)
        System.out.println("REPROBADO");
       
        
             
    }
    
}
