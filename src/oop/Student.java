
package oop;

public class Student {
    static final double PI = 3.14;
    static int count;
    static String notebook = "Notebook";
    public String name;
    public int age;
    public int course;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
        public Student(String name){
        this.name = name;
        count ++;
        }

    public Student() {
        
    }

    public static int getCount(){
        return count;
        }

    public void sayHello() {
    }

    public void moveToNextCourse() {
    }
}
