# Proyecto: Uso de Clases Genéricas en Java

Este proyecto demuestra el uso práctico de **clases genéricas** en Java. Se implementa un contenedor genérico llamado `Repository` que permite almacenar y manipular elementos de cualquier tipo, así como una clase `App` que ilustra su uso.

## Contenido del Proyecto

- **`Repository<T>`**: Clase genérica que actúa como un repositorio para almacenar elementos.
- **`App`**: Clase principal que ejecuta ejemplos de uso de `Repository`.

---

## Clases Principales

### **1. Clase `Repository<T>`**
Una clase genérica que permite realizar operaciones sobre una colección de elementos de un tipo específico.

#### Métodos principales:
- **`void add(T item)`**: Agrega un elemento al repositorio.
- **`List<T> getAll()`**: Devuelve todos los elementos del repositorio.
- **`Optional<T> getByIndex(int index)`**: Busca un elemento por índice.
- **`boolean removeByIndex(int index)`**: Elimina un elemento por su índice.
- **`boolean remove(T item)`**: Elimina un elemento por referencia.
- **`boolean contains(T item)`**: Verifica si el repositorio contiene un elemento específico.
- **`int size()`**: Devuelve la cantidad de elementos en el repositorio.
- **`void clear()`**: Limpia todos los elementos del repositorio.

#### Interpretación:
La clase `Repository<T>` es un contenedor genérico que simplifica la gestión de datos, haciendo que el código sea más reutilizable y fácil de extender.

---

### **2. Clase `App`**
Punto de entrada del proyecto. Proporciona ejemplos prácticos para demostrar el uso de `Repository`.

#### Ejemplos de uso:
1. Crear repositorios para diferentes tipos de datos (enteros y cadenas).
2. Realizar operaciones como agregar, eliminar, buscar y verificar elementos.
3. Manejar índices válidos e inválidos con `Optional`.