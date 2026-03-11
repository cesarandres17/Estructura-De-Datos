package chapter4;

public class main {

    public static void main(){

        Repositorio<String> repositorio1 = new Repositorio<>();

        repositorio1.agregar("null");
        repositorio1.agregar("null2");
        repositorio1.agregar("null3");

       String resultado =  (String)repositorio1.obtener(2);

       System.out.println("el resultado es " + resultado);

        repositorio1.recorrerAtras();

    }


    
}
