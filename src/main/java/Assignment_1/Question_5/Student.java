package Assignment_1.Question_5;




class Student {
    String name;
    int rollNumber;
    String department;


    public Student() {
        name = "No Name ";
        rollNumber = 0;
        department = "Default";
    }

    public Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void displayInformation() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}
