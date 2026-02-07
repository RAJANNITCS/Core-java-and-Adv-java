// WAP to create generics class with more than one parameter


// This class can be used to store pairs of related data (like key-value pairs).
class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

}

public class GenericsClassMultiParm {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("key : " + pair.getKey());
        System.out.println("Value : " + pair.getValue());
    }
}
