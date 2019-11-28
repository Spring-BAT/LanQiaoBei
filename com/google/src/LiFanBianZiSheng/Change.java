package LiFanBianZiSheng;
import java.math.BigInteger;

/**
 * @program:立方变自身
 * @description:Test
 * eg 1^3=1
 * 8^3=512 5+1+2=8
 * 17^3=4913 4+9+1+3=17
 * @author :WMJ
 * @data:2019/11/
 */
public class Change {
    public static void main(String[] args){
        int count = 0;

        for(int i = 1; i <= 10000000; i++){
            int sum = 0;
            BigInteger b = new BigInteger(i + "");
            BigInteger t = b.pow(3);
            String[] str = t.toString().split("");
            /*split分裂字符串*/
            for(int j = 0; j < str.length; j++){
                sum += Integer.parseInt(str[j]);
                /*Integer.parseInt(String)的作用是将String字符类型数据转换为Integer整形数据                             */

            }
            if(sum == i){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("__"+count+"__");
    }
}
