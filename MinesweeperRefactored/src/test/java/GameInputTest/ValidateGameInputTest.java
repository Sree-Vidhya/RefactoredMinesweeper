package GameInputTest;

import GameInput.UserEnteredInput;
import MockGameInput.ValidateMockGameInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class ValidateGameInputTest {
    UserEnteredInput userEnteredInput = Mockito.mock(UserEnteredInput.class);
    ValidateMockGameInput validateMockGameInput = new ValidateMockGameInput();
    @Test
    public void returnsfieldLayout() {
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        assertEquals("22", validateMockGameInput.fieldLayout());
    }
    @Test
    public void returnTotalNumberOfCells() {
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        validateMockGameInput.fieldLayout();
        assertEquals(4,validateMockGameInput.totalNumberOfCells(userEnteredInput.inputInNextLine()));
    }
    @Test
    public void returnsArrayListForField() {
        ArrayList<String> testField = new ArrayList<String>();
        testField.add(".");
        testField.add("*");
        testField.add(".");
        testField.add(".");
        when(userEnteredInput.inputInNextLine())
                .thenReturn("22");
        when(userEnteredInput.inputInSameLine()).thenReturn(".").thenReturn("*").thenReturn(".").thenReturn(".");
        int totalCells = validateMockGameInput.totalNumberOfCells(userEnteredInput.inputInNextLine());
        ArrayList<String> actual = validateMockGameInput.entireField(totalCells);
        assertEquals(testField,actual);
      
    }
}
