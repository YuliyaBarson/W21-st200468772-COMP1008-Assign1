import java.util.ArrayList;
import java.util.Arrays;

public class StudentClassTest {
    public static void main(String[] args) {

        ArrayList<String> studentOneInterests = new ArrayList<>();
        studentOneInterests.addAll(Arrays.asList("IT", "Sleeping"));

        Student studentOne = new Student("Katarina", "Wow", 123456789, studentOneInterests);

        System.out.println(studentOne.getFirstName());
        System.out.println(studentOne.getLastName());
        System.out.println(studentOne.getStudentNumber());
        System.out.println(studentOne.getInterest());

    }
}
