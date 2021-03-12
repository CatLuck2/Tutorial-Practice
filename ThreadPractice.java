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
        // thread2.start(); // Threadクラスのrun()を呼び出す

        ThreadMethod1();
    }
    
    static void ThreadMethod1() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(5000); // 5000ミリ秒（5秒）停止
            } catch (InterruptedException e) { // スレッドで割り込みが発生した時
                System.out.println(e);
            }
            System.out.println("end");
        }
    }
}