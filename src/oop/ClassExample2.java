package oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassExample2 {
    public static <primitive> void main(String[] args) {


//        int count = 5;
//        Student studentOne = new Student("Ali", 20);
//    Student studentTwo = new Student("Vali", 21);
//        studentTwo = studentOne;
//        studentTwo.age = 30;
//        System.out.println(studentOne.age);
//        System.out.println(studentTwo.age);

   //====================================================================================

        Student studentOne = new Student("Ali", 20);
        Student studentTwo = new Student("Vali", 20);
        Student studentThee = studentOne;

//        int age = 20;
//        int ageTwo = 20;
//        int number = 30;
//        System.out.println(age == number);  // false
//        System.out.println(age == ageTwo);  // true


                          // EQUALS //  -- solishtiradi

//        System.out.println(studentOne.name.equals(studentTwo.name));  // false qaytaradi chunki Ali va Vali-
                                                                      // bir xil emas!!!
        System.out.println(studentOne == studentTwo);   //false
        System.out.println(studentOne == studentThee); //true

        // STATIC -keyword
        Student student = new Student("Ali");
        Student.notebook = "AAAAAAAAAAA";
            new Student("Ali");
            new Student("Ali");
            new Student("Ali");
        System.out.println(Student.getCount());
        System.out.println(Student.PI);
    }

}
           // FINAL //

