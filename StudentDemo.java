class Student {
    // Member variables
    String name;
    int age;
    int rollNumber;

 
    void setDetails(String studentName, int studentAge, int studentRollNumber) {
        name = studentName;
        age = studentAge;
        rollNumber = studentRollNumber;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}


public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student();

       
        student1.setDetails("Alice", 20, 101);

        student1.displayDetails();
    }
}
