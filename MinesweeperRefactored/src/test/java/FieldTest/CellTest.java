package FieldTest;

import Field.Cell;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void returnCellState()
    {
        Cell cell = new Cell("*");
        assertEquals("*",cell.getState("*"));
        cell = new Cell(".");
        assertEquals(".",cell.getState("."));
    }
    @Test
    public void returnCellValue()
    {
        Cell cell = new Cell(".");
        assertEquals(0,cell.getValue());
    }
}
