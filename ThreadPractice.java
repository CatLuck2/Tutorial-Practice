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

class MyThread3 extends Thread {
    static int money = 0;
    public void run() {
        plus();
    }
    public synchronized void plus() { // スレッドでの処理が完了するまで、他スレッドからのアクセスを禁止
        for (int i = 0; i < 1000; i++) {
            MyThread3.money++;
        }
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(thread1); // Runnableクラスを引数にする
        // thread2.start(); // Threadクラスのrun()を呼び出す

        // ThreadMethod1();
        // ThreadMethod2();
        // ThreadMethod3();
        ThreadMethod4();
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

    static void ThreadMethod4() {
        MyThread3[] threads = new MyThread3[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread3();
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        // 各スレッドが他のスレッドに割り込んでしまい、処理の順番が狂う
        // 参照->実行　ではなく　参照→別スレッドの処理→処理
        System.out.println(MyThread3.money);
    }
}