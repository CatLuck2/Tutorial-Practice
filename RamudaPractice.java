// メソッドが1つの時は関数型インターフェースと呼ぶ
interface HelloWorld {
    public void hello();
}

public class RamudaPractice {
    public static void main(String[] args) {
        // メソッド内でクラスを定義
        class Inner implements HelloWorld {
            private String name; 
            Inner(String name) {
                this.name = name;
            }
            public void hello() {
                System.out.println("HelloWorld. My name is " + name);
            }
            public void print() {
                System.out.println("Innerクラスのprintメソッド");
            }
        }
        // Inner inner = new Inner();
        greeting(new Inner("Yosuke"));
    }

    static void greeting(HelloWorld h) {
        h.hello();
        System.out.println("Nice to meet you");
    } 
}