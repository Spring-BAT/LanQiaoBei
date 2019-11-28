package JiaFaBianChenFa;
/**
 * @program:加法变乘法
 * @description:我们知道:1+2+3+.....+49=1225,现在要求把其中不相邻的加号变成号，使得结果为2015
 * 比如：1+2+3+....+10*11+12+....+27*28+29.....+49=2015就是符合要求，请你寻找另一种可能结果为2015，输出位置靠前的乘号左边的数字
 * @author :WMJ
 * @data:2019/11/19  16:27
 */
/*public class JFBCF {
    public static void main(String[] args){
        for(int i = 1; i < 49; i++){
            for(int j = i; j < 49; j++){
                if((1225-i*2-j*2-2+j*(j+1)+i*(i+1)==2015))
                    System.out.println(i);
            }
        }
    }
}*/
public class JFBCF {
    public static void main(String[] args){
        int temp,res;
        for(int i = 1; i < 47; i++){
            temp=1225-i*2-1+i*(i+1);
            for(int j = i+2; j < 49; j++){
                res=temp-j*2-1+j*(j+1);
                if(res==2015)
                    System.out.println(i);
            }
        }
    }
}
