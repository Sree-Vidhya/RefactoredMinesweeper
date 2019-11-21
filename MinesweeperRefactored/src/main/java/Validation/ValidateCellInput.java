package Validation;


import GameInput.UserEnteredInput;

import java.util.ArrayList;

public class ValidateCellInput implements ValidateInput
{
    ArrayList field = new ArrayList();
    String eachCell;
    UserEnteredInput userEnteredInput;

    public ValidateCellInput(UserEnteredInput userEnteredInput)
    {
        this.userEnteredInput = userEnteredInput;
    }

    public boolean validateTheInput(String inputToValidate)
    {
        if(inputToValidate.equals(".") ||inputToValidate.equals("*") )
        {
            return true;
        }
        else
            {
            return false;
        }
    }
    public ArrayList fieldCreatedFromUserCellInput(int totalNumberOfCells)
    {
        System.out.println("Enter the Input for Each Cell: \n'.' for safe zone.\n'*' for mine zone");
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = userEnteredInput.inputInSameLine();
            while (validateTheInput(eachCell) == false) {
                System.out.println("Not a Valid Input");
                eachCell = userEnteredInput.inputInSameLine();
            }
            field.add(eachCell);
        }
        return field;
    }
}
