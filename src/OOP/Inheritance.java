package OOP;

public class Inheritance {
    public static void main(String[] args) {
        Employee e=new Employee("Gopika",20,600000);
        e.displaydetail();
    }
}

    /*OOP — Inheritance

Create a class Person with fields name and age.
Then, create a subclass Employee that adds salary.
Write a method in Employee to display all details.*/

class Person {
    String name;
    int age;
    Person(String name,int age ){
        this.name=name;
        this.age=age;   }
}
class Employee extends Person{
    int salary;
    Employee(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
    }

    void displaydetail(){
        System.out.print("Name :"+name+" "+ "Age :"+age+" "+"Salary :"+salary);
    }
}

