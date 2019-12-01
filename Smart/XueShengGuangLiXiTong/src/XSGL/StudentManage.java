package XSGL;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManage {
    public static void main(String args[]){
        ArrayList<Student> array = new ArrayList<>();
        while(true){
            System.out.println("------学生管理系统------");
            System.out.println(" 1.查看所有学生");
            System.out.println(" 2.增加学生");
            System.out.println(" 3.删除学生");
            System.out.println(" 4.修改学生");
            System.out.println(" 5.退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入序号，选择相应的功能：");
            String stufunction = sc.nextLine();
            switch(stufunction){
                case "1":
                    findstudent(array);
                    break;
                case "2":
                    addstudent(array);
                    break;
                case "3":
                    deletestudent(array);
                    break;
                case "4":
                    changestudent(array);
                    break;

                case "5":

                default:
                    System.out.println("谢谢你使用！");
                    System.exit(0);
                    break;
            }

        }
    }
    public static void findstudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("不好意思，目前没有学生信息可供查询，请返回重新操作！");
            return;
        }
        System.out.println("学号\t姓名\t性别\t年龄\t居住地");
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getStdId()+"\t"+s.getName()+"\t"+s.getSex()+"\t"+s.getAge()+"\t"+s.getPlace());
        }
    }

    public static void addstudent(ArrayList<Student> array){
        Scanner scanner = new Scanner(System.in);
        String stuId;
        while(true){
            System.out.println("请输入学号：");
            stuId = scanner.nextLine();
            boolean flag = false;
            for(int i = 0 ; i < array.size(); i++ ){
                Student s = array.get(i);
                if(s.getStdId().equals(stuId)){
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("您输的学号已存在！");
            } else{
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入性别:");
        String sex = scanner.nextLine();
        System.out.println("请输入年龄:");
        String age = scanner.nextLine();
        System.out.println("请输入居住地:");
        String place = scanner.nextLine();
        Student s = new Student();
        s.setStdId(stuId);
        s.setName(name);
        s.setSex(sex);
        s.setAge(age);
        s.setPlace(place);
        array.add(s);
        System.out.println("添加学生成功！");

    }
    public static void deletestudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号");
        String deleId = sc.nextLine();
        int index = -1;
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            if(s.getStdId().equals(deleId)){
                index = i;
            }
            if(index == -1){
                System.out.println("你要删除的学生不存在，请重新输入！");
            }else{
                array.remove(index);
                System.out.println("删除学生成功！");
            }
        }
    }
    public static void changestudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要改变的学号：");
        String changeId = sc.nextLine();
        int index = -1;
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            if(s.getStdId().equals(changeId)){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("你想要改变的学号不存在，请重新操作！");
        }else{
            System.out.println("请输入新姓名:");
            String name = sc.nextLine();
            System.out.println("请输入新性别：");
            String sex = sc.nextLine();
            System.out.println("请输入新年龄：");
            String age = sc.nextLine();
            System.out.println("请输入新居住地：");
            String place = sc.nextLine();
            Student s = new Student();
            s.setStdId(changeId);
            s.setName(name);
            s.setSex(sex);
            s.setAge(age);
            s.setPlace(place);

            array.set(index,s);
            System.out.println("修改学生成功！！！");
        }
    }
}