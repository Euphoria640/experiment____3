package work_5;

public class QuadraticEquation {
    private double  a;
    private double  b;
    private double  c;


    //空参构造
    public QuadraticEquation() {
    }

    //含所有属性构造方法
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //返回b*b-4*a*c
    public double getDiscriminant(){
        return  b*b-4*a*c;
    }
    //返回其中的一个根
    public double getRoot1(){

        return (-b+Math.pow(this.getDiscriminant(),1.0/2))/(2*a);
    }
    //返回其中的一个根
    public double getRoot2(){
        return (-b-Math.pow(this.getDiscriminant(),1.0/2))/(2*a);
    }


}
