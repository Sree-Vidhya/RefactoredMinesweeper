package ValidateGameInputTest;

import ValidateGameInput.UserEnteredInput;
import ValidateGameInput.ValidateCellInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ValidateCellInputTest
{
    UserEnteredInput userEnteredInputMock = Mockito.mock(UserEnteredInput.class);
    ValidateCellInput validateCellInput = new ValidateCellInput(userEnteredInputMock);
    @Test
    public void validateTheInputReturnsInputwithValidInput()
    {
        assertEquals(true,validateCellInput.validateTheInput("."));
        assertEquals(true,validateCellInput.validateTheInput("*"));
    }
    @Test
    public void validateTheInputReturnsFalsewithInvalidInput()
    {
        assertEquals(false,validateCellInput.validateTheInput("a"));
        assertEquals(false,validateCellInput.validateTheInput("2"));
        assertEquals(false,validateCellInput.validateTheInput(""));
    }

    @Test
    public void userCellInputValidatedCreatedField()
    {
        ArrayList<String> testFieldContent = new ArrayList<String>();
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        testFieldContent.add(".");
        when(userEnteredInputMock.inputInSameLine())
                .thenReturn(".")
                .thenReturn("*")
                .thenReturn(".")
                .thenReturn(".");
        assertEquals(testFieldContent,validateCellInput.fieldCreatedFromUserCellInput(4));
    }
}
