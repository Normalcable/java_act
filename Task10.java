// Student class representing individual student data
class Student {
    private String firstName;
    private String lastName;

    // Constructor name must match the class name (Student)
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print the full name
    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

// Main execution class
public class Task10 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey")
        };

        // Loop through the array and print each student's full name
        for (Student s : students) {
            s.printFullName();
        }
    }
}