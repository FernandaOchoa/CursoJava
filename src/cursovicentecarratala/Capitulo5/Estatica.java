package cursovicentecarratala.Capitulo5;

public class Estatica {

    public static void main(String[] args) {
        
        Club miembro1 = new Club("Juan","Lopez");
        Club miembro2 = new Club("Jaime","Jimenez");
        Club miembro3 = new Club("Javier","Juarez");
        
        System.out.println();
        System.out.println("El nombre del socio es: "+miembro1.getNombre());
        System.out.println("El apellido del socio es: "+miembro1.getApellido());
        System.out.println("El numero total de socios es: "+miembro1.getMiembros());
    }

}
