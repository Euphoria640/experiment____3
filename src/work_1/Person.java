package work_1;

public class Person {
    private String name;            //名字
    private String sex;             //性别
    private int age;                //年龄

    //空参构造器
    public Person() {
        this.age=0;
        this.sex="";
        this.name="";
    }


    //get和set方法

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

    //重写toString方法
    @Override
    public String toString() {
        return "name="+name+" age:"+age+" sex:"+sex;
    }
}
