package Exercici_1;

/*Exercici 1. Creu una classe amb un main() que generi un objecte de la classe Exception dins d'un bloc try.Proporcioni al
çconstructor de Exception un argument String. Capturi l'excepció dins d'una clàusula catch i imprimeixi l'argument String.
Afegeixi una clàusula finally i imprimeixi un missatge per a demostrar que va passar per allí.
 */

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int letra;

        try{
            System.out.println("Escribe un valor numérico: ");
            x = sc.nextInt();
            System.out.println("Correcto");
        }catch (Exception e){
            System.out.println("Error InputMismatchException: El programa no se ha ejecutado porque no se ha " +
                    "indicado un valor correcto");
        }

        finally {
            System.out.println("El programa ha pasado por Finally");
      }
    }
}


