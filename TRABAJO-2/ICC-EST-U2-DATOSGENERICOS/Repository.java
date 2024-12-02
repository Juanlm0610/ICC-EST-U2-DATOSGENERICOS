import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository<T> {
    private List<T> items = new ArrayList<>();

    // Agrega un elemento al repositorio
    public void add(T item) {
        items.add(item);
    }

    // Devuelve todos los elementos del repositorio
    public List<T> getAll() {
        return items;
    }

    // Busca un elemento por índice
    public Optional<T> getByIndex(int index) {
        if (index >= 0 && index < items.size()) {
            return Optional.of(items.get(index));
        } else {
            return Optional.empty();
        }
    }

    // Elimina un elemento por índice
    public boolean removeByIndex(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        } else {
            return false;
        }
    }

    // Elimina un elemento por referencia
    public boolean remove(T item) {
        return items.remove(item);
    }

    // Verifica si el repositorio contiene un elemento específico
    public boolean contains(T item) {
        return items.contains(item);
    }

    // Devuelve el tamaño del repositorio
    public int size() {
        return items.size();
    }

    // Limpia todos los elementos del repositorio
    public void clear() {
        items.clear();
    }
}
