package tallerRepaso;

public class clase {

    public static void main(String[] args) {
        Tarea<String> tarea = new Tarea<>("", "", "");
        tarea.agregarTarea(new Tarea<>("Tarea 1", "1", "2026-12-04"));
        tarea.agregarTarea(new Tarea<>("Tarea 2", "99", "2026-10-04"));
        
        tarea.obtenerTareaPrioridadAlta();
        Tarea<String> imprimir = tarea.obtenerTareaPrioridadAlta();
        System.out.print(imprimir);
        tarea.mostrarTraeasFecha();
    }
    
}
