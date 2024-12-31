import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumPlusTest {

    @Test
    void plustSeparator() {
        String plusString = "1plus2plus3";
        SumPlus sumPlus = new SumPlus(plusString);
        String[] changeArrayStrng = sumPlus.plustSeparator(plusString);
        Assertions.assertEquals(changeArrayStrng[0],"1");
        Assertions.assertEquals(changeArrayStrng[1],"2");
        Assertions.assertEquals(changeArrayStrng[2],"3");
    }

    @Test
    void sumPlusArrayString() {
        String plusString = "1plus2plus3";
        SumPlus sumPlus = new SumPlus(plusString);
        int sum =sumPlus.sumPlusArrayString(sumPlus.plustSeparator(plusString));
        Assertions.assertEquals(sum,6);
    }

    @Test
    void getSum() {
        String plusString = "1plus2plus3";
        SumPlus sumPlus = new SumPlus(plusString);
        int result = sumPlus.getSum();
        Assertions.assertEquals(result,6);
    }
}