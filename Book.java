class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 500);

        System.out.println("Title: " + b1.title);
        System.out.println("Price: " + b1.price);
    }
}
