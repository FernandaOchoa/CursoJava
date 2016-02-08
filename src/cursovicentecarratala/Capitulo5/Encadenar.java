package cursovicentecarratala.Capitulo5;

public class Encadenar {

    private int mes;
    private int dia;
    private int anio;
    
    //Constructor
    public Encadenar(int m, int d, int a){
        mes = m;
        dia = d;
        anio = a;
        
        System.out.printf("El constructor es: %s\n", this);
    }
    
    //Cuando un metodo no envie un texto formateado,sino que lo envie con this
    //Lo cazaremos con toString y ahi estaran las instrucciones que nos indicaran
    //Como formatear ese metodo preciso
    
    public String toString(){
        return String.format("%d/%d/%d", mes,dia,anio);
    }
}
