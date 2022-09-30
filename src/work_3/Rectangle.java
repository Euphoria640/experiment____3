package work_3;
/*
* 长方形
* */
public class Rectangle {
    private double length;      //长方形的长
    private double width;       //长方形的宽

    public static double sum=0;


    //构造方法
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //获取长方形的周长
    public double getPerimeter(){
        sum+=2*(length+width);
        return 2*(length+width);
    }

    //获取长方形的面积
    public double getArea(){
        sum+=length*width;
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
