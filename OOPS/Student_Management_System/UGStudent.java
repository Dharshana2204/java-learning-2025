// UGStudent extends Student and implements ScholarshipEligible
public class UGStudent extends Student implements scholarshipEligible {
    int marks;

    UGStudent(int id, String name, int age, int marks) {
        super(id, name, age);   // super → call parent constructor
        this.marks = marks;
    }

    // Overriding abstract method
    @Override
    void calculateGrade() {
        if (marks >= 75)
            System.out.println(name + " Grade: A");
        else if (marks >= 50)
            System.out.println(name + " Grade: B");
        else
            System.out.println(name + " Grade: C");
    }

    // Overriding parent method
    @Override
    void displayInfo() {
        super.displayInfo();   // call parent method
        System.out.println("UG Marks: " + marks);
    }

    // From ScholarshipEligible interface
    @Override
    public boolean isEligible() {
        return marks >= 80;
    }
}
