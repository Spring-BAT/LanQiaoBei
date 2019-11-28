package XunHuanJie;

import java.util.Vector;
/**
 * @program:循环节长度
 * @description:两个整数做除法，有时会产生循环小数，其循环部分称为循环节
 * eg:11/13=6=>0.846153846153
 * @author :WMJ
 * @data:2019/11/23  19:30
 */
public class XHJ {
    public static void main(String[] args){
        System.out.println(f(11,13));
    }

    public static int f(int n , int m){
        n=n%m;
        Vector v = new Vector();
        for(;;){
        v.add(n);
        n*=10;
        n=n%m;
        if(n==0)
            return 0;
        if(v.indexOf(n)>=0)
            return v.size()-v.indexOf(n);
        }
    }
}
