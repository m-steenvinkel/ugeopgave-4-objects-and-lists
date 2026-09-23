package Opgave1;

public class Student {
    private String name;
    private int age;
    private String studentId;
    static private int studentCount = 0;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
        this.studentId = "EK" + studentCount;
    }

    public int getAge() {
        return this.age;
    }

    public String getStudentId(){
        return this.studentId;
    }

    public void printInfo() {
        System.out.println("Student info:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("StudentID: " + this.studentId);
    }


}
