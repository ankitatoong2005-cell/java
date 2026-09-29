class Stu {
    String name;
    int rollNo;
    String course;

    Stu(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Course: " + course;
    }

    public static void main(String[] args) {
        Stu s1 = new Stu("A", 1, "Java");

        System.out.println(s1);
    }
}
