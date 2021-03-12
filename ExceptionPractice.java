public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            String c = a + b;
            System.out.println("処理の成功");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("例外をキャッチしました");
        }
        System.out.println("プログラムを終了");
    }
}
