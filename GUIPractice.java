import javax.swing.JFrame;

public class GUIPractice {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // これがないと終了できない
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // サイズ指定
		frame.setSize(500, 200);
        // フレームを表示
		frame.setVisible(true);
    }
}
