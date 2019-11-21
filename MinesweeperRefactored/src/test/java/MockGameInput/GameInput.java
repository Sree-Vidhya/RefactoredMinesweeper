package MockGameInput;

import java.util.ArrayList;

public interface GameInput
{
    String fieldLayout();
    int totalNumberOfCells(String userEnteredFieldLayout);
    ArrayList<String> entireField(int totalCells);
}
