import java.io.*;

public class InputPractice {
	public static void main(String[] args) {
        // 入力を受け取る
        InputStreamReader in = new InputStreamReader(System.in);
        // 受け取った入力とプログラムの橋渡しをする
        BufferedReader reader = new BufferedReader(in);
        try {
            // 入力値から文字列データをString型で取得
            String string = reader.readLine();
            int val = Integer.parseInt(string);
            System.out.println("入力値は" + val);
            reader.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }

    static InputDouble() {

    }
}