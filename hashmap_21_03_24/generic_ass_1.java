package hashmap_21_03_24;
class Pair<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter and setter methods for key
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    // Getter and setter methods for value
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class generic_ass_1 {
    public static void main(String[] args) {
        // Create Pair objects
        Pair<String, Integer> pair1 = new Pair<>("Apple", 5);
        Pair<Integer, Double> pair2 = new Pair<>(10, 3.14);

        // Retrieve and print key-value pairs
        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());

        // Update values
        pair1.setValue(10);
        pair2.setKey(20);

        // Retrieve and print updated key-value pairs
        System.out.println("\nAfter updating values:");
        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}