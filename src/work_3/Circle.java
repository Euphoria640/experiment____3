package work_3;
/*
* 圆
* */
public class Circle {
    private double radius;          //半径
    private double PI=Math.PI;      //pi的值=3.1415926......

    public static double sum=0;



    //构造方法
    public Circle(double radius) {
        this.radius = radius;
    }
//    获取周长
    public double getPerimeter(){
        sum+=2*PI*radius;
        return 2*PI*radius;
    }
//    获取面积
    public double getArea(){
        sum+=PI*radius*radius;
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
