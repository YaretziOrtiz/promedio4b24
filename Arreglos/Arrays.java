package Arreglos;
public class Arrays{

    public static void main(String[] args) {
        //declarar y construir un arreglo
        int[] array1 = new int[5];

        //Llenar el arreglo
        for ( int i = 0; i < 5; i++){
            array1[i] = i + 1;
        }

        // Imprimir el contenido del arreglo
        for ( int dato : array1){
            System.out.println("Contenido del arreglo: " + dato);
        }

        // declarando un arreglo (sin construirlo)
        int[] array2;
        int t = 10;
        array2 = new int[t]; //construir o inicializacion
        array2[0] = 250;
        System.out.println("arrays2[0] = " + array2[0]);

        // nombre es un array
        String nombre;
        char letra;
        nombre = "Yaretzi Ortiz";
        letra = nombre.charAt(index:6);
        System.out.println("Letra recuperada: " + letra);

    }
}
