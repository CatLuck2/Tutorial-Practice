// packageをインポート
// 1:階層下のクラスを指定
// 2:階層下を指定
// imoprt java.awg.*;
import javadirectory.packages.TestPackage;
import javadirectory.packages.*;
// static修飾子を付与すれば、クラス名抜きでプロパティを記述できる
import static java.lang.Math.PI;

// Javaはファイル度に,
// java.lang, 現在のファイルのパッケージ、をインポートしている

public class PackagePractice {
    public static void main(String[] args) {
        javadirectory.packages.TestPackage testPackage1 = new javadirectory.packages.TestPackage();
        TestPackage testPackage2 = new TestPackage();
        double ensyuritu = PI;
    }
}