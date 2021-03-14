import java.io.*;
import java.nio.file.FileSystem;

// import jdk.internal.jshell.tool.resources.version;

class MyExamPoints implements Serializable {
    int japanese;
    int math;
    int science;
    int social;
    int english;

    MyExamPoints(int japanese, int math, int science, int social, int english) {
        this.japanese = japanese;
        this.math = math;
        this.science = science;
        this.social = social;
        this.english = english;
    }
}

public class InputPractice {
	public static void main(String[] args) {
        // InputFile("/Users/ユーザ名/Desktop/test.txt");
        // ReadFile("/Users/fuji_yosu/Desktop/test.txt");
        // OutputObject();
        // InputObject();
        FileOperatioMethod1("/Users/fuji_yosu/Desktop/Output.txt");
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

    static void OutputObject() {
        MyExamPoints examPoints = new MyExamPoints(100,100,100,100,100);
        try {
            // デスクトップにOutput.serを書き込み
            FileOutputStream fs = new FileOutputStream("/Users/fuji_yosu/Desktop/Output.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            // 指定パスにオブジェクトを書き込み
            os.writeObject(examPoints);
            os.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    static void InputObject() {
        try {
            FileInputStream fs = new FileInputStream("/Users/fuji_yosu/Desktop/Output.ser");
            ObjectInputStream os = new ObjectInputStream(fs);
            // 指定パスを指定オブジェクトに変換して読み込み
            MyExamPoints examPoints = (MyExamPoints)os.readObject();
            // readObject()はObject型を返し、プロパティにアクセスできない
            // Object examPoints = os.readObject();
            os.close();
            System.out.println(examPoints.japanese);
            System.out.println(examPoints.math);
            System.out.println(examPoints.science);
            System.out.println(examPoints.social);
            System.out.println(examPoints.english);
		} catch(IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
    }

    static void FileOperatioMethod1(String filePath) {
        File file = new File(filePath);
        File fileForRename = new File("/Users/fuji_yosu/Desktop/Renamed.ser");
        if (file.exists() == false) {
            System.out.println(file + "がありません");
            return;
        }
        if (file.renameTo(fileForRename)) {
            System.out.println(file + "をリネーム");
        } else {
            System.out.println(file + "をリネームできませんでした");
        }
        // if (file.delete()) {
        //     System.out.println(file + "を削除しました");
        // } else {
        //     System.out.println(file + "を削除できませんでした");
        // }
    }
}