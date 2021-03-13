import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // for (int i = 0; i < 100; i++) {
        //     numbers.add(i);
        // }
        // System.out.println(numbers.size());
        // System.out.println("numbersの数:" + numbers.size());
        // for (int i = 0; i < 100; i++) {
        //     System.out.println("iの数:" + i);
        //     System.out.println(numbers.get(i));
        // }
        QueueMethod1();
    }

    static void CollectionMethod1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(Integer.valueOf(100));
        numbers.add(Integer.valueOf(200));
        Integer integer = numbers.get(0);
        int i0 = integer.intValue();
        // [100, 200]
        System.out.println(numbers);
        // 100(Integer)
        System.out.println(integer);
        // 100(int)
        System.out.println(i0);
    }

    static void CollectionMethod2() {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        // int型の値をInteger（ラッパークラス）に包んで格納
        integerList.add(100);
        integerList.add(200);
        // Integerオブジェクトの値をint型で取り出せる
        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1 ));
    }

    static void HashMapMethod1() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"2");
        map.put(10,"20");
        map.put(100,"200");
        // key=value、を表示
        System.out.println(map.entrySet());
        // valueを表示
        System.out.println(map.values());
        // keyを表示
        System.out.println(map.keySet());
        System.out.println(map.get(10));
    }

    static void HashSetMethod1() {
        // 同じ値が格納されるのを防ぐ
        HashSet<Integer> set = new HashSet<Integer>();
        // 同じ値がなければtrueで格納される
        // あればfalseで格納されない
        System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		System.out.println(set.add(4));

        System.out.println(set);
        System.out.println(set.contains(4));
    }

    static void HashSetMethod2() {
        HashSet<Double> set = new HashSet<Double>();
        set.add(1.0);
        set.add(10.0);
        set.add(100.0);
        // HashMap,HashSetは要素番号(i番目)を指定できない
        // 現在の値を取り出し、イテレータは次の値を参照
        Iterator<Double> it = set.iterator();
        for (int i = 0; i < set.size() + 1; i++) {
            try {
                System.out.println(it.next());
            } catch (NoSuchElementException e) {
                System.out.println(e);
            }
        }
    }

    static void ForMethod1() {
        Boolean[] months = { true, false, true, false };
        // 配列の各要素を一次変数で取り出す
        for(Boolean str: months) {
            System.out.println(str);
        }
    }

    static void QueueMethod1() {
        // 要素の取り出し方法：キュー、スタック 
        // ArrayListは不可
        Queue<String> queue = new LinkedList<String>();
        // "11111"を追加
        queue.offer("342141");
        queue.offer("2222");
        queue.offer("r3er3");
        // 先頭の要素を取り出す
        System.out.println(queue.peek());
        // 追加順（古い順）に取り出す
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}