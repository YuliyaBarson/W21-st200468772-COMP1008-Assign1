import java.util.ArrayList;

public class Student {
    private String firstName = "Yuliya";
    private String lastName = "Barson";
    private int studentNumber = 200468772;
    private ArrayList<String> interests;

    public Student(String firstName, String lastName, int studentNumber, ArrayList<String>interests) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interests);
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

    public static ArrayList<String> getInterests()
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
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        ArrayList<String> validInterests = getInterests();
        for(String interest : interests)
        {
            if(!validInterests.contains(interest))
                throw new IllegalArgumentException(interest + "is not valid. Valid option are: " + validInterests);
        }
        this.interests = interests;
    }
}
