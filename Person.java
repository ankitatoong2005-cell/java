class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name) {
        this.name = name;
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("A");
        Person p3 = new Person("B", 25);

        System.out.println("Person 1: " + p1.name + ", " + p1.age);
        System.out.println("Person 2: " + p2.name + ", " + p2.age);
        System.out.println("Person 3: " + p3.name + ", " + p3.age);
    }
}
