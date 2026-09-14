class Abc {
    public static void main(String args[]) {
        int a = 20;
        
        if (a < 18) {
            System.out.println("Age is less than 18");
        } else if (a > 18) {
            System.out.println("Age is greter than 18");
        } else if (a == 18) { // Fixed: added 'if' and used '=='
            System.out.println("Age is 18");
        }
    }
}