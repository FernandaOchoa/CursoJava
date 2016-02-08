package cursovicentecarratala.Capitulo4;
//Aqui primero ejecuta el codigo y luego nos preguntamos si lo teniamos que
//haber ejecutado

//Hasta que se comprueba que es falsa ejecuta por lo menos una vez el codigo.
public class ControldoWhile {

    public static void main(String[] args) {
        int contador = 20;
        //do <- ejecuta un codigo 
        do {
            System.out.println(contador);
        } //Mientras se cumpla una (condicion)
        while (contador < 10);
    }

}
