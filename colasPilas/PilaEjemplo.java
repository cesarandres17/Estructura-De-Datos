package colasPilas;

import java.util.Stack;

public class PilaEjemplo {
    
    public static void main(String[] args) {
        // Crear una pila
        Stack<String> pila = new Stack<>();
        
        System.out.println("=== EJEMPLO DE PILA (STACK) ===");
        
        // Agregar elementos a la pila (push)
        System.out.println("\nAgregando elementos a la pila:");
        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3");
        pila.push("Libro 4");
        
        System.out.println("Pila actual: " + pila);
        
        // Ver el elemento superior sin removerlo
        System.out.println("\nElemento superior (peek): " + pila.peek());
        System.out.println("Pila después de peek: " + pila);
        
        // Remover elementos de la pila (pop)
        System.out.println("\nRemoviendo elementos de la pila (LIFO):");
        while (!pila.isEmpty()) {
            String elemento = pila.pop();
            System.out.println("Sacando: " + elemento);
            System.out.println("Pila restante: " + pila);
        }
        
        // Ejemplo con números
        System.out.println("\n=== EJEMPLO CON NÚMEROS ===");
        Stack<Integer> pilaNumeros = new Stack<>();
        
        pilaNumeros.push(100);
        pilaNumeros.push(200);
        pilaNumeros.push(300);
        
        System.out.println("Pila de números: " + pilaNumeros);
        
        // Procesar todos los elementos
        System.out.println("Procesando números:");
        while (!pilaNumeros.isEmpty()) {
            int num = pilaNumeros.pop();
            System.out.println("Procesando: " + num + " (mitad: " + (num / 2) + ")");
        }
    }
}
