package work_2;

public class TestLeapYear {
    public static void main(String[] args) {
        LeapYear p=new LeapYear();//创建对象
        int[] arr=new int[]{2021,2018,2020,2026,2028};//使用数组储存年份
        for(int a:arr) {        //for循环遍历数组
            if (p.isLeapYear(a)) {
                System.out.println(a + "是闰年");
            } else {
                System.out.println(a + "不是闰年");
            }
        }
    }
}
