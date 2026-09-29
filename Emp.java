class Emp {

    // Instance variable
    String name;

    // Static variable
    static String companyName = "ABC Company";

    public static void main(String[] args) {

        Emp e1 = new Emp();
        e1.name = "Rakhi";

        Emp e2 = new Emp();
        e2.name = "Ankita";

        System.out.println("Employee 1: " + e1.name);
        System.out.println("Company: " + e1.companyName);

        System.out.println();

        System.out.println("Employee 2: " + e2.name);
        System.out.println("Company: " + e2.companyName);
    }
}