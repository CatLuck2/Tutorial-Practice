/*
<>：ダイヤモンド演算子
*/

public class GenericPractice {
    public static void main(String[] args) {
        // 型推論
        GenericClass3<String, Integer> class31 = new GenericClass3<>();
        GenericClass3<String, Exception> class32 = new GenericClass3<>();
        test(class31);
        test(class32);
    }

    /*
        GenericClass3<String, Integer> class31 = new GenericClass3<>();
        GenericClass3<String, Exception> class32 = new GenericClass3<>();
        test(class31); -> OK
        test(class32); -> OK
    */
    public static <K,V> void compare(GenericClass2<K,V> t1, GenericClass2<K,V> t2) {
    }

    // test(GenericClass1<Integer>)はエラーになる
    // class<A>とclass<B>に互換性はない
    // 両者の親は、Object()
    public static void test(GenericClass4<String> n) {
    }
}

// 境界（extendsでデータ型の型を制限）
// IntegerはNumberのサブクラス
class GenericClass1<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public boolean compare(T otherT) {
        if (this.t == otherT) {
            return true;
        } else {
            return false;
        }
    }
}

// ジェネリクスのインターフェース
public interface GenericInterface<K,V> {
    public K getKey();
    public V getValue();
}

// インターフェースを継承
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

class GenericClass3<A,B> extends GenericClass4<A> {

}

class GenericClass4<A> {

}

// public class BoxDemo {

//     public static <U> void addBox(U u, 
//         java.util.List<Box<U>> boxes) {
//       Box<U> box = new Box<>();
//       box.set(u);
//       boxes.add(box);
//     }
  
//     public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
//       int counter = 0;
//       for (Box<U> box: boxes) {
//         U boxContents = box.get();
//         System.out.println("Box #" + counter + " contains [" +
//                boxContents.toString() + "]");
//         counter++;
//       }
//     }
  
//     public static void main(String[] args) {
//       java.util.ArrayList<Box<Integer>> listOfIntegerBoxes =
//         new java.util.ArrayList<>();
//       BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
//       BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
//       BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
//       BoxDemo.outputBoxes(listOfIntegerBoxes);
//     }
//   }