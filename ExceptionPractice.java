/*
複数の例外パターンをcatchで記述できる
*/

class MyOriginalException extends Exception {
    MyOriginalException(String message) {
        super(message);
    }
}

public class ExceptionPractice {
    public static void main(String[] args) {
        int array[] = new int[10]; 
        int a = 10;
        int b = -11;
        try { // 例外処理の開始
            checkValue(b);
            if (a > 5) {
                throw new MyOriginalException("aは5より大きい");
            }
            array[99] = 11;
        } catch (MyOriginalException e) {
            System.out.println(e); // 〇〇Exception: throwで記述したエラー分
        } catch (ArithmeticException e) { // 例外時に通過
            //TODO: handle exception
            System.out.println("ArithmeticException");
            e.printStackTrace(); // エラー文
            System.out.println(e.getMessage()); // エラーの原因
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally { // 例外にかかわらず通過
            System.out.println("通過");
        }
        System.out.println("プログラムを終了");
    }

    // メソッドで例外処理
    static void checkValue(int value) throws MyOriginalException {
        if (value < 0) {
            throw new MyOriginalException("引数はマイナスです");
        }        
    } 
}
