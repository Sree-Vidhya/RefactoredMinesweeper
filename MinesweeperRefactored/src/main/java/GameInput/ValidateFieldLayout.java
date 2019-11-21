package GameInput;

public class ValidateFieldLayout implements ValidateInput{
    UserEnteredInput userEnteredInput;

    public ValidateFieldLayout(UserEnteredInput userEnteredInput) {
        this.userEnteredInput = userEnteredInput;
    }

    public boolean validateTheInput(String inputToValidate) {
            try {
                Integer.parseInt(inputToValidate);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        public boolean checkingifInputLengthIsTwo(String inputToValidate)
        {
            if(inputToValidate.length() == 2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean validateTheFormatandLength(String inputToValidate)
        {
            boolean validation = false;
            if(validateTheInput(inputToValidate) == true)
            {
                validation =  checkingifInputLengthIsTwo(inputToValidate);
            }
            return validation;
        }
        public String enterFieldLayout()
        {
            String fieldLayout = userEnteredInput.inputInNextLine();

            while(validateTheFormatandLength(fieldLayout) == false)
            {
                System.out.println("Not a Valid integer. Try Again!.");
                fieldLayout = userEnteredInput.inputInNextLine();
            }
            return fieldLayout;
        }
}
