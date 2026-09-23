public class elseif {
    public static void main(String[] args) {
        // Variable declaration
        int marks = 60;

        // Check multiple conditions using else if ladder
        if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 70) {
            System.out.println("Grade B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Grade D");
        }
    }
}