public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try { // 例外処理の開始
            int c = a / b;
            System.out.println("処理の成功");
        } catch (Exception e) { // 例外時に通過
            //TODO: handle exception
            System.out.println("例外をキャッチしました" + e);
        } finally { // 例外にかかわらず通過
            System.out.println("通過");
        }
        System.out.println("プログラムを終了");
    }
}
