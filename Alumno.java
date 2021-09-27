class Alumno {

    static String nombre = "Víctor Freyre";
    public static double[] notas = {90, 80, 96, 79, 100};

    // Método que calcula el promedio de las calificaciones.
    public static double getPromedio(){
        double suma = 0;
        for(int i=0; i<5; i++){
            suma += notas[i];
        }
        double promedio = suma/5;
        return promedio;
    }


    // Método que transforma el promedio numérico en una calificación alfabética.

    public static String getCalificacion(){
        String calificacion;

        if(getPromedio() >= 91) {
            calificacion = "A";
        }

        else if(getPromedio() >= 81){
            calificacion = "B";
        }

        else if(getPromedio() >= 71){
            calificacion = "C";
        }

        else if(getPromedio() >= 61){
            calificacion = "D";
        }

        else if(getPromedio() >= 51){
            calificacion = "E";
        }

        else{
            calificacion = "F";
        }
        return calificacion;
    }


    // Método que imprime en pantalla los datos del alumno.

    public static String getImprimir(){

        System.out.println("Nombre del estudiante: " + Alumno.nombre);
        for(int i=0; i<5; i++){
            System.out.println("Calificación " + (i+1) + ": " + Alumno.notas[i]);
        }
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Calificación: " + getCalificacion());

        return null;
    }
    
    public static void main(String[] args) {
        final String imprimir = Alumno.getImprimir();
    }
}
