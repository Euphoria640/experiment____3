package work_1;

public class TestPerson {
    public static void main(String[] args) {

        //创建一个Person类的对象
        Person p=new Person();
        //给对象p设置年龄,名字,性别
        p.setAge(20);
        p.setName("Tom");
        p.setSex("man");
        //获取并输出对象p的名字,年龄,性别
        System.out.println("使用get获取属性输出:");
        System.out.println("name:" + p.getName());
        System.out.println("age:" + p.getAge());
        System.out.println("sex:" + p.getSex());
        //使用toString方法返回对象中的基本信息并输出
        System.out.println("使用toString输出:");
        System.out.println(p.toString());
    }
}
