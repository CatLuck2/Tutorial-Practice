// メソッドが1つの時は関数型インターフェースと呼ぶ
interface HelloWorld {
    public void hello();
}

interface Calculate {
    public double getTaxPrice(double price);
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
        // greeting(new HelloWorld() {
        //     // メソッドの処理も定義できる
        //     public void hello() {
        //         System.out.println("HelloWorld");
        //     }
        // });

        // ラムダ式
        // メソッド内の処理を渡す
        // 関数型インターフェースではメソッドが1つなので、問題ない
        // greetingByRambda( () -> {System.out.println("HelloWorld");} );
        calculateTaxPrice( (double price) -> {return price * 1.1;});
    }

    static void greeting(HelloWorld h) {
        // 匿名クラス側でhello()の処理は実装されている
        h.hello();
        System.out.println("Nice to meet you");
    } 

    static void greetingByRambda(HelloWorld h) {
        h.hello();
        System.out.println("Nice to meet you");
    }

    static void calculateTaxPrice(Calculate c) {
        System.out.println(c.getTaxPrice(30.0));
    }
}