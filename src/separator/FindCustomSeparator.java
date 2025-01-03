package separator;

import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;

public class FindCustomSeparator {
    public String findCustomSeparator(String input) throws CustomSeparatorNoNewLineException, CustomSeparatorNumberException, CustomSeparatorEmptyException {
        if (input.startsWith(SeparatorEnum.CUSTOM_SEPARATOR_FIRST.getSeparator())) {
            int customSeparatorFirestLength = SeparatorEnum.CUSTOM_SEPARATOR_FIRST.getSeparator().length();
            int newLineIndex = input.indexOf(SeparatorEnum.CUSTOM_SEPARATOR_NEWLINE.getSeparator());
            if (newLineIndex == -1) {
                throw new CustomSeparatorNoNewLineException("Custom Separator는 개행문자인 \\n이 필요합니다.");
            }
            String result = input.substring(customSeparatorFirestLength, newLineIndex);
            verificationCustomSeparator(result);
            return result;
        }
        return " ";
    }

    private void verificationCustomSeparator(String customSeparatorString) throws CustomSeparatorNumberException, CustomSeparatorEmptyException, CustomSeparatorNoNewLineException {

        if (customSeparatorString.isEmpty()) {
            throw new CustomSeparatorEmptyException("Custom Separator는 null일 수 없습니다.");
        } else if (isInteger(customSeparatorString)) {
            throw new CustomSeparatorNumberException("Cutome Separator는 숫자로 지정할 수 없습니다.");
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
}
