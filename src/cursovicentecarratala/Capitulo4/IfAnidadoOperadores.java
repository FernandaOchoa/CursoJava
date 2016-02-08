
package cursovicentecarratala.Capitulo4;

public class IfAnidadoOperadores {
    public static void main(String[] args){
        
       String miciudad = "Valencia";
       int edad = 25;
       String mimascota="Perro";
       
       // para decidir si una cosa u otra usamos OR || Con que una sea verdadera
       if (miciudad == "Valencia" && edad == 25 || mimascota=="Perro"){
           System.out.println("Es cierto que vives en Valencia y tienes 25 años");
       }else{
           System.out.println("Alguna de las afirmaciones no es cierta");
       }
    }
    
}
