import oop.Student;
public class Student2 {

    public static void main(String[] args) {
       String name = "Temur";     // talabaning ismi
        int age =  20;         // yoshi
        int course = 2;      // nechanchi kursda oqiydi
         {
            System.out.println("Salom! Mening ismim " + name + ", " + "Men " + age + " yoshdaman.");
        }

         {
           course = course + 1;
           System.out.println(name + " endi " + course + "-kursda.");
     }
// _________________________________________________________________________________________________

        Student student1 = new Student();    // 1-obyekt yaratildi
        student1.name = "Temur";
        student1.age = 20;
        student1.course = 2;

        Student student2 = new Student();    // 2-obyekt yaratildi
        student2.name = "Aziz";
        student2.age = 19;
        student2.course = 1;

        student1.sayHello();
        student2.sayHello();

        student2.moveToNextCourse();
        System.out.println(student1.course);






    }
}
