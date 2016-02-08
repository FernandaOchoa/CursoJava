package cursovicentecarratala.Capitulo4;

public class ControlIfAnidado {

    public static void main(String[] args) {
        String miciudad = "Mallorca";
        int edad = 33;

        if (miciudad == "Valencia") {

            if (edad < 30) {
                System.out.println("Vives en Valencia y tienes menos de 30 años");
            } else {
                System.out.println("Vives en Valencia y tienes mas de 30 años");
            }
        } else if (edad < 30) {
            System.out.println("Vives en Mallorca y tienes menos de 30 años");
        } else {
            System.out.println("Vives en Mallorca y tienes mas de 30 años");
        }
    }

}
