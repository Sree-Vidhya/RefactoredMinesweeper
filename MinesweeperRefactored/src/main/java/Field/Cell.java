package Field;

public class Cell
{
    String state;
    int value = 0;

    public Cell(String state) {
        this.state = state;
    }

    public String getState(String state)
    {
        return state;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "Cell{" +
                "state='" + state + '\'' +
                ", value=" + value +
                '}';
    }
}
