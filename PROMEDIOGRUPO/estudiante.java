package PROMEDIOGRUPO;

public class estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;
    private double promedio;

    // CONSTRUCTOR: QUE SEA PUBLICO Y QUE SE LLAME IGUAL QUE LA CLASE
    public estudiante(String m, String n){
        // objetivo del constructor: construir o inicializar el objeto
        this.matricula = m;
        this.nombre = n;
    }
// Getters y Setters
// Get: metodo consultor
// Set: metodo 
// Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matric) {
        this.matricula = matric;
    }
// Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// Estructuras
    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }
// Evaluacion
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }
// Ingles  
    public double getIngles() {
    return ingles;
    }

    public void setIngles(double ingles) {
    this.ingles = ingles;
    }
// Promedio
    public double getPromedio() {
    return promedio;
    }
    public void setPromedio() {
    this.promedio = (this.estructuras + this.evaluacion + this.ingles) / 3;
    }

    @Override
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

}
