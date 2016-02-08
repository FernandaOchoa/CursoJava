package cursovicentecarratala.Capitulo4;
//Me permite capturar errores en caso de que se produzcan

public class TryCatch {

    public static void main(String[] args) {
        int numero;
        String cadena = "hola";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero, es una cadena");
        }

    }
}
