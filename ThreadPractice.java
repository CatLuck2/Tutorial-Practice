class MyThread extends Thread {
    // public void donald() {
    //     for (int i = 0; i < 20; i++) {
    //         System.out.println("MyThreadのrunメソッド(" + i + ")");
    //     }
    // }
    public void run() {
        System.out.println("kernel sanders");
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Threadクラスのrun()を呼び出す?
    }
}