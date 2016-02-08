package cursovicentecarratala.Capitulo6;
public class Matematicas {
    
    public static void main(String[] args){
        //Math.abs <- Valor absoluto
        System.out.println(Math.abs(-20));
        
        //Math.round <- Redondea un valor
        System.out.println(Math.round(7.2));
        
        //Math.ceil <- Redondea hacia arriba 7.2 ->8
        System.out.println(Math.ceil(7.2));
        
        //Math.floor <- Redondea hacia abajo 7.7 ->7
        System.out.println(Math.floor(7.7));
        
        //Math.min <-Encuentra el valor minimo entre dos valores (el pequeño de 2)
        System.out.println(Math.min(7.7,8.2));
        
        //Math.max <-Encuentra el valor maximo de 2 numeros
        System.out.println(Math.max(17.7, 8.2));
        
        //Para obtener el exponencial
        System.out.println(Math.E);
        
        //Para obtener Pi
        System.out.println(Math.PI);
        
        //Math.pow <-Elevar numeros a potencia 3 (base) a 2(exponente) 3^2
        System.out.println(Math.pow(3, 2));
        
        //Math.sqrt <- Obtener la raiz cuadrada de un numero (square root)
        System.out.println(Math.sqrt(16));
    }
    
}
