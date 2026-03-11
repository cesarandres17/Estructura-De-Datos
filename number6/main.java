package number6;

public class main {

    public static void main(){
        Max<Integer> max1 =  new Max();


        max1.agregar(2);
        max1.agregar(1);
        max1.agregar(3);
        max1.agregar(7);
        max1.agregar(9);

       int maximo = (int) max1.maximo();
       System.out.println("el objeto mayor es " + maximo);


        

    }
    
}
