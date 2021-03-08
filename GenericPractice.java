public class GenericPractice {
    public static void main(String[] args) {
        GenericClass2<Integer, String> genericClass2 = new GenericClass2<>();
        genericClass2.set(20, "20");
        System.out.println(genericClass2.getKey());
        System.out.println(genericClass2.getValue());
    }
}

class GenericClass1<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}

public interface GenericInterface<K,V> {
    public K getKey();
    public V getValue();
}

class GenericClass2<K,V> implements GenericInterface<K,V> {
    private K k;
    private V v;

    public void set(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }
}