package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class frame {

    @FXML
    private Button ResButton1;

    @FXML
    private Button ResButton2;

    @FXML
    private Button ResButton3;

    @FXML
    private Button ResButton4;

    @FXML
    void reserved1(ActionEvent event) {
        ResButton1.setText("Reserved");

    }

    @FXML
    void reserved2(ActionEvent event) {
        ResButton2.setText("Reserved");

    }

    @FXML
    void reserved3(ActionEvent event) {
        ResButton3.setText("Reserved");
    }

    @FXML
    void reserved4(ActionEvent event) {
        ResButton4.setText("Reserved");
    }

}
