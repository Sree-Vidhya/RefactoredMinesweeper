package GameInput;

import Field.FieldLayout;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;

import java.util.ArrayList;

public class ValidateGameInput
{
    String userEnteredFieldLayout;
    UserEnteredInput userEnteredInput;
    ValidateFieldLayout validateFieldLayout;
    ValidateCellInput validateCellInput;
    FieldLayout fieldLayout;
    int totalCells;

    public ValidateGameInput(UserEnteredInput userEnteredInput, ValidateFieldLayout validateFieldLayout, ValidateCellInput validateCellInput) {
        this.userEnteredInput = userEnteredInput;
        this.validateFieldLayout = validateFieldLayout;
        this.validateCellInput = validateCellInput;
    }

    public String fieldLayout() {
        userEnteredFieldLayout =   validateFieldLayout.enterFieldLayout();
        return userEnteredFieldLayout;
    }
    public int totalNumberOfCells(String userEnteredFieldLayout){
        fieldLayout = new FieldLayout(userEnteredFieldLayout);
        int numberOfRows = fieldLayout.calculatingNumberOfRows(userEnteredFieldLayout);
        int numberOfColumns = fieldLayout.calculatingNumberOfColumns(userEnteredFieldLayout);
        totalCells = (numberOfRows*numberOfColumns);
        return totalCells;
    }
    public ArrayList<String> entireField(int totalCells){
        return validateCellInput.fieldCreatedFromUserCellInput(totalCells);
    }
}
