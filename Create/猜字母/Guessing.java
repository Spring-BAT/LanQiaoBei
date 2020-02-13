package 猜字母;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args){
        int count = 0;
        int score = 500;
        Scanner scan = new Scanner(System.in);
        int[] result = new int[2];
        char[] chs = generate();
        char[] input = new char[5];
        System.out.println(chs);
        while(true){
            String str = scan.next().toUpperCase();
            if(str.equals("EXIT")){
                System.out.println("欢迎下次再来");
                break;
            }
            input = str.toCharArray();
            result = Check(chs,input);
            if(result[0]==chs.length){
                System.out.println("恭喜你答对了");
                break;
            }
            else
                System.out.println("猜对了"+result[1]+"个字母"+"猜对了"+result[0]+"个位置");
        }
    }

    public static char[] generate() {
        char[] chs = new char[5];
        boolean[] flag = new boolean[26];
        int x = 0;
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i=0;i<chs.length;i++){
            do{
                x=(int)Math.random()*26;
            }while(flag[x]);
            chs[i]=letters[x];
            flag[x]=true;
        }
        return chs;
    }
    
    public static int[] Check(char chs[],char input[]){
        int[] result = new int[2];
        for(int i=0;i<chs.length;i++){
            for(int j=0;j<input.length;j++){
                if(chs[i]==input[j]){
                    result[1]++;
                    if(i==j)
                        result[0]++;
                    break;
                }
            }
        }
        return result;
    }
}
