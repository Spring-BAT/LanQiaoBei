package Fibonacci;
import java.util.Scanner;
public class FibShulie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1, result = 1, n = scanner.nextInt(); /*获取用户输入*/
        for(int i = 1; i <= n-2; i++){
            /*此判断相当于n>2时执行代码块*/
            result = (a+b)%10007;
            /*求出每个数取余的结果*/
            a = b;/*变化相应的数值*/
            b = result;
        }
        System.out.println(result);
    }
}
