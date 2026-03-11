package chapter4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repositorio<T> implements Iterable<T> {
    List<T> lista = new LinkedList<>();

    public void agregar(T t){
        lista.add(t);

    }

    public T obtener( int indice){
        return lista.get(indice);
    
    }


   @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){

            int indice=lista.size()-1;

            @Override
            public boolean hasNext(){
                if(indice>=0) return true;
                return false;
            }

            @Override
            public T next(){
                return lista.get(indice--);
            }  
        };
    }

    
}