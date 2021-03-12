public class ExceptionPractice {
    public static void main(String[] args) {
        int array[] = new int[10]; 
        try { // 例外処理の開始
            array[99] = 11;
            System.out.println("処理の成功");
        } catch (Exception e) { // 例外時に通過
            //TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } finally { // 例外にかかわらず通過
            System.out.println("通過");
        }
        System.out.println("プログラムを終了");
    }
}
