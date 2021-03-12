class DataSet {
	int[] data = new int[1000];
}

public class MemoryPractice {
    public static void main(String[] args) {
        // freeMemory():メモリ領域
        System.out.println(Runtime.getRuntime().freeMemory());
        DataSet[] data = new DataSet[10000];
        for (int i = 0; i < 10000; i++) {
            data[i] = new DataSet();
            // data[i]から参照できなくなり、ガーベッジコレクションにより回収される
            data[i] = null;
            if ((i + 1) % 100 == 0) {
                // 一定のオブジェクトを回収したら、メモリを解放
                System.out.println("秋メモリ" + Runtime.getRuntime().freeMemory());
            }
        }
    }
}