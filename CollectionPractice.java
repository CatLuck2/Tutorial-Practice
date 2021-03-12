import java.util.ArrayList;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
        for (int i = 0; i < 100; i++) {
            System.out.println("numbersの数:" + numbers.size());
            System.out.println("iの数:" + i);
            System.out.println(numbers.get(i));
        }
    }
}