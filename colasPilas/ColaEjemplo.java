package colasPilas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    
    public static void main(String[] args) {
        // Crear una cola usando LinkedList
        Queue<String> cola = new LinkedList<>();
        
        System.out.println("=== EJEMPLO DE COLA (QUEUE) ===");
        
        // Agregar elementos a la cola (enqueue)
        System.out.println("\nAgregando elementos a la cola:");
        cola.offer("Persona 1");  // offer() es preferible sobre add()
        cola.offer("Persona 2");
        cola.offer("Persona 3");
        cola.offer("Persona 4");
        
        System.out.println("Cola actual: " + cola);
        
        // Ver el primer elemento sin removerlo
        System.out.println("\nPrimer elemento (peek): " + cola.peek());
        System.out.println("Cola después de peek: " + cola);
        
        // Remover elementos de la cola (dequeue)
        System.out.println("\nRemoviendo elementos de la cola (FIFO):");
        while (!cola.isEmpty()) {
            String elemento = cola.poll();  // poll() es preferible sobre remove()
            System.out.println("Atendiendo a: " + elemento);
            System.out.println("Cola restante: " + cola);
        }
        
        // Ejemplo con números
        System.out.println("\n=== EJEMPLO CON NÚMEROS ===");
        Queue<Integer> colaNumeros = new LinkedList<>();
        
        colaNumeros.offer(10);
        colaNumeros.offer(20);
        colaNumeros.offer(30);
        
        System.out.println("Cola de números: " + colaNumeros);
        
        // Procesar todos los elementos
        System.out.println("Procesando números:");
        while (!colaNumeros.isEmpty()) {
            int num = colaNumeros.poll();
            System.out.println("Procesando: " + num + " (doble: " + (num * 2) + ")");
        }
    }
}
