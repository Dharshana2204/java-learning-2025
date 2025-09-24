// Abstract class Student
abstract class Student {
    final int studentID;   // final → cannot change after initialization
    String name;
    int age;

    // Constructor using 'this'
    Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void calculateGrade();

    // Method to be overridden
    void displayInfo() {
        System.out.println("ID: " + studentID + ", Name: " + name + ", Age: " + age);
    }
}
