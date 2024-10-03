package PROMEDIOGRUPO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {
    //* Programa que calcula el promedio de grupo 
    // El tamaño del grupo es N 
    // Las calificaiones se leen y se almacenan en un arreglo tamaño N

    // arreglo de un tipo de dato abstracto (TDA)
    public static estudiante[] estudiantes;

    // Para lectura de datos
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    public static void leerEstudiantes() throws IOException{
        String matricula, nombre;
        for ( int i = 0; i < estudiantes.length; i++){
            System.out.println("---------------------------------------------");
            System.out.println("Informacion del estudiante [" + (i+0) + "]");
            System.out.println("Matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            estudiante e = new estudiante(matricula, nombre);
            System.out.println("Escribe calificaion de Estructuras: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificaion de Evaluacion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("Escribe calificaion de Ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e; // Agregamos un objeto Estudiante al arreglo
        }
    }

    public static void imprimirEstudiantes() {
        for ( estudiante e : estudiantes){
            System.out.println(e.toString());
        }
    }
 
    public static double calcularPromedioGrupo(){
        double suma = 0;

        for ( estudiante e : estudiantes ){
            suma += e.getPromedio();
        }

        return suma /  estudiantes.length;

    }

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo
        double promedio; // Variable para el promedio del grupo

        System.out.println("Programa que calcula el promedio del grupo");
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiante
        estudiantes = new estudiante[N];

        // Lectura de la informacion de los estudiantes
        leerEstudiantes();

        // Imprimir el contenido el arreglo estudiantes
        imprimirEstudiantes();

        // Calcular el promedio del grupo
        promedio = calcularPromedioGrupo();

        System.out.println("El promedio del grupo es: " + promedio);
    }
}

