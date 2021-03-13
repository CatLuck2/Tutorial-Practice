import java.io.*;

public class InputPractice {
	public static void main(String[] args) {
        // InputFile("/Users/ユーザ名/Desktop/test.txt");
        ReadFile("/Users/fuji_yosu/Desktop/test.txt");
    }

    static void InputMethod() {
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

    static void InputFile(String filePath) {
        try {
            // filePath:保存先のパス
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < 5; i++) {
                // 指定パスに文字列を出力
				bw.write("[" + i + "]");
			}
            bw.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    static void ReadFile(String filePath) {
        try {
            // 読み込み先のパス
            File file = new File(filePath);
            // 指定先を読み込み
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            // 1行目を読み込む
            // s = br.readLine();
            // System.out.println(s);

            // 文字（スペースも含む）のある行を読み込む
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}