package tri.json.test;

import tri.person.Person;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Tom", "Ngo", 33, "Black");
        Person newP = new Person("Gong", "Cha", 41, "Green");
        System.out.println(p);
        System.out.println(newP);
    }
}
