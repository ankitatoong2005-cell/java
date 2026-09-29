class Calculate {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Two integers: " + c.multiply(5, 4));
        System.out.println("Three integers: " + c.multiply(2, 3, 4));
        System.out.println("Two doubles: " + c.multiply(2.5, 4.0));
    }
}
