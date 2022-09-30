package work_4;

public class Person {
    private String name;//名字
    private String sex;//性别
    private int age;//年龄
    private int id; //身份证号
    private static int count=0;
    public Person(){
        id=++count;
    }
    //构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        id=++count;
    }
//    构造方法
    public Person(String name,  int age,String sex) {
        this(name,age);
        this.sex = sex;
    }

    //重写toString
    @Override
    public String toString() {
        return "name: "+name+" age:"+age+" sex:"+sex+" id:"+id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
