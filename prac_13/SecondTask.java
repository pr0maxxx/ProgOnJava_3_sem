package ru.maksim.ikbo2021.new_pracs.prac_13;

public class SecondTask {
    public SecondTask() {
    }

    public static void main(String[] args) {
        SecondTask.Person person = new SecondTask.Person("Viktorov", "Viktor", "Viktorovich");
        person.showInfo();
        SecondTask.Person secondPerson = new SecondTask.Person("Viktorov", "Viktor");
        secondPerson.showInfo();
        SecondTask.Person thirdPerson = new SecondTask.Person("Viktorov");
        thirdPerson.showInfo();
    }

    static class Person {
        String Surname = "";
        String Name = " ";
        String Otchestvo = " ";

        public Person(String surname, String name, String otchestvo) {
            this.Surname = surname;
            this.Name = name;
            this.Otchestvo = otchestvo;
        }

        public Person(String surname, String name) {
            this.Surname = surname;
            this.Name = name;
        }

        public Person(String surname) {
            this.Surname = surname;
        }

        public void showInfo() {
            String var10001 = this.Surname;
            System.out.println(var10001 + " " + this.Name.charAt(0) + " " + this.Otchestvo.charAt(0));
        }
    }
}
