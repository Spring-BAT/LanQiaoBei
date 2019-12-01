package XSGL;

public class Student {
    private String stdId;
    private String name;
    private String sex;
    private String age;
    private String place;
    public Student(){

    }

    public Student(String stdId, String name, String sex, String age, String place){
        super();
        this.stdId = stdId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.place = place;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
