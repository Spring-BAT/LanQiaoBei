package ZiChuan;

import java.text.DecimalFormat;

/**
 * @program:01字串
 * @description:对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。
 * @author :WMJ
 * @data:2019/11/20  7:25am
 */
public class ZC {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("00000");
        for(int i =0; i < 32; i++){
            System.out.println(decimalFormat.format(Integer.parseInt(Integer.toBinaryString(i))));
        }
    }
}
