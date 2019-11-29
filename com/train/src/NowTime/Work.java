package NowTime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program:java Date获取 年月日时分秒
 * @description:
 * @author :WMJ
 * @data:2019/11/29  23:50
 */
public class Work {
    public void getTimeByDate(){
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();//日期格式，精确到日
        System.out.println(df1.format(date));
        DateFormat df2 = DateFormat.getDateTimeInstance();//可以精确到时分秒
        System.out.println(df2.format(date));
        DateFormat df3 = DateFormat.getTimeInstance();//只显示出时分秒
        System.out.println(df3.format(date));
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);//显示日期，周，上下午，时间（精确到秒）
        System.out.println(df4.format(date));
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG);//显示日期,上下午，时间（精确到秒）
        System.out.println(df5.format(date));
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT); //显示日期，上下午,时间（精确到分）
        System.out.println(df6.format(date));
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.MEDIUM);//显示日期，时间（精确到分）
        System.out.println(df7.format(date));
    }
    public void getTimeByCalendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("现在的时间是：公元"+year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒"+WeekOfYear+"星期");
    }
    public static void main(String[] args){
        Work t = new Work();
        t.getTimeByDate();
        System.out.println("***********************");
        t.getTimeByCalendar();
    }
    }

