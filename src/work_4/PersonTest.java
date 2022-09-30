package work_4;

import work_1.Person;

public class PersonTest {
    public static void main(String[] args) {
        //使用空参构造器
        work_4.Person p1=new work_4.Person();
        p1.setName("tom");
        p1.setAge(19);
        p1.setSex("man");

        //使用了含有名字和年龄的构造方法
        work_4.Person p2=new work_4.Person("ning",20);
        p2.setSex("man");

        //使用了含有名字,年龄,性别的构造方法
        work_4.Person p3=new work_4.Person("han",19,"man");

        //调用toString并输出基本信息
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
