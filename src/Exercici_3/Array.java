package Exercici_3;
// Exercici 3. Escrigui codi per a generar i capturar una excepció ArrayIndexOutOfBoundsException.

public class Array {

    public static void main(String[] args) {

        // Declaramos el array con capacidad de 3 elementos:

        int [] mi_array = new int[3];


        //Creamos los elementos con sus respectivos valores. Creamos un bucle for dentro del bloque try-catch para
        // imprimir los valores .

        try {


            mi_array[0] = 96;
            mi_array[1] = 14;
            mi_array[2] = 11;

            //Creamos el elemento que va a ocasionar el fallo:
            mi_array[3] = 41;

            for (int i = 0; i < 3 ; i++) {
                System.out.println("El valor del elemento " + i + " es " + mi_array[i]);

            }

        }catch (Exception e){
            //Capturamos y escribimos el mensaje que se va a imprimir si existe una excepción ArrayIndexOutOfBounds:
            System.out.println("El programa no se ha ejecutado porque hay más elementos de los permitidos en el array");
            //e.printStackTrace();

        }

    }

}
