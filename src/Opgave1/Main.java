package Opgave1;

public class Main {

    static Student[] students = new Student[3];

    public static void main(String[] args) {
        students[0] = new Student("Anna",23);
        students[1] = new Student("Mikkel",22);
        students[2] = new Student("Sofie",25);

        for (Student student : students) {
            student.printInfo();
            System.out.println();
        }

        int oldestIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > students[oldestIndex].getAge()) {
                oldestIndex = i;
            }
        }

        System.out.println("The oldest student is: ");
        students[oldestIndex].printInfo();
        System.out.println();

        findStudentById("EK2");

    }

    static public void findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("Student found.");
                student.printInfo();
            }

        }

    }

}
