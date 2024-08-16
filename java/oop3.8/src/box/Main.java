package box;

import examples.Person;

public class Main {
    public static void main(String[] args) {
  Person person = new Person("Jack", 25);
        person.setAge(40);
        person.setAge(-40);

        System.out.println("Name: " + person.getName() + " age: " + person.getAge());
    }


    Box box = new Box(6);
}