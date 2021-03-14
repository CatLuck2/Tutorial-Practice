import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GUIPractice {
    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // // これがないと終了できない
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // // サイズ指定
		// frame.setSize(500, 200);
        // // フレームを表示
		// frame.setVisible(true);

        createJFrame();

        // new GUIPractice();
    }

    // GUIPractice() {
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     getContentPane().add(JButton("fewfew"));
    //     setSize(200, 300);
    //     setVisible(true);
    // }

    static void createJFrame() {
        // Frameの定義
        class MyFrame extends JFrame {
            // Frameのコンストラクタ
            MyFrame() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // ボタンを配置
                // 画面の構造：フレーム > コンテナ > コンポーネント
                // getContentPane()：コンテナを取得
                getContentPane().add(BorderLayout.CENTER, new JButton("CENTER"));
                getContentPane().add(BorderLayout.SOUTH, new JButton("SOUTH"));
                getContentPane().add(BorderLayout.WEST, new JButton("WEST"));
                getContentPane().add(BorderLayout.EAST, new JButton("EAST"));
                getContentPane().add(BorderLayout.NORTH, new JButton("NORTH"));
                setSize(200, 300);
                setVisible(true);
            }
        }
        // 画面の構築
        new MyFrame();
    }
}
