package thu3;

public class OrderedPair <K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public OrderedPair(V value, K key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
