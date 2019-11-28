package FuShuMi;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
/**
 * @program:复数幂
 * @description:求（2+3i）^123456等于多少
 * @author :WMJ
 * @data:2019/11/18  23:34pm
 */
public class FS {
    public static void main(String[] args) throws IOException{
        BigInteger a = new BigInteger("2"),b = new BigInteger("3"),c = new BigInteger("1"),d = new BigInteger("0"),t;

        FileWriter file = new FileWriter("ans.txt");
        for(int i =0;i < 123456; i++){
            t = c;
            c = a.multiply(c).add(b.multiply(d));
            d = a.multiply(d).add(b.multiply(t));
        }
        file.write(c+"+"+d+"i");
        file.close();
    }
}
