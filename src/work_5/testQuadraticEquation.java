package work_5;

import java.util.Scanner;

public class testQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner read=new Scanner(System.in);
        System.out.print("a=");
        a=read.nextInt();
        System.out.print("b=");
        b=read.nextInt();
        System.out.print("c=");
        c=read.nextInt();
        QuadraticEquation p=new QuadraticEquation(a,b,c);//创建对象
        //判断判别式的大小

        /*
        * 这两个方法只有在判别式为非负数时才有用。如果判别式为负，则返回0。

        *实现这个类。编写一个测试程序，提示用户输入a,b和c的值，然后显示判别式的值。如果判别式为正数，
        * 显示两个根；如果判别式为0，则显示一个根，否则显示"The equation has no roots."字样。
        * */
        if(p.getDiscriminant()<0){
            System.out.println("The equation has no roots.");
        }else if(p.getDiscriminant()==0){
            System.out.println("方程的解为:"+p.getRoot1());
        }else{
            System.out.println("方程的解为:"+p.getRoot1()+"和 "+p.getRoot2());
        }

    }
}
