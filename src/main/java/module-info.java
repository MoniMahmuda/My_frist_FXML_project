module com.moni.my_frist_fxml_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.moni.my_frist_fxml_project to javafx.fxml;
    exports com.moni.my_frist_fxml_project;
}