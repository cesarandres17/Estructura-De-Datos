package PairList;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class PairList<T,V> implements Iterable<Map.Entry<T,V>>  {
    Map<T,V> mapa =  new LinkedHashMap<>();



    public void PairListadd(T t, V v){
        mapa.put(t, v);

    }

    public void PairListDelete(T t){
        Iterator<T> it = mapa.keySet().iterator(); 
        while(it.hasNext()){
            T key = it.next();
            if(key.equals(t)){
                it.remove();
            }

        } 
    
    }



    public void ParListPares(){
        Iterator<T> it = mapa.keySet().iterator(); 
        while(it.hasNext()){
            T key = it.next();
            int keyValue = (int)key;

            if(keyValue%2==0){
                System.out.println(mapa.get(key));

            }

        }

    }

    @Override
    public Iterator<Entry<T, V>> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }



    

    


    
    
























   
}
