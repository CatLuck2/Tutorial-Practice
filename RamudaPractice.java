public class RamudaPractice {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doSomething();
    }
}

class Outer {
    void doSomething() {
        // メソッド内でクラスを定義
        class Inner {
            void print() {
                System.out.println("Innerクラスのprintメソッド");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}