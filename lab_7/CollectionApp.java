package ru.maksim.ikbo2021.labs.lab_7;

import java.util.LinkedList;
public class CollectionApp {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Россия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Украина"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Россия")){

            System.out.println("Список содержит государство Россия");
        }

        states.remove("Россия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Саня"));
        people.addFirst(new Person("Ваня"));
        people.addLast(new Person("Петя"));
        people.remove(1); // удаление второго элемента

        for(Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}

class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}