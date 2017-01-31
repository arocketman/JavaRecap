package com.github.arocketman.corejava;

/**
 * Example of polymorphism. Check the PolymorphismTest to see how it works.
 * Both the Employee and the Customer classes extend the Person class and override the getDescription method.
 * The point is to declare two variables of type Person, yet instantiate them as Employee and Customer.
 * At runtime, the correct getDescription method will be called according to what class is actually instanciated.
 * Polymorphism: The Person class assumes different shapes (i.e Customer or Employee) at runtime.
 * @see  com.github.arocketman.test.PolymorphismTest
 */
public class Polymorphism {

    public class Person{
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getDescription(){
            return "Name: " + name + " , Surname : " + surname;
        }
    }

    public class Employee extends Person{
        Integer monthlySalary;

        public Employee(String name, String surname, Integer monthlySalary) {
            super(name, surname);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " , salary : " + monthlySalary;

        }
    }

    public class Customer extends Person{
        String supportPlan;

        public Customer(String name, String surname, String supportPlan) {
            super(name, surname);
            this.supportPlan = supportPlan;
        }


        @Override
        public String getDescription() {
            return super.getDescription() + " , salary : " + supportPlan;

        }

    }

}


