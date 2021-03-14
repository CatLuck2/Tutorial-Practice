import javax.swing.JFrame;

public class GUIPractice {
    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // // これがないと終了できない
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // // サイズ指定
		// frame.setSize(500, 200);
        // // フレームを表示
		// frame.setVisible(true);

        JFremeMethod1();
    }

    static void JFremeMethod1() {
        // Frameの定義
        class MyFrame extends JFrame {
            // Frameのコンストラクタ
            MyFrame() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(200, 300);
                setVisible(true);
            }
        }
        // 画面の構築
        new MyFrame();
    }
}
