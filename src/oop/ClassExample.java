package oop;


 import java.util.concurrent.Callable;

 public class ClassExample {
 public  static <Student> void main(String[] args) {
    Car spark = new Car();
    spark.year = 2011;
    spark.name = "Spark";
    spark.model = "Chevrolet";

    Car matiz = new Car();
    matiz.year = 2005;
    matiz.name = "Matiz";
    matiz.model = "Cevrolet";

    Car toyota = new Car();
    toyota.year = 2020;
    toyota.name = "Land Cruiser";
    toyota.model = "Toyota";

    spark.introduce();
    matiz.introduce();
    toyota.introduce();

    Car car = new Car();
     System.out.println(car.model);

     Car Spark = new Car("Spark",2011);
     spark.introduce();

     Car Matiz = new Car("Matiz", 2005);
     matiz.introduce();

     Car Toyota = new Car("land Cruiser", 2020);
     toyota.introduce();

   //======================================================================================



 }
}
