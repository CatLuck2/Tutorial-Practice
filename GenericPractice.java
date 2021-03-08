public class GenericPractice {
    public static void main(String[] args) {
        GenericClass1<Integer> class1 = new GenericClass1<>();
        GenericClass1<Integer> class2 = new GenericClass1<>();
        class1.set("100");
        class2.set(100);
        // GenericClass2<Integer, Integer> genericClass2 = new GenericClass2<>(20, 100);
        // System.out.println(rawbox.getKey());
        compare(class1, class2);
    }

    public static <K,V> void compare(GenericClass2<K,V> t1, GenericClass2<K,V> t2) {
    }
}

class GenericClass1<T extends Number> {
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

    GenericClass2(K k, V v) {
        this.k = k;
        this.v = v;
    }

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