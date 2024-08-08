import java.util.*;

public class LRUCache<T> {
    private final LinkedHashMap<Integer, T> cache;
    private final int maxSize;
    private int currentIndex = 0;

    public LRUCache(int maxSize) {
        this.maxSize = maxSize;
        this.cache = new LinkedHashMap<Integer, T>(maxSize, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, T> eldest) {
                return size() > maxSize;
            }
        };
    }

    public void addElement(T item) {
        currentIndex++;
        cache.put(currentIndex, item);
    }

    public T getElement(int index) {
        return cache.getOrDefault(index, null);
    }

    public List<T> printAll() {
        return new ArrayList<>(cache.values());
    }

    public static void main(String[] args) {
        LRUCache<String> stringLRUCache = new LRUCache<>(6);

        stringLRUCache.addElement("Bir");
        stringLRUCache.addElement("Iki");
        stringLRUCache.addElement("Uc");
        stringLRUCache.addElement("Dord");
        stringLRUCache.addElement("Bes");
        stringLRUCache.addElement("Alti");
        stringLRUCache.addElement("Yeddi");

        System.out.println("0 indeksindeki element: " + stringLRUCache.getElement(0));
        System.out.println("Butun elementler: " + stringLRUCache.printAll());


    }
}
