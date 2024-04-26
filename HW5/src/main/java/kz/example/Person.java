package kz.example;

public class Person {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public  void printInfo(){
        System.out.println("Full Name: " + fullName + " Position: " + position +
                " email: " + email + " phone: " + phoneNumber + " salary: " + salary +
                " age: " + age);
    }
}
