public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // This method resolves the s.printFullName() call
    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    public static class Task10 {
        public static void main(String[] args) {
            Student[] students = new Student[] {
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey")
            };

            // Fixed the loop variable data type and name syntax
            for (Student s : students) {
                s.printFullName();
            }
        }
    }
}
