package work_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class WriteReadFileTest {

    //往文件中写入学生数据
    public static void writeFile(String fileName) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.println("name"+" math"+" java"+" ds"+" avg"+" total");
        for (int i = 0; i < 100; i++) {
            out.println("张三"+i+" "+getScore()+" "+getScore()+" "+getScore()+" 0"+" 0");
        }
        out.close();
    }

    /*
    *使用上一次的编写的public static String[] readStudentsFromFile(String fileName)，把文件中的信息读取到String数组中。
    *
    *编写public static Student[] makeStudentFromString(String[] students)，实现将字符串转化成学生对象。
    * */
    public static Student[] readStudentsFromFile(String fileName) throws FileNotFoundException {
        Student[] student=new Student[100];

        //读入文件演示
        Scanner in = new Scanner(new File(fileName));//为myfile.txt这个File创建一个扫描器in
        int number = 1;//行号
        String[] arr=new String[100];       //创建一个String数组来储存数据
        int index=0;        // 记录数组的下标
        while(in.hasNextLine()){//判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
            String line = in.nextLine();//读出myfile.txt的下一行
            System.out.println("第"+(number++)+"行的内容" +"="+line);

            if(number>2) {
                Scanner linescanner = new Scanner(line);//对每一行的内容建立一个扫描器
                linescanner.useDelimiter(" ");//使用空格作为分隔符
                String name = linescanner.next();
                String math = linescanner.next();
                String java = linescanner.next();
                String ds = linescanner.next();
                String avg = linescanner.next();
                String total = linescanner.next();
                System.out.println("name=" + name + " math=" + math + " java=" + java + " ds=" + ds + " avg" + avg + " total=" + total);
                arr[index++]=name + " " + math + " " + java + " " + ds + " " + avg + " " + total;
            }
        }
        in.close();//读入完毕，最后需要对其进行close。

        //转为Student对象
        index=0;
        for(int i=0;i<arr.length;i++){

            Scanner lineScanner=new Scanner(arr[i]);
            lineScanner.useDelimiter(" ");
            String name=lineScanner.next();
            String math=lineScanner.next();
            String java=lineScanner.next();
            String ds=lineScanner.next();
            String avg=lineScanner.next();
            String total=lineScanner.next();
//            System.out.println("name =" + name);
//            System.out.println("math =" + math);
//            System.out.println("java =" + java);
//            System.out.println("ds =" + ds);
            student[i]=new Student(name,Integer.parseInt(math),Integer.parseInt(java),Integer.parseInt(ds));
            student[i].setAvg();
            student[i].setTotal();
        }

        return student;
    }



    //使用冒泡排序根据属性avg进行排序并输出
    public static void sortStudent(Student[] data){
        for(int i=0;i<100-1;i++){
            for (int j = 0; j < 100-i-1; j++) {
                if((double)data[j].getAvg()>(double) data[j+1].getAvg()){
                    Student temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(data[i].toString());
        }

    }
    //获取0-100的随机数
    public static int getScore(){
        return (int)(Math.random()*101);
    }

}

