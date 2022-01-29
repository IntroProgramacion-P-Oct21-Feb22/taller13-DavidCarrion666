/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        String nombre;
        
        int i = 1;
        while(i<=4){
            try {
            System.out.println("Ingrese calificación: \n");
            calificacion = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese nombre: \n");
            nombre = entrada.nextLine();        
             if (calificacion < 0 || calificacion > 10) {
                    throw new Exception("Parametro fuera del rango permitido");
                }
             
             if (nombre.equals("Mario") || nombre.equals("Pedro")
                     || nombre.equals("Ana") || nombre.equals("Luis")
                     || nombre.equals("Carolina")) {
                 throw new Exception("Nombre ingresado Denegado");
             }
            System.out.printf("Nombre: %s\n"
                    + "Calificación: %.1f\n", 
                    nombre, calificacion);
            i = i + 1;
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }

        }
        
        System.out.printf("%s\n", "Gracias por usar el sistema");
    }
}
