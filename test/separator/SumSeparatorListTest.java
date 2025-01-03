package separator;

import exception.CustomSeparatorNoNewLineException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumSeparatorListTest {
    private FindCustomSeparator findCustomSeparator = new FindCustomSeparator();
    private SumSeparatorList sumSeparatorList = new SumSeparatorList(findCustomSeparator);
    public String customSeparatorFind(String input) throws CustomSeparatorNoNewLineException {
        int customSeparatorFirstLength = SeparatorEnum.CUSTOM_SEPARATOR_FIRST.getSeparator().length();
        int endIndex = input.indexOf(SeparatorEnum.CUSTOM_SEPARATOR_NEWLINE.getSeparator());
        if(endIndex==-1){
            throw new CustomSeparatorNoNewLineException("Custom Separator는 개행문자인 \\n이 필요합니다.");
        }
        String result = input.substring(customSeparatorFirstLength, endIndex);



        return result;
    }

@DisplayName("Enum값을 List형태로 잘 받아오는가? -> 성공")
    @Test
    void getSeparatorList() {
        List<String> separators = sumSeparatorList.getSeparatorList();
        Assertions.assertTrue(separators.contains(":"));
        Assertions.assertTrue(separators.contains(","));

    }
    @DisplayName("Enum값을 List형태로 잘 받아오는가? -> Enum에 존재하지 않는 구분자여서 실패")
    @Test
    void getNoSeparatorList() {
        List<String> separators = sumSeparatorList.getSeparatorList();
        Assertions.assertTrue(separators.contains("a"));

    }

    @DisplayName("입력 문자열을 customSeparator로 String형태로 추출 가능한가? -> 성공")
    @Test
    void customSeparatorFind() throws CustomSeparatorNoNewLineException {
        String input = "//a\\n1,2,3a4";
        String result = customSeparatorFind(input);
        System.out.println(result);
        Assertions.assertEquals(result,"a");
    }

    @DisplayName("입력 문자열을 customSeparator로 String형태로 추출 가능한가? -> 실패 예측값 : b 실제값 : a")
    @Test
    void customSeparatorFailFind() throws CustomSeparatorNoNewLineException {
        String input = "//a\\n1,2,3a4";
        String result = customSeparatorFind(input);
        System.out.println(result);
        Assertions.assertEquals(result,"b");
    }
@DisplayName("추출된 customSeparator를 잘 저장하는가? -> 성공")
    @Test
    void customSeparatorAddSumSeparatorListTest() {
        String result = "a";
        sumSeparatorList.getSeparatorList().add(result);
        Assertions.assertTrue(sumSeparatorList.getSeparatorList().contains(result));
    }

    @DisplayName("추출된 customSeparator를 잘 저장하는가? -> result가 없어서 실패")
    @Test
    void customSeparatorAddFailSumSeparatorListTest() {
        String result = "a";
        sumSeparatorList.getSeparatorList().add(result);
        Assertions.assertTrue(sumSeparatorList.getSeparatorList().contains("b"));
    }
}