


package tallerRepaso;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tarea<T>  implements Comparable<Tarea<T>> {
    List<Tarea<T>> ListaDeTareas = new ArrayList<>();


    public T descripcion;
    public T prioridad;
    public T fechaVencimiento;

    public  Tarea(T descripcion,T prioridad,T fechaVencimiento){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;

    }

    public void agregarTarea(Tarea<T> tarea){
        ListaDeTareas.add(tarea);
    }

    public Tarea<T> obtenerTareaPrioridadAlta(){
        Tarea<T> tareaProritara = ListaDeTareas.get(0);
        for(Tarea<T> tarea : ListaDeTareas ){
            if(((Comparable)tarea.prioridad).compareTo(((Comparable)tareaProritara.prioridad)) > 0){
                tareaProritara = tarea;
            }

        }
        return tareaProritara;

    }

    public void mostrarTraeasFecha(){
        for(Tarea<T> tarea :  ListaDeTareas){
            String fechastr = (String)tarea.fechaVencimiento;
            if(!fechastr.isEmpty()){
                Date fecha = Date.valueOf(fechastr);
                Date fechaHoy = new Date(System.currentTimeMillis());
                if(fecha.before(fechaHoy)){
                    System.out.println(tarea);
                }
            }

        }

    }

    @Override
    public int compareTo(Tarea<T> o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString() {
        return "Tarea [ListaDeTareas=" + ListaDeTareas + ", descripcion=" + descripcion + ", prioridad=" + prioridad
                + ", fechaVencimiento=" + fechaVencimiento + "]";
    }






















    
    
}