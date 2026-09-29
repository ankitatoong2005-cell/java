class Employee1 {
    String name;
    static String companyName = "ABC Company";

    Employee1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("A");
        Employee1 e2 = new Employee1("AB");

        System.out.println("Employee 1 Name: " + e1.name);
        System.out.println("Company Name: " + Employee1.companyName);

        System.out.println("Employee 2 Name: " + e2.name);
        System.out.println("Company Name: " + Employee1.companyName);
    }
}
