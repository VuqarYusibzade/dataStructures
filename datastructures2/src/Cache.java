import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cache<T> {
    private final HashMap<Integer, T> hashMap = new HashMap<>();

    public void addElement(Integer key, T item) {
        hashMap.put(key, item);
    }

    public T getElement(Integer key) {
        return hashMap.getOrDefault(key, null);
    }

    public void removeElement(int key) {
        hashMap.remove(key);
    }

    public List<T> printAll() {
        return new ArrayList<>(hashMap.values());
    }

    public void clearCache() {
        hashMap.clear();
    }
}
