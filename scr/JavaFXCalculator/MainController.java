package JavaFXCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 11/26/2020
 */
public class MainController {
    @FXML
    private Label result;
    private long operand1=0;
    private String operator="";
    private boolean start=true;
   private Model model=new Model();

    @FXML
    public void processNumber(ActionEvent event)
    {
if(start)
{
    result.setText("");
    start=false;
}
String value=((Button)event.getSource()).getText();//Convert button text to string
        result.setText(result.getText()+value);
    }
    @FXML
    public void processOperators(ActionEvent event)
    {
        String value=((Button)event.getSource()).getText();//Convert button text to string
if(!value.equals("="))//Negative scenario
{
    if(!operator.isEmpty())
        return;
    operator=value;
    operand1=Long.parseLong(result.getText());
    result.setText("");

}else
{
    if(operator.isEmpty())
        return;
    long operand2=Long.parseLong(result.getText());
    float outPut= model.calulate(operand1,operand2,operator);
    result.setText(String.valueOf(outPut));
    operator="";
    start=true;
}
    }
}//end of MainController class.
