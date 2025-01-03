package verification;


import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;
import exception.InputStringBlacnkException;

public class VerificationInput {



    public void verificationString(String input) throws CustomSeparatorEmptyException, CustomSeparatorNumberException, CustomSeparatorNoNewLineException, InputStringBlacnkException {
        if (verficationStringBlacnk(input)) {
            throw new InputStringBlacnkException("공백 문자는 포함될 수 없습니다.");
        }

    }


    private boolean verficationStringBlacnk(String input) {

        if (input.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }



}
