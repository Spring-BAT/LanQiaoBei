package FanMaiZi;
import java.math.BigInteger;


/**
 * @program:放麦子
 * @description:关于2的多少次幂累加，类似于等比数列求和
 * @author :WMJ
 * @data:2019/11/19  8:34am
 */
public class Mi {
    public static void main(String[] args){
        BigInteger total = new BigInteger("0");
        BigInteger base = new BigInteger("2");
        for(int i = 0; i < 64; i++){
            total = total.add(base.pow(i));
            /*System.out.println(total);*/
        }
        System.out.println(total);
       /* System.out.println(base.pow(64).add(new BigInteger("-1")));*/
    }
    }


