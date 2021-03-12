public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("処理の成功");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("例外をキャッチしました" + e);
        } finally {
            System.out.println("通過");
        }
        System.out.println("プログラムを終了");
    }
}
