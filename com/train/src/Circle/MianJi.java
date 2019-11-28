package Circle;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @program:求圆的面积
 * @description:输出格式保留小数点后7位，运用内置函数。格式化数字可以用DecimalFormat中的format()函数
 * @author :WMJ
 * @data:2019/11/19  8:34am
 */
public class MianJi {
    public static void main(String[] args){
        int r = new Scanner(System.in).nextInt();
        /*获取用户输入方法*/
        String result = new DecimalFormat("#.0000000").format(Math.PI*r*r);
        System.out.println(result);
    }
}
