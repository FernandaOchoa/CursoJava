package cursovicentecarratala.Capitulo5;
//Publico: Se puede acceder desde dentro y fuera de la clase, universalmente visible
//Privado: Unicamente es visible desde dentro de la clase que lo ha generado
public class PublicoYPrivado {
    public static void main (String[] args){
        SegundaClase hola = new SegundaClase();
        
       // hola.mivariable=1; no es posible llamarla desde la otra clase ya que es privada
       hola.variable=1; 
    }
    
}
