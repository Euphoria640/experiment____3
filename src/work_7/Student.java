package work_7;

public class Student {
    private String name;
    private int math;
    private int java;
    private int ds;
    private int avg;
    private int total;


    public Student(String name, int math, int java, int ds) {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
    }

    public Student(String name, int math, int java, int ds, int avg, int total) {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.avg = avg;
        this.total = total;
    }

    @Override
    public String toString() {
        return "name:"+name+" \tmath:"+math+" \tjava:"+java+" \tds:"+ds+" \tavg:"+avg+" \ttotal:"+total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getDs() {
        return ds;
    }

    public void setDs(int ds) {
        this.ds = ds;
    }

    public int getAvg() {
        return (this.math+this.java+this.ds)/3;
    }

    public void setAvg() {
        this.avg = (this.math+this.java+this.ds)/3;
    }

    public int getTotal() {
        return this.math+this.java+this.ds;
    }

    public void setTotal() {
        this.total = this.math+this.java+this.ds;
    }
}
