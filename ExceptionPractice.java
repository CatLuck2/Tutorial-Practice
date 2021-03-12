/*
複数の例外パターンをcatchで記述できる
*/

public class ExceptionPractice {
    public static void main(String[] args) {
        int array[] = new int[10]; 
        try { // 例外処理の開始
            array[99] = 11;
            System.out.println("処理の成功");
        } catch (ArithmeticException e) { // 例外時に通過
            //TODO: handle exception
            System.out.println("AccessException");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally { // 例外にかかわらず通過
            System.out.println("通過");
        }
        System.out.println("プログラムを終了");
    }
}
