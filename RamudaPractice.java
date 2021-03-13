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
        // 内部クラス
        // greeting(new Inner());
        // 匿名クラス(クラスとインスタンスの両方を実装)
        // インターフェースを継承したクラスの定義が不要
        greeting(new HelloWorld() {
            // メソッドの処理も定義できる
            public void hello() {
                System.out.println("HelloWorld");
            }
        });
    }

    static void greeting(HelloWorld h) {
        // 匿名クラス側でhello()の処理は実装されている
        h.hello();
        // System.out.println("Nice to meet you");
    } 
}