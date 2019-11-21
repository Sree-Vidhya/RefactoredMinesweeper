package MockGameInput;

import Field.FieldLayout;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;
import org.mockito.Mockito;
import GameInput.UserEnteredInput;

import java.util.ArrayList;

import static org.mockito.Mockito.when;


public class ValidateMockGameInput implements GameInput
{
    String userEnteredFieldLayout;
    UserEnteredInput userEnteredInput = Mockito.mock(UserEnteredInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(userEnteredInput);
    ValidateCellInput validateCellInput = new ValidateCellInput(userEnteredInput);
    FieldLayout fieldLayout = new FieldLayout(userEnteredFieldLayout);
    int totalCells;

    @Override
    public String fieldLayout() {
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        return validateFieldLayout.enterFieldLayout();
    }

    @Override
    public int totalNumberOfCells(String userEnteredFieldLayout) {
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        int numberOfRows = fieldLayout.calculatingNumberOfRows(userEnteredFieldLayout);
        int numberOfColumns = fieldLayout.calculatingNumberOfColumns(userEnteredFieldLayout);
        totalCells =  (numberOfRows * numberOfColumns);
        return totalCells;
    }

    @Override
    public ArrayList<String> entireField(int totalCells) {
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        when(userEnteredInput.inputInSameLine()).thenReturn(".").thenReturn("*").thenReturn(".").thenReturn(".");
        ArrayList field = validateCellInput.fieldCreatedFromUserCellInput(4);
        System.out.println(field);
        return field;
    }
}
