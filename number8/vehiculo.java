package number8;

import java.util.LinkedList;
import java.util.List;

public class vehiculo<T extends vehiculo<T>> {


    List<T> lista = new LinkedList<>();

    


    public void agregar(T t){
        lista.add(t);

    }


    public void alquilar(){

    }




    public void alquilarVehiculo(){
        for(T t: lista){
            t.alquilar();

        }
    }

     

    
}
