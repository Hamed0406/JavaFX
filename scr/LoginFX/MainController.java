package LoginFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 11/27/2020
 */
public class MainController {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;

    public void login(ActionEvent event) throws IOException {
        if(txtUserName.getText().equals("user")&&txtPassword.getText().equals("pass"))
        {
            lblStatus.setText("Login success");
            Stage secondStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            secondStage.setTitle("second page ");
            secondStage.setScene(scene);
            secondStage.show();
        } else
        {
            lblStatus.setText("Try again");
        }
    }
}
