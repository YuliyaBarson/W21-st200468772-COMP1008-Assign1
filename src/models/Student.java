/** Application purpose: Student card
 * Author: Yuliya Barson
 * Date: Feb 27,2021
 * Time: 14:45
**/


package models;
import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.Locale;

public class Student {
    //created private variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interest;
    private Image cardImage;

    //constructor that takes 4 arguments
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String>interest) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interest);
        setCardImage();
    }

    private void setCardImage()
    {
        String filePath = String.format("images/%s%s.jpg", firstName, lastName);
        cardImage = new Image(filePath);
    }

    public Image getCardImage() {
        return cardImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName= firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase(Locale.ROOT);//this method will capitalize the first letter
        if(firstName.length()>=2)//this argument will check if the String provided contains at least 2 characters
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name should be at least 2 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName= lastName.substring(0,1).toUpperCase(Locale.ROOT) + lastName.substring(1).toLowerCase(Locale.ROOT);
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
