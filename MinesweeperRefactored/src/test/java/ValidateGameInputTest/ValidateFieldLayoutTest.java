package ValidateGameInputTest;


import ValidateGameInput.UserEnteredInput;
import ValidateGameInput.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldLayoutTest {
    UserEnteredInput userEnteredInputMock = Mockito.mock(UserEnteredInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(userEnteredInputMock);

    @Test
    public void testStringInputReturnsFalse() {
        when(userEnteredInputMock.inputInNextLine())
                .thenReturn("a");
        assertEquals(false,validateFieldLayout.validateTheInput(userEnteredInputMock.inputInNextLine()));
    }
    @Test
    public void testTwoIntegerReturnsTrue() {
        when(userEnteredInputMock.inputInNextLine())
                .thenReturn("44");
        assertEquals(true,validateFieldLayout .checkingifInputLengthIsTwo(userEnteredInputMock.inputInNextLine()));
    }
    @Test
    public void testOneIntegerReturnsFalse() {
        when(userEnteredInputMock.inputInNextLine())
                .thenReturn("4");
        assertEquals(false,validateFieldLayout .checkingifInputLengthIsTwo(userEnteredInputMock.inputInNextLine()));
    }
    @Test
    public void testEmptyInputReturnsFalse() {
        when(userEnteredInputMock.inputInNextLine())
                .thenReturn("");
        assertEquals(false,validateFieldLayout .validateTheInput(userEnteredInputMock.inputInNextLine())); }
}
