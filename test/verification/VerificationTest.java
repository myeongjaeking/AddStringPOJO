package verification;

import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;
import exception.InputStringBlacnkException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import separator.SeparatorEnum;
import separator.SumSeparatorList;

import static org.junit.jupiter.api.Assertions.*;

class VerificationTest {
    private SumSeparatorList sumSeparatorList = new SumSeparatorList();

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

    @DisplayName("입력한 문자열에 공백이 존재하는지 확인 -> 성공")
    @Test
    void verficationStringBlacnk() throws InputStringBlacnkException {
        String input = "1,2 ,3,4";
        Assertions.assertThrows(InputStringBlacnkException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 공백이 존재하는지 확인 -> 공백X 실패")
    @Test
    void verficationStringNoBlacnk() throws InputStringBlacnkException {
        String input = "1,2,3,4";
        Assertions.assertThrows(InputStringBlacnkException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 개행문자가 있는지 확인 -> 성공")

    @Test
    void CustomSeparatorNoNewLineException() throws CustomSeparatorNoNewLineException {
        String input = "//a1a2a3";
        Assertions.assertThrows(CustomSeparatorNoNewLineException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 개행문자가 있는지 확인 -> 개행문자 존재 및 예외처리 달라서 실패 ")

    @Test
    void CustomSeparatorNotNoNewLineException() throws CustomSeparatorNoNewLineException, CustomSeparatorEmptyException {
        String input = "//a\n1a2a3";
        Assertions.assertThrows(CustomSeparatorEmptyException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 customSeparator가 비어져 있는지 확인 -> 성공")

    @Test
    void CustomSeparatorEmptyException() throws CustomSeparatorEmptyException {
        String input = "//\\n1,2,3";
        Assertions.assertThrows(CustomSeparatorEmptyException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 customSeparator가 비어져 있는지 확인 ->  존재해서 실패 ")

    @Test
    void CustomSeparatorNotEmptyException() throws CustomSeparatorNoNewLineException, CustomSeparatorEmptyException {
        String input = "//a\\n1a2a3";
        Assertions.assertThrows(CustomSeparatorEmptyException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 customSeparator가 숫자인지 확인 -> 성공")

    @Test
    void CustomSeparatorNumberException() throws CustomSeparatorNumberException {
        String input = "//1\\n1,2,3";
        Assertions.assertThrows(CustomSeparatorNumberException.class, () -> {
            verificationString(input);
        });
    }

    @DisplayName("입력한 문자열에 customSeparator가 숫자인지 확인 ->  숫자가 아니라서 실패 ")

    @Test
    void CustomSeparatorNoNumberException() throws CustomSeparatorNumberException, CustomSeparatorEmptyException {
        String input = "//a\\n1a2a3";
        Assertions.assertThrows(CustomSeparatorEmptyException.class, () -> {
            verificationString(input);
        });
    }


}