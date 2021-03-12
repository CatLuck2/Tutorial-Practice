// Runnableでサブクラスにせず、スレッドを定義できる
class MyThread extends Thread { 
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

class MyThread2 extends Thread {
    public boolean isRun = true;
    public void run() {
        while(isRun) {
            System.out.print("*");
        }
        System.out.print("処理は終了");
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(thread1); // Runnableクラスを引数にする
        // thread2.start(); // Threadクラスのrun()を呼び出す

        // ThreadMethod1();
        // ThreadMethod2();
        ThreadMethod3();
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

    static void ThreadMethod2() {
        MyThread t = new MyThread();
        t.start();

        try {
            t.join(); // スレッドの処理が完了するまで、次の処理を待つ
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 20; i++) {
			System.out.println("ThreadMethod2 (" + i + ")");
		}
    }

    static void ThreadMethod3() {
        MyThread2 t = new MyThread2();
        t.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t.isRun = false; // 好きなタイミングでスレッドを中断
    }
}