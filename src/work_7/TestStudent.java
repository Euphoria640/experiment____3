package work_7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class TestStudent {
    public static void main(String[] args) throws FileNotFoundException {
        WriteReadFileTest.writeFile("Students.txt");        //生成数据存入文件
        WriteReadFileTest.readStudentsFromFile("Students.txt");         //读取文件并转为Student对象
        Student[] data=WriteReadFileTest.readStudentsFromFile("Students.txt");      //使用Student数组接收返回的数据
        WriteReadFileTest.sortStudent(data);        //对Student对象中的avg排序并输出
    }
}
