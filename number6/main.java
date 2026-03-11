package number6;

public class main {

    public static void main(){
        Max<String> max1 =  new Max();


        max1.agregar("hola");
        max1.agregar("hola");
        max1.agregar("hola");
        max1.agregar("hola1");
        max1.agregar("hola");

       String maximo =  max1.maximo();
       System.out.println("el objeto mayor es " + maximo);


        

    }
    
}
