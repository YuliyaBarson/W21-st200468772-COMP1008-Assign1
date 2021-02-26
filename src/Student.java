import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interest;

    public Student(String firstName, String lastName, int studentNumber, ArrayList<String>interest) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interest);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()>=2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Name should be at least 2 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>=2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last name should be at least 2 characters");
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

    public ArrayList<String> getInterest() {
        return interest;
    }

    public static ArrayList<String> getAllInterests()
    {
        ArrayList<String> interests = new ArrayList<>();
        interests.add("Basketball");
        interests.add("Singing");
        interests.add("Dancing");
        interests.add("Reading");
        interests.add("Volleyball");
        interests.add("Skiing");
        interests.add("Surfing");
        interests.add("Studying");
        interests.add("IT");
        interests.add("Medicine");
        interests.add("Sleeping");
        interests.add("Yoga");
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        ArrayList<String> validInterests = getAllInterests();
        for(String interest : interests)
        {
            if(!validInterests.contains(interest))
                throw new IllegalArgumentException(interest + "is not valid. Valid option are: " + validInterests);
        }
        this.interest = interests;
    }
}
