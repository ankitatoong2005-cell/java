class keyword{
    String title;
    double price;

    keyword(String title,double price)
    {
        this.title=title;
        this.price=price;
    }
    void display(){
        System.out.println("title:"+title);
        System.out.println("price:"+price);
    }
    public static void main(String[] args) {
        keyword b=new keyword("java basics",500.0);
        b.display();
    }
}