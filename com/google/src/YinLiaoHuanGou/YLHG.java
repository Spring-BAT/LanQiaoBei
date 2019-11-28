package YinLiaoHuanGou;

import java.util.Scanner;
/**
 * @program:
 * @description:乐羊羊饮料厂正在举行一次促销优惠活动。乐羊羊C型饮料，凭三个瓶盖可以再换一瓶C型饮料，并且一直循环下去，但不许赊账。
 * @author :WMJ
 * @data:2019/11/23  18:44
 */
public class YLHG {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1){
            System.out.println(1);
        }else if(n==2){
            System.out.println(2);
        }else if(n==3){
            System.out.println(4);
        }else{
            int x=jisuan(n);
            System.out.println(n+x);
        }
    }

    public static int sum=0;
    public static  int jisuan(int n){
        if(n-3>=0){
            sum++;
            jisuan(n-2);
        }
        return sum;
    }
}
