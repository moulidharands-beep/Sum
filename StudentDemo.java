// Class definition
class Student {
    // Member variables
    String name;
    int age;
    int rollNumber;

    // Member function to set student details
    void setDetails(String studentName, int studentAge, int studentRollNumber) {
        name = studentName;
        age = studentAge;
        rollNumber = studentRollNumber;
    }

    // Member function to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student1 = new Student();

        // Setting details for student1
        student1.setDetails("Alice", 20, 101);

        // Displaying details of student1
        student1.displayDetails();
    }
}
