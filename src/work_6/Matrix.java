package work_6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Matrix {

    private int m;          //数组行数
    private int n;          //数组列数
    private double [][] data= new double[m][n];//给数组分配空间

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        data=new double[m][n];
        for(double[] a:data) {
            Arrays.fill(a, 0, a.length - 1, 0);      //初始化数组为0
        }
    }
    //用于设置第row行，第col列元素的值；
    public void setElement(int row, int col, double value){
        data[row][col]=value;
    }
    //实现当前矩阵与m矩阵相加，并返回新的矩阵；若无法相加，则返回null；
    public Matrix add(Matrix m){
        if(this.m==m.m&&this.n==m.n){
            Matrix p=new Matrix(this.m,this.n);
            for(int i=0;i<this.m;i++){
                for(int j=0;j<this.n;j++){
                    p.setElement(i,j,data[i][j]+m.data[i][j]);
                }
            }
            return p;
        }
        return null;
    }
    //实现当前矩阵减去m矩阵，并返回新的矩阵；若无法相减，则返回null
    public Matrix minus(Matrix m){
        if(this.m==m.m&&this.n==m.n){
            Matrix p=new Matrix(this.m,this.n);
            for(int i=0;i<this.m;i++){
                for(int j=0;j<this.n;j++){
                    p.setElement(i,j,data[i][j]-m.data[i][j]);
                }
            }
            return p;
        }
        return null;
    }

    //实现当前矩阵乘以m矩阵，并返回新的矩阵；若无法相乘，则返回null
    public Matrix multiple(Matrix m){
        if(this.n==m.m){
         Matrix p=new Matrix(this.m,m.n);
            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < m.data[0].length; j++) {
                    for (int k = 0; k < m.data.length; k++) {
                        p.data[i][j]+=this.data[i][k]*m.data[k][j];
                    }
                }
            }
        return p;
        }
        return null ;
    }
    //实现矩阵转置，并返回新的矩阵
    public Matrix transposition(){
      double[] arr=new double[this.m*this.n];
        Matrix p=new Matrix(this.n,this.m);
        int k=0;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[k++] =this.data[j][i];
            }
        }
        k=0;
        for(int i = 0;i<this.n;i++)
            for (int j = 0; j < this.m; j++) {
                p.data[i][j]=arr[k++];
            }
        return p ;
    }
    //打印当前矩阵
    public void display(){
        for (double[] datum : data) {
            for (double v : datum) {
                System.out.print(v + " \t");
            }
            System.out.println();
        }
    }

    //生成随机数填入数组中
    public void initialization(){
        Random random=new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j]=random.nextInt(15)+5;
            }
        }
    }




}
