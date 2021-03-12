// Runnableでサブクラスにせず、スレッドを定義できる
class MyThread implements Runnable { 
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(thread1); // Runnableクラスを引数にする
        thread2.start(); // Threadクラスのrun()を呼び出す?
    }
}