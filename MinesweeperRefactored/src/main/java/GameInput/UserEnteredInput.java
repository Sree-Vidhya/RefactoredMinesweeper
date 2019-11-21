package GameInput;

import java.util.Scanner;

public class UserEnteredInput {
    Scanner input = new Scanner(System.in);
    public String inputInSameLine(){
        return input.next();
    }
    public String inputInNextLine()
    {
        return input.nextLine();
    }
}
