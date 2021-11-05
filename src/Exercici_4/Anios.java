package Exercici_4;

import java.util.Scanner;

/*
 Creu la seva pròpia classe de Exception utilitzant la paraula clau 'extends'.
 Escrigui un constructor per a aquesta classe que prengui un argument String i l'emmagatzemi dins de l'objecte com
 una referència de tipus String.
 Escrigui un mètode que mostri la cadena de caràcters emmagatzemada.
 Creu una clàusula try-*catch per a provar la nova excepció.
 */
public class Anios {


    public static void main(String[] args) {

        //Solicitamos a usuario la edad que tiene:
        int edad;
        final int edadMinima = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica tu edad para acceder al sistema: ");
        edad = sc.nextInt();

        //Abrimos bloque try-catch para comprobar si la edad es válida o no.
        try {
            //Si la edad que nos indica usuario es mayor de 18, podrá pasar.
            if(edad>edadMinima ){
                System.out.println("Bienvenido, puedes pasar. ");
                //De lo contrario, haremos saltar la excepción:
            } else {
                throw new ExcepcionEdad("Lo sentimos, no puedes acceder ");
            }
            //Capturamos la excepción:
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
