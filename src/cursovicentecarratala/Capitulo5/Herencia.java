package cursovicentecarratala.Capitulo5;

/**
 * La herencia permite que una clase, herede reciba las propiedades
 * y metodos dentro de la clase
 * 
 * Polimorfismo: Mediante el polimorfismo podemos variar las propiedades de un objeto
 * que ha heredado de otra clase.
 */
public class Herencia {
    
    public static void main(String[] args){
        Recibe digoHola = new Recibe();
       // Da digoHola2 = new Da();
        
        digoHola.YoDigoHola();
        digoHola.YoDigoAdios();
        //digoHola2.YoDigoHola();
       
    }
    
}
