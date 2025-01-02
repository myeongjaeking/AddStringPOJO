package verification;


import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;
import exception.InputStringBlacnkException;
import separator.SeparatorEnum;
import separator.SumSeparatorList;

public class Verification {
    private SumSeparatorList sumSeparatorList;

    public Verification(SumSeparatorList sumSeparatorList) {
        this.sumSeparatorList = sumSeparatorList;
    }

    public void verificationString(String input) throws CustomSeparatorEmptyException, CustomSeparatorNumberException, CustomSeparatorNoNewLineException, InputStringBlacnkException {
        if (verficationStringBlacnk(input)) {
            throw new InputStringBlacnkException("공백 문자는 포함될 수 없습니다.");
        }
        if (input.startsWith(SeparatorEnum.CUSTOM_SEPARATOR_FIRST.getSeparator())) {
            String customSeparatorString = sumSeparatorList.customSeparatorFind(input);

            if (!input.contains(SeparatorEnum.CUSTOM_SEPARATOR_NEWLINE.getSeparator())) {
                throw new CustomSeparatorNoNewLineException("Custom Separator는 개행문자인 \\n이 필요합니다.");
            } else if (customSeparatorString.isEmpty()) {
                throw new CustomSeparatorEmptyException("Custom Separator는 null일 수 없습니다.");
            } else if (isInteger(customSeparatorString)) {
                throw new CustomSeparatorNumberException("Cutome Separator는 숫자로 지정할 수 없습니다.");
            }

        }


    }

    private boolean isInteger(String customSeparatorString) {
        try {
            Integer.parseInt(customSeparatorString);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
