package cursovicentecarratala.Capitulo5;

public class Club {

    private String nombre;
    private String apellido;
    //Al volver static el contador lo mantiene fijo y puede cumplir su fun
    //Si no es static se reinicia cada que se crea la instancia de un nuevo
    //miembro.
    private static int contador=0;

    public Club(String nom, String ape) {
        nombre = nom;
        apellido = ape;
        contador++;
        System.out.printf("Constructor para %s %s hay %d\n", nombre, apellido, contador);
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    public static int getMiembros(){
        return contador;
    }
}
