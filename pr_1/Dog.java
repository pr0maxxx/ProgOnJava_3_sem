package ru.maksim.ikbo2021.pracs.pr_1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog() {
        this.name = "Shesh";
        this.age = 1;
    }

    public int toHumanAge(){
        System.out.println("age in human years is: ");
        return age * 7;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
