// Main class

/*5. Student Management System
 
Concepts:
 
Overloading → addStudent(String name) vs addStudent(String name, int age)
 
Overriding → displayInfo() in UGStudent, PGStudent
 
this → Handle constructor chaining
 
super → Call parent class fields from child
 
final → Prevent modification of student ID
 
Abstract class → Student with abstract calculateGrade()
 
Interface → ScholarshipEligible with isEligible() */


public class StudentManagementSystem {
    // Method overloading
    void addStudent(String name) {
        System.out.println("Student added with name: " + name);
    }

    void addStudent(String name, int age) {
        System.out.println("Student added with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        // Demonstrating Overloading
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.addStudent("Alice");
        sms.addStudent("Bob", 20);

        System.out.println("\n--- UG Student ---");
        UGStudent ug = new UGStudent(101, "Charlie", 19, 78);
        ug.displayInfo();
        ug.calculateGrade();
        System.out.println("Scholarship Eligible? " + ug.isEligible());

        System.out.println("\n--- PG Student ---");
        pgStudent pg = new pgStudent(201, "David", 24, 88);
        pg.displayInfo();
        pg.calculateGrade();
        System.out.println("Scholarship Eligible? " + pg.isEligible());
    }
}
