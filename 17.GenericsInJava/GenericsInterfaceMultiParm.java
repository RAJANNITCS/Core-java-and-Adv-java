// WAP to demostrating Generic Interfaces with Multiple Type Parameters

interface Pair<K, V> {

    K getKey();

    V getValue();

}

class KeyValuePair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

}

public class GenericsInterfaceMultiParm {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new KeyValuePair<>("Age", 30);
        System.out.println(pair.getKey() + "=" + pair.getValue());
    }
}
