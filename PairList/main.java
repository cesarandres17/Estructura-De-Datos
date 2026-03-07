package PairList;

public class main {

    public static void main(){
        PairList<Integer,String> pair1 = new PairList<Integer,String>();

        pair1.PairListadd(1,"hola1" );
        pair1.PairListadd(2,"hola2" );
        pair1.PairListadd(3,"hola3" );
        pair1.PairListadd(4,"hola3" );


        pair1.PairListDelete(3 );
        

        pair1.ParListPares();



    }
    
}
