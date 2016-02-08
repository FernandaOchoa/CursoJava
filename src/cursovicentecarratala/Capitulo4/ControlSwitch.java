package cursovicentecarratala.Capitulo4;

public class ControlSwitch {

    public static void main(String[] args) {
        int diadelasemana;
        diadelasemana = 2;

        switch (diadelasemana) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
        }
        System.out.println("Aqui termina el programa");
    }
}
