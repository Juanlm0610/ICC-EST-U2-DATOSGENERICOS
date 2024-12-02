public class App {
    public static void main(String[] args) {
        // Crear un repositorio de enteros
        Repository<Integer> integerRepository = new Repository<>();
        integerRepository.add(10);
        integerRepository.add(20);
        integerRepository.add(30);

        System.out.println("Elementos en el repositorio de enteros: " + integerRepository.getAll());
        System.out.println("El repositorio contiene el número 20: " + integerRepository.contains(20));

        integerRepository.remove(20);
        System.out.println("Elementos después de eliminar 20: " + integerRepository.getAll());

        integerRepository.removeByIndex(0);
        System.out.println("Elementos después de eliminar el índice 0: " + integerRepository.getAll());

        // Crear un repositorio de cadenas
        Repository<String> stringRepository = new Repository<>();
        stringRepository.add("Java");
        stringRepository.add("Python");
        stringRepository.add("C++");

        System.out.println("\nElementos en el repositorio de cadenas: " + stringRepository.getAll());
        System.out.println("El repositorio contiene 'Java': " + stringRepository.contains("Java"));

        stringRepository.clear();
        System.out.println("Elementos después de limpiar el repositorio de cadenas: " + stringRepository.getAll());

        // Ejemplo de búsqueda con índice
        stringRepository.add("Pato");
        stringRepository.add("Juan");
        stringRepository.add("Xavier");

        System.out.println("\nNuevo repositorio de cadenas: " + stringRepository.getAll());
        stringRepository.getByIndex(1).ifPresent(value -> 
            System.out.println("Elemento en el índice 1: " + value)
        );

        // Intentar acceder a un índice no válido
        stringRepository.getByIndex(5).ifPresentOrElse(
            value -> System.out.println("Elemento en el índice 5: " + value),
            () -> System.out.println("No hay elemento en el índice 5")
        );
    }
}
