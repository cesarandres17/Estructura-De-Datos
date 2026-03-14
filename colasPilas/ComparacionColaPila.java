package colasPilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ComparacionColaPila {
    
    public static void main(String[] args) {
        System.out.println("=== COMPARACIÓN COLA VS PILA ===");
        
        // Mismos elementos para ambas estructuras
        String[] elementos = {"A", "B", "C", "D", "E"};
        
        // Demostración con COLA (FIFO: First In, First Out)
        System.out.println("\n--- COLA (QUEUE) - FIFO ---");
        Queue<String> cola = new LinkedList<>();
        
        System.out.println("Agregando elementos:");
        for (String elem : elementos) {
            cola.offer(elem);
            System.out.println("Encolar: " + elem + " -> Cola: " + cola);
        }
        
        System.out.println("\nRemoviendo elementos:");
        while (!cola.isEmpty()) {
            String elem = cola.poll();
            System.out.println("Desencolar: " + elem + " -> Cola restante: " + cola);
        }
        
        // Demostración con PILA (LIFO: Last In, First Out)
        System.out.println("\n--- PILA (STACK) - LIFO ---");
        Stack<String> pila = new Stack<>();
        
        System.out.println("Agregando elementos:");
        for (String elem : elementos) {
            pila.push(elem);
            System.out.println("Apilar: " + elem + " -> Pila: " + pila);
        }
        
        System.out.println("\nRemoviendo elementos:");
        while (!pila.isEmpty()) {
            String elem = pila.pop();
            System.out.println("Desapilar: " + elem + " -> Pila restante: " + pila);
        }
        
        // Tabla resumen
        System.out.println("\n=== RESUMEN ===");
        System.out.println("COLA (Queue):");
        System.out.println("  - FIFO: First In, First Out");
        System.out.println("  - offer() para agregar");
        System.out.println("  - poll() para remover");
        System.out.println("  - peek() para ver sin remover");
        System.out.println("  - Ejemplo: fila de banco, cola de impresión");
        
        System.out.println("\nPILA (Stack):");
        System.out.println("  - LIFO: Last In, First Out");
        System.out.println("  - push() para agregar");
        System.out.println("  - pop() para remover");
        System.out.println("  - peek() para ver sin remover");
        System.out.println("  - Ejemplo: pila de platos, historial de navegación");
    }
}
