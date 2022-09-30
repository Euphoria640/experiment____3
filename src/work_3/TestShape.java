package work_3;

import java.text.DecimalFormat;

public class TestShape {

    public static void main(String[] args) {

        // 长方形测试类
        Rectangle p1 = new Rectangle(3.5, 6.4);
        Rectangle p2 = new Rectangle(4.8, 7.9);
        //三角形测试
        Triangle p3 = new Triangle(5.3, 6.1, 2.7);
        Triangle p4 = new Triangle(4.6, 3.8, 6.7);
        //圆测试
        Circle p5 = new Circle(3.6);
        Circle p6 = new Circle(5.3);
        double sum1;       //统计所有的面积
        double sum2;       //统计所有的周长
        DecimalFormat d=new DecimalFormat("#.00");          //控制保留几位小数
        sum1=p1.getArea()+p2.getArea()+p3.getArea()+p4.getArea()+p5.getArea()+p6.getArea();
        sum2=p1.getPerimeter()+p2.getPerimeter()+p3.getPerimeter()+p4.getPerimeter()+p5.getPerimeter()+p6.getPerimeter();
        System.out.println("周长和为:"+d.format(sum2));
        System.out.println("面积和为:" + d.format(sum1));
        System.out.println("面积和周长的总和:"+d.format(sum1+sum2));
        System.out.println("面积和周长的总和:"+d.format(Rectangle.sum+Circle.sum+Triangle.sum));

    }
}
