package controllers;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
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

            ArrayList<String> studentOneInterests = new ArrayList<>();
            studentOneInterests.addAll(Arrays.asList("Yoga", "IT", "Sleeping"));
            Student studentOne = new Student("yuliya", "barson", 200468772, studentOneInterests);

            firstNameLabel.setText(studentOne.getFirstName());
            lastNameLabel.setText(studentOne.getLastName());
            studentNumberLabel.setText(Integer.toString(studentOne.getStudentNumber()));
            imageView.setImage(studentOne.getCardImage());

        }
    }


