module ch.fhnw.assignment1.groupwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.fhnw.assignment1.groupwork to javafx.fxml;
    exports ch.fhnw.assignment1.groupwork;
}