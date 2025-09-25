/*
Suppose sam is an object of a class named Person and suppose increaseAge
is a method for the class Person that takes one argument that is an integer.
How do you write an invocation of the method increaseAge using sam as
the calling object and using the argument 10? The method increaseAge will
change the data in sam so that it simulates sam aging by 10 years.
 */


package chapter1.Section3_String;

class Person {
    private int age;

    public Person() {
        this.age = 0; // Initial age
    }

    public void increaseAge(int years) {
        if (years > 0) {
            this.age += years;
            System.out.println("Age increased by " + years + " years. New age: " + this.age);
        } else {
            System.out.println("Invalid number of years to increase.");
        }
    }
}

public class Ex_2_31_Increase_age {
    public static void main(String[] args) {
        Person sam = new Person();
        sam.increaseAge(10);
    }
}
