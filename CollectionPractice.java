import java.util.ArrayList;

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
        CollectionMethod1();
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
}