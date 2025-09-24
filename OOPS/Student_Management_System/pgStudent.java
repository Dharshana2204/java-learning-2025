// PGStudent extends Student and implements ScholarshipEligible
public class pgStudent extends Student implements scholarshipEligible {
    int marks;

    pgStudent(int id, String name, int age, int marks) {
        super(id, name, age);
        this.marks = marks;
    }

    @Override
    void calculateGrade() {
        if (marks >= 85)
            System.out.println(name + " Grade: A");
        else if (marks >= 60)
            System.out.println(name + " Grade: B");
        else
            System.out.println(name + " Grade: C");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("PG Marks: " + marks);
    }

    @Override
    public boolean isEligible() {
        return marks >= 90;
    }
}
