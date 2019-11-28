package ZiMuTuXing;
import java.util.Scanner;
/**
 * @program:字母图形
 * @description:利用字母组成一些美丽的图形 n>=1,m<=26
 * @author :WMJ
 * @data:2019/11/20  8:25am
 */
public class ZMTX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                char c = (char)(Math.abs(i-j)+'A');
                System.out.println(c);
            }
            System.out.println();
        }
    }


}
