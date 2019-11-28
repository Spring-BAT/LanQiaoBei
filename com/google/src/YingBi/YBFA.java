package YingBi;

/**
 * @program:硬币分配方案
 * @description:有50枚银币，可能包括四种类型：1元，5角，1角，5分。已知总价值为20元，求各种硬币的数量。
 * @author :WMJ
 * @data:2019/11/19  16:27
 */
public class YBFA {
    public static void main(String[] args) {
        int sum = 0;//分类方案次数
        for (int x = 0; x <= 50; x++) {
            for (int y = 0; y <= 50; y++) {
                for (int z = 0; z <= 50; z++) {
                    for (int k = 0; k <= 50; k++) {
                        if (x + y + z + k == 50 && x * 100 + y * 50 + z * 10 + k*5 == 2000) {
                            sum++;
                            System.out.println("" + x + "" + y + "" + z + "" + k);
                        }
                    }
                }
            }
        }
        System.out.println("总方案个数为:" + sum);
    }
}
