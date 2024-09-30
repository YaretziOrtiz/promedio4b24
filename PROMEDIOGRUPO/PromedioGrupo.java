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


    public static void leer_estudiantes() throws IOException{
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

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo



// arreglo de tipo de datos primitivo (double)
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // Variable para sumar calificaciones
        double promedio; // Variable para el promedio del grupo

        System.out.println("Programa que calcula el promedio del grupo");
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiante
        estudiantes = new estudiante[N];

        // construimos el arreglo de calificaciones
        calificaciones = new double[N];
        // // leer las calificaciones de cada alumno
        // for ( int i = 0; i < calificaciones.length; i++){
        //     System.out.println("Escriba la calificacion del alumnos" + (i+1) + ": ");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }
        // promedio = suma / N;

        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++ ){
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}

