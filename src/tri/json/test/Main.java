package tri.json.test;

import tri.person.Person;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Tom", "Ngo", 33, "Black");
        Person newP = new Person("Gong", "Cha", 41, "Green");
        Person p2 = new Person("Trump", "Dump", 77, "Red");
        System.out.println(p);
        System.out.println(p2);
        System.out.println(newP);
    }
}
