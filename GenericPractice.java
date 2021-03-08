public class GenericPractice {
    public static void main(String[] args) {
        
    }
}

public class GenericClass1<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}