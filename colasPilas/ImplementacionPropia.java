package colasPilas;

import java.util.ArrayList;
import java.util.List;

// Implementación propia de Cola usando ArrayList
class MiCola<T> {
    private List<T> elementos = new ArrayList<>();
    
    public void offer(T elemento) {
        elementos.add(elemento);
    }
    
    public T poll() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return elementos.remove(0);  // Remueve el primero
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return elementos.get(0);  // Ve el primero sin remover
    }
    
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
    
    public int size() {
        return elementos.size();
    }
    
    @Override
    public String toString() {
        return elementos.toString();
    }
}

// Implementación propia de Pila usando ArrayList
class MiPila<T> {
    private List<T> elementos = new ArrayList<>();
    
    public void push(T elemento) {
        elementos.add(elemento);
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);  // Remueve el último
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);  // Ve el último sin remover
    }
    
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
    
    public int size() {
        return elementos.size();
    }
    
    @Override
    public String toString() {
        return elementos.toString();
    }
}

public class ImplementacionPropia {
    
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTACIÓN PROPIA DE COLA Y PILA ===");
        
        // Probar MiCola
        System.out.println("\n--- MI COLA ---");
        MiCola<String> miCola = new MiCola<>();
        
        miCola.offer("Elemento 1");
        miCola.offer("Elemento 2");
        miCola.offer("Elemento 3");
        
        System.out.println("Cola: " + miCola);
        System.out.println("Primero (peek): " + miCola.peek());
        
        System.out.println("Removiendo:");
        while (!miCola.isEmpty()) {
            System.out.println("Poll: " + miCola.poll() + " -> " + miCola);
        }
        
        // Probar MiPila
        System.out.println("\n--- MI PILA ---");
        MiPila<String> miPila = new MiPila<>();
        
        miPila.push("Elemento A");
        miPila.push("Elemento B");
        miPila.push("Elemento C");
        
        System.out.println("Pila: " + miPila);
        System.out.println("Tope (peek): " + miPila.peek());
        
        System.out.println("Removiendo:");
        while (!miPila.isEmpty()) {
            System.out.println("Pop: " + miPila.pop() + " -> " + miPila);
        }
    }
}
