package number6;

import java.util.ArrayList;
import java.util.List;

public class max<T extends Comparable<T>> implements Comparable<T> {

    List<T> lista = new ArrayList<>();


    public void agregar(T t){
        lista.add(t);

    }

    public T maximo(){
        T maximo = lista.get(0);
        for(T t : lista){
            if(t.compareTo(maximo) > 0){
                maximo = t;

            }
            

        }
        return maximo;

        

        
        

    }










    

    @Override
    public int compareTo(T o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
