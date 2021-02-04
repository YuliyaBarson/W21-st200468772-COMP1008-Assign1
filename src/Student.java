public class Student {
    private String firstName = "Yuliya";
    private String lastName = "Barson";
    private int studentNumber = 200468772;

    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber >=100000000 && studentNumber<=999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("student # out of range 100000000-999999999");
    }
}
