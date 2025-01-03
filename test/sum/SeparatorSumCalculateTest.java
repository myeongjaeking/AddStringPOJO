package sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import separator.SumSeparatorList;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SeparatorSumCalculateTest {
    private SeparatorSumCalculate calculate = new SeparatorSumCalculate();
    private SumSeparatorList sumSeparatorList = new SumSeparatorList();
@DisplayName("구분자 덧셈 결과값 일치하는지 확인 -> 성공")
    @Test
    void separatorSumCalculate() {
        String input="1,2:3,4";
        calculate.separatorSumCalculate(sumSeparatorList.getSeparatorList(),input);
        int result = calculate.sumCalculate();
        Assertions.assertEquals(10,result);
    }

    @DisplayName("구분자 덧셈 결과값 일치하는지 확인 -> 실패 예측 : 11, 실제 : 10")
    @Test
    void separatorSumFaileCalculate() {
        String input="1,2:3,4";
        calculate.separatorSumCalculate(sumSeparatorList.getSeparatorList(),input);
        int result = calculate.sumCalculate();
        Assertions.assertEquals(11,result);
    }
}