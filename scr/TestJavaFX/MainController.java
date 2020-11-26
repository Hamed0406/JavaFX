package TestJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 11/26/2020
 */
public class MainController {
    @FXML
    private Label myRandom;

    public void generatorRandom(ActionEvent event) {

        Random rand = new Random();
        int myrand = rand.nextInt(50) + 1;
        myRandom.setText(Integer.toString(myrand));
        // System.out.println(Integer.toBinaryString(myrand));
    }
}
