package cursovicentecarratala.Capitulo4;

public class ControlFor {

    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println("El valor del contador es de " + contador);
        }

        //For mejorado
        int matriz[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma = 0;

        for (int x : matriz) {
            suma += x;
        }
        System.out.println("El resultado de la suma es: "+suma);
    }
}
