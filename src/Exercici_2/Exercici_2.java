package Exercici_2;

/* Exercici 2. Defineixi una referència a un objecte i inicialitzi-la amb null. Tracti d'invocar un mètode a través d'aquesta
   referència. Ara envolti el codi amb una clàusula try-*catch per a capturar l'excepció.*/

public class Exercici_2 {
    public static void main(String[] args) {

        try {
            //Iniciamos un objeto en null dentro un try-catch:
            String a = null;
            //Llamamos al metodo "lenght", que nos dará un NullPointerExcepction por iniciar en null:
            System.out.println("La palabra " + a + " tiene " + a.length() + " letras");

            //Capturamos la excepción, indicamos el motivo y mostramos el tipo de excepción que es(opcional):
             }catch (NullPointerException e){
                System.out.println("Error. Debe existir un String");
               // e.printStackTrace();

        }

    }
}


