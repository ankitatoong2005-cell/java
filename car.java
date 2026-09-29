class car {
    String brand;
    int price;

    car() {
        brand = "Toyota";
        price = 1500000;
    }

    public static void main(String[] args) {
        car c1 = new car();

        System.out.println("Brand: " + c1.brand);
        System.out.println("Price: " + c1.price);
    }
}
