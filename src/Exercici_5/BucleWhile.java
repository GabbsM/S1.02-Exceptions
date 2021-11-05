package Exercici_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Defineixi un comportament de tipus represa utilitzant un bucle 'while' que es repeteixi fins que es deixi de generar una excepció.
 */
public class BucleWhile {
    public static void main(String[] args) {
        boolean repeticion = true;
        int numero;
        Scanner sc = new Scanner(System.in);

        while (repeticion){
            try {
                System.out.println("Indica un número: ");
                numero=sc.nextInt();
                System.out.println("Correcto");
                repeticion=false;
            }catch (Exception e){
                System.out.println("Incorrecto, debe ser un número");
                sc.nextLine();
            }

        }

    }
}