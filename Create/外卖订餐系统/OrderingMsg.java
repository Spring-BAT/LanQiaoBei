package 外卖订餐系统;

import java.util.Scanner;

public class OrderingMsg {
    public static void main(String[] args){
        String[] names = new String[4];
        String[] dishMegs = new String[4];
        int[] times = new int[4];
        String[] addresses = new String[4];
        int[] states = new int[4];
        double[] sumPrices = new double[4];
        String[] dishNames = {"红烧茄子","红烧排骨","鱼香肉丝"};
        double[] prices = new double[] {24.0,36.0,32.0};
        int[] praiseNums = new int[3];
        Scanner input = new Scanner(System.in);
        int num = -1;
        boolean isExit = false;
        System.out.println("\n欢迎使用“外卖订餐系统”");
        do{
            System.out.println("*****8*****8*****8*****8*****");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("*****8*****8*****8*****8*****");
            System.out.println("请选择:");
            int choose = input.nextInt();
            boolean isAdd = false;
            boolean isSignFind = false;
            boolean isDelFind = false;
            switch (choose){
                case 1:
                    //我要订餐
                    System.out.println("++++++我要订餐++++++");
                    for(int j = 0; j<names.length; j++){
                        if(names[j]==null){
                            isAdd = true;
                            System.out.println("请输入订餐人姓名：");
                            String name = input.next();
                            //显示供选择的菜品信息
                            System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
                            for(int i = 0; i < dishNames.length; i++){
                                String price = prices[i] + "元";
                                String praiseNum = (praiseNums[i])>0?praiseNums[i] + "赞" :"";
                                System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
                            }
                            //用户点菜
                            System.out.println("请您选择要点的菜品编号:");
                            int chooseDish = input.nextInt();
                            System.out.println("请选择您需要的份数:");
                            int number = input.nextInt();
                            String dishMeg = dishNames[chooseDish-1] + "" +number + "份";
                            double sumPrice = prices[chooseDish-1]*number;
                            //餐费满50元，免送餐费10元
                            double deliCharge = (sumPrice>=50)?0:6;
                            System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）:");
                            int time = input.nextInt();
                            while(time < 10 || time > 20){
                                System.out.println("您的输入有误，请输入10-20间的整数！");
                                time = input.nextInt();
                            }
                            System.out.println("请输入送餐地址:");
                            String address = input.next();
                            System.out.println("订餐成功!");
                            System.out.println("您订的是:"+dishMeg);
                            System.out.println("送餐时间:"+time+"点");
                            System.out.println("餐费"+sumPrice+"元，送餐费"+deliCharge+"元，总计:"+(sumPrice+deliCharge)+"元。");

                            //添加数据
                            names[j] = name;
                            dishMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = sumPrice+deliCharge;
                            break;
                        }
                    }
                case 2:
                    //查看餐袋
                    System.out.println("++++++查看餐袋++++++");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
                    for(int i = 0;i < names.length; i++){
                        if(names[i]!=null){
                            String state = (states[i]==0)?"已预定":"已完成";
                            String date = times[i]+"日";
                            String sumPrice = sumPrices[i]+"元";
                            System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+sumPrice+"\t"+state);

                        }
                    }
                case 3:
                    //签收订单
                    System.out.println("++++++签收订单++++++");
                    System.out.println("请选择要签收的订单序号：");
                    int signOrderId = input.nextInt();
                    for(int i=0;i<names.length;i++){
                        if(names[i]!=null && states[i]==0 && signOrderId==i+1){
                            states[i]=1; //将状态值置为已完成
                            System.out.println("订单签收成功！");
                            isSignFind = true;
                        }else if(names[i]!=null && states[i]==1 && signOrderId==i+1){
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                            isSignFind = true;
                        }
                    }
                    //未找到的订单序号:不可签收
                    if(!isSignFind){
                        System.out.println("您选择的订单不存在!");
                    }
                    break;
                case 4:
                    //删除订单
                    System.out.println("++++++删除订单++++++");
                    System.out.println("请输入要删除的订单序号:");
                    int delId = input.nextInt();
                    for(int i=0;i<names.length;i++){
                        if(names[i]!=null && states[i]==1 && delId==i+1){
                            isDelFind = true;
                            //执行删除后的操作:删除后位置依次往前移
                            for(int j=delId-1;j<names.length-1;j++){
                                names[j]=names[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                states[j]=states[j+1];
                            }
                            //最后一位清空
                            names[names.length-1] = null;
                            dishMegs[names.length-1] = null;

                        }else if(names[i]!=null && states[i]==0 && delId==i+1){
                            System.out.println("您选择的订单未完成签收，不能删除！");
                            isDelFind  = true;
                        }
                    }
                    //未找到的订单序号:不能删除
                    if(!isDelFind){
                        System.out.println("您要删除的订单不存在!");
                    }
                    break;
                case 5:
                    //我要点赞
                    System.out.println("++++++我要点赞++++++");
                    //显示菜品信息
                    System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
                    for(int i = 0; i<dishNames.length;i++){
                        String price = prices[i]+"元";
                        String praiseNum =(praiseNums[i]>0?praiseNums[i]+"赞":"0赞");
                        System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
                    }
                    System.out.println("请选择您要点赞的菜品序号：");
                    int praiseNum = input.nextInt();
                    praiseNums[praiseNum-1]++;
                    System.out.println("点赞成功！");
                    break;
                case 6:
                    //退出系统
                    isExit = true;
                    break;
                default:
                    //退出系统
                    isExit = true;
                    break;
            }
            if(!isExit){
                System.out.println("输入0返回:");
                num = input.nextInt();
            }else{
                break;
            }
        }while(num==0);
        System.out.println("谢谢使用，欢迎下次光临!");

    }
}
