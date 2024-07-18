module com.example.assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.opencsv;


    opens com.example.assignment to javafx.fxml;
    exports com.example.assignment;
    exports com.example.assignment.Classes;
    opens com.example.assignment.Classes to javafx.fxml;
    exports com.example.assignment.Admin;
    opens com.example.assignment.Admin to javafx.fxml;
    exports com.example.assignment.Student;
    opens com.example.assignment.Student to javafx.fxml;
}