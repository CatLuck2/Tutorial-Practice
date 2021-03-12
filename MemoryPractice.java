class DataSet {
	// int[] data = new int[1000];
}

public class MemoryPractice {
    public static void main(String[] args) {
        // freeMemory():メモリ領域
        System.out.println(Runtime.getRuntime().freeMemory());
        DataSet[] data = new DataSet[10000];
        for (int i = 0; i < 10000; i++) {
            data[i] = new DataSet();
            if ((i + 1) % 100 == 0) {
                System.out.println(Runtime.getRuntime().freeMemory());
            }
        }
    }
}