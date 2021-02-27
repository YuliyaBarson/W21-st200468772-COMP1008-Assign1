package controllers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import models.Student;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

    public class StudentViewController implements Initializable {
        @FXML
        private Label firstNameLabel;

        @FXML
        private Label lastNameLabel;

        @FXML
        private Label studentNumberLabel;

        @FXML
        private ImageView imageView;

        @FXML
        private ListView<String> favouriteActivitiesLabel;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            //create a student object
            ArrayList<String> studentOneInterests = new ArrayList<>();
            studentOneInterests.addAll(Arrays.asList("Yoga", "IT", "Sleeping"));
            //convert array list into observable list in order to be able to print it out
            ObservableList<String> oStudentOneActivities = FXCollections.observableArrayList(studentOneInterests);
            Student studentOne = new Student("yuliya", "barson", 200468772, studentOneInterests);

            //set outputs
            firstNameLabel.setText(studentOne.getFirstName());
            lastNameLabel.setText(studentOne.getLastName());
            studentNumberLabel.setText(Integer.toString(studentOne.getStudentNumber()));
            imageView.setImage(studentOne.getCardImage());
            favouriteActivitiesLabel.setItems(oStudentOneActivities);
        }
    }


