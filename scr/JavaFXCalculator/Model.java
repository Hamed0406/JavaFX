package JavaFXCalculator;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 11/26/2020
 */

//This model contain functionality of calculator.
public class Model {
    public float calulate(long operand1,long operand2,String operator)
    {//TODO
        //Creat method for calculation .
        switch (operator){
            case"+":
              return   operand1+operand2;
            case"-":
                return operand1-operand2;
            case"*":
                return operand1*operand2;
            case "/":
                if(operand2==0)
                    return 0;
                return operand1/operand2;
            default:
                return 0;//For any symbol is not match to any case return  0.

        }//End of switch.
    }
}//End of Model class
