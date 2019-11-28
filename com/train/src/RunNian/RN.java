package RunNian;
import java.util.Scanner;
/**
 * @program:闰年判断
 * @description:给定一个年份判断这一年是否为闰年
 * @author :WMJ
 * @data:2019/11/20  6:34am
 */
public class RN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        scanner.close();
        solution(y);
    }
    public static void solution(int year){
        if(year%400==0||(year%4==0)&&(year%100!=0)){
            System.out.println("这是闰年");
        }else{
            System.out.println("这不是闰年");
        }
    }
}
