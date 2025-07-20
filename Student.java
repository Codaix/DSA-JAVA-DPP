public class Student {
    // Private fields
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Public method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method that returns the current object
    public Student getSelf() {
        return this;
    }

    // Main method to test
    public static void main(String[] args) {
        Student s1 = new Student("John", 85);

        // Display details
        s1.display();

        // Demonstrate returning 'this'
        Student s2 = s1.getSelf();
        System.out.println("\nReturned object is the same as s1? " + (s1 == s2));  // true
    }
}
