package com.Leetcode;

/*2015
1、28
 */




/*
2、立方变自身
public class Text {
    public static void main(String[] args){
        int c=0,sum=0,a,n=0;
        for(int i=1;i<=10000;i++){
            c = i*i*i;
            while(c!=0) {
                a = c % 10;
                sum+=a;
                c/=10;
            }
            if(sum==i){
                n++;
                System.out.println(i);
            }else{
                sum=0;
            }

        }
        System.out.println(n);
    }
}
*/
/*
3、三羊献瑞
//a 祥 b 瑞 c 生 d 辉 f 献 g 羊  h气
public class Text {
    public static void main(String[] args)
    {
        int num1, num2, sum;
        for (int a = 2; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        for (int f = 0; f <= 9; f++) {
                            for (int g = 0; g <= 9; g++) {
                                for (int h = 0; h <= 9; h++) {
                                    if (a != b && a != c && a != d && a != f && a != g && a != h && a != 1 &&
                                            b != c && b != d && b != f && b != g && b != h && b != 1 &&
                                            c != d && c != f && c != g && c != h && c != 1 &&
                                            d != f && d != g && d != h && d != 1 &&
                                            f != g && f != h && f != 1 &&
                                            g != h && g != 1 &&
                                            h != 1) {
                                        num1 = a * 1000 + b * 100 + c * 10 + d;
                                        num2 = 1000 + f * 100 + g * 10 + b;
                                        sum =10000 + f * 1000 + c * 100 + b * 10 + h;
                                        if (num1 + num2 == sum) {
                                            System.out.println(num2);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }

    }
}

 */
/*
4、加法变乘法
public class Text{
    public static void main(String[] args){
        int temp,res;
        for(int i=1;i<47;i++){
            temp=1225-i*2-1+i*(i+1);
            for(int j=i+2;j<49;j++){
                res=temp-2*j-1+j*(j+1);
                if(res==2015){
                    System.out.println(i);
                }
            }

        }


    }
}
 */
/*
public class Text{
    public static void main(String[] args){
      int c=0;
       c=dfs(13,0);
       System.out.println(c);
        

    }

   public static int dfs(int x, int num) {

            int sum=0;
            if(num>13) return 0;
            if(x==0)
            {
                if(num==13)
                    sum++;
            }
            for(int i=0; i<5; i++)
            {
                dfs(x-1,num+i);
            }
           return sum;
        }

    }
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/*
7、牌型种类
public class Text{
    public static void main(String[] args){
        int ans=0;
        for(int a=0;a<=4;a++){
            for(int b=0;b<=4;b++){
                for(int c=0;c<=4;c++){
                    for(int d=0;d<=4;d++){
                        for(int e=0;e<=4;e++){
                            for(int f=0;f<=4;f++){
                                for(int m=0;m<=4;m++){
                                    for(int n=0;n<=4;n++){
                                        for(int l=0;l<=4;l++){
                                            for(int k=0;k<=4;k++){
                                                for(int o=0;o<=4;o++){
                                                    for(int p=0;p<=4;p++){
                                                        for(int j=0;j<=4;j++){
                                                            if(a+b+c+d+e+f+m+n+l+k+o+p+j==13){
                                                                ans++;
                                                            }
                                                        }


                                                    }


                                                }


                                            }

                                        }


                                    }


                                }


                            }


                        }


                    }


                }


            }

        }


        System.out.println(ans);
    }
}
*/
/*
8、星系炸弹
2017-08-05
 */

//2013
/*世纪末的星期
public class Text{
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();//使用默认时区和区域设置获取日历。通过该方法生成Calendar的对象
        for(int year=1999; year<10000;year+=100){
            calendar.set(year,11,31);//注意0代表1月份，12月份应为11
            if(calendar.get(Calendar.DAY_OF_WEEK)==1){//星期一为2，星期天为1
                System.out.println(year);
                break;
            }
        }

    }
}
*/
//
//2、马虎的算式a b c d e  ab*cde=adb*ce   if((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e))
/*
public class Text{

    public static void main(String[] args){
        int ans=0;
        for(int a=1;a<=9;a++){
            for(int b=1;b<=9;b++){
                for(int c=1;c<=9;c++){
                    for(int d=1;d<=9;d++){
                        for(int e=1;e<=9;e++){
                            if(a!=b&&a!=c&&a!=d&&a!=e&&
                                    b!=c&&b!=d&&b!=e&&
                                    c!=d&&c!=e&&d!=e ){
                                if((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e)){
                                   ans++;
                                }
                            }

                        }

                    }

                }
            }
        }
        System.out.println(ans);
    }
}
*/

/*public class Text {

    public static void main(String[] args) {
        int ans = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a != b)
                    for (int c = 1; c <= 9; c++) {
                        if (c != a && c != b)
                            for (int d = 1; d <= 9; d++) {
                                if (d != a && d != b && d != c)
                                    for (int e = 1; e <= 9; e++) {
                                        if (e != a && e != b && e != c && e != d) {
                                            if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b)
                                                    * (c * 10 + e)) {
                                                ans++;
                                            }
                                        }
                                    }
                            }
                    }
            }
        }
        System.out.println(ans);
    }

}
*/
/*3、振兴中华
public class Text {
    public static void main(String[] args) {
        int ans = 0;
        ans = dfs(0,0);
        System.out.println(ans);
    }

    public static int dfs(int i, int j) {
        if(i==3||j==4){
            return 1;
        }
        return dfs(i+1,j)+dfs(i,j+1);
    }

}


/*7、错误票据*/
/*
public class Text {
    public static void main(String[] args) {
        int n=0, m=0;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[100001];
        while(sc.hasNextInt()){
            a[m]=sc.nextInt();
            m++;
        }
        Arrays.sort(a,0,m);
        for(int i=0;i<m-1;i++){
            if(a[i]!=a[i+1]-1){
                System.out.println(a[i]+1+"");
            }
        }
        for(int i=0;i<m;i++){
            if(a[i+1]==a[i]){
                System.out.println(i);
            }
        }

    }
}
*/
public class Text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int error = 0;
        int repeat = 0;
        in.nextLine();
        int[] harsh = new int[10001];

        int max = Integer.MIN_VALUE; //-2147483648
        int min = Integer.MAX_VALUE; //2147483637
        for(int i=0; i<N;i++){
            String s = in.nextLine();
            Scanner scanner = new Scanner(s);
            while(scanner.hasNextInt()){
                int tmp = scanner.nextInt();
                harsh[tmp]++;
                max = Math.max(max,tmp);
                min = Math.min(min,tmp);
            }
            scanner.close();
        }
        in.close();
        for(int i=min;i<=max;i++){
            if(harsh[i] == 2)
                repeat = i;
            if(harsh[i]==0)
                error = i;
        }
        System.out.println(error+" "+repeat);
    }
    }

/*2014
1、武功秘籍
7
2、切面条
1025
3、猜字母

public class Text {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abcdefghijklmnopqrs");
        StringBuffer str1 = new StringBuffer("");
        for(int i=0;i<106;i++){
            str1 = str.append(str);
        }
        while(str1.length()!=1){
            for(int i=0;i<str1.length();i+=2){
                str1.setCharAt(i,'\0');
            }
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)=='\0'){
                    str1.deleteCharAt(i);
                }
            }

        }
        System.out.println("剩余字符串长度:"+str1.length());
        System.out.println(str1);

    }
    }
*/















































