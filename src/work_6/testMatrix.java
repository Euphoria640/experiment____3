package work_6;

import java.awt.geom.Path2D;

public class testMatrix {
    public static void main(String[] args) {
        Matrix p1=new Matrix(5,4);       //对象1
        Matrix p2=new Matrix(4,4);       //对象2
        Matrix p3=new Matrix(4,4);       //对象3
        Matrix p4=new Matrix(4,3);       //对象4

        //初始化矩阵
        p1.initialization();
        p2.initialization();
        p3.initialization();
        p4.initialization();

        //打印数组
        System.out.println("矩阵1");
        p1.display();
        System.out.println("矩阵2");
        p2.display();
        System.out.println("矩阵3");
        p3.display();
        System.out.println("矩阵4");
        p4.display();

        //设置矩阵中某个值
        System.out.println("原来的矩阵:");
        p1.display();
        p1.setElement(1,3,10.0);
        p1.setElement(1,2,11.2);
        p1.setElement(0,3,9.5);
        p1.setElement(0,2,9.5);
        p1.setElement(2,3,9.5);
        System.out.println("修改后的矩阵:");
        p1.display();

        //矩阵相加
//        Matrix p1=new Matrix(5,4);       //对象1
//        Matrix p2=new Matrix(4,4);       //对象2
//        Matrix p3=new Matrix(4,4);       //对象3
//        Matrix p4=new Matrix(4,3);       //对象4
        if(p1.add(p2)==null){
            System.out.println("1矩阵不能与2矩阵相加");
        }
        System.out.println("2矩阵与3矩阵相加后的矩阵:");
        p2.add(p3).display();

        //矩阵相减
        if(p1.add(p2)==null){
            System.out.println("1矩阵不能与2矩阵相减");
        }
        System.out.println("2矩阵与3矩阵相减后的矩阵:");
        p2.minus(p3).display();

        //矩阵相乘
//        Matrix p1=new Matrix(5,4);       //对象1
//        Matrix p2=new Matrix(4,4);       //对象2
//        Matrix p3=new Matrix(4,4);       //对象3
//        Matrix p4=new Matrix(3,3);       //对象4.
        if(p1.multiple(p4)==null){
            System.out.println("矩阵1与矩阵4不能相乘");
        }
        System.out.println("矩阵1与矩阵4相乘的结果:");
        p1.multiple(p2).display();

        //矩阵的转置
        System.out.println("矩阵1转置前:");
        p1.display();
        System.out.println("转置后:");
        p1.transposition().display();
    }
}
