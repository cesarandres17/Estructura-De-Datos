# Colas y Pilas en Java

Este directorio contiene ejemplos prácticos de colas (Queue) y pilas (Stack) en Java.

## Archivos

### 1. ColaEjemplo.java
- Demuestra el uso de `Queue<String>` y `Queue<Integer>`
- Muestra operaciones: `offer()`, `poll()`, `peek()`
- Principio FIFO (First In, First Out)

### 2. PilaEjemplo.java  
- Demuestra el uso de `Stack<String>` y `Stack<Integer>`
- Muestra operaciones: `push()`, `pop()`, `peek()`
- Principio LIFO (Last In, First Out)

### 3. ComparacionColaPila.java
- Comparación directa entre cola y pila
- Usa los mismos datos para mostrar diferencias
- Tabla resumen con características

### 4. ImplementacionPropia.java
- Implementación propia de cola y pila usando ArrayList
- Clases `MiCola<T>` y `MiPila<T>`
- Explica el funcionamiento interno

## Operaciones Principales

### Cola (Queue)
- `offer(elemento)` - Agregar al final
- `poll()` - Remover del inicio
- `peek()` - Ver el primero sin remover
- `isEmpty()` - Verificar si está vacía

### Pila (Stack)
- `push(elemento)` - Agregar al tope
- `pop()` - Remover del tope
- `peek()` - Ver el tope sin remover
- `isEmpty()` - Verificar si está vacía

## Diferencia Clave

- **Cola**: FIFO = El primero que entra es el primero que sale (como una fila)
- **Pila**: LIFO = El último que entra es el primero que sale (como una pila de platos)

## Para ejecutar

```bash
javac colasPilas/*.java
java colasPilas.NombreDeLaClase
```
