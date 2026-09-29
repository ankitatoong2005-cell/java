class employee {
    String name;
    double salary;

    employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        employee e1 = new employee("Ankita", 10000);

        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
    }
}
