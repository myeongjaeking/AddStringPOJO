import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSeparatorTest {

    @Test
    void isStartSeparator() {
        String totalString = "//a\n1a2a3";
        CustomSeparator customSeparator = new CustomSeparator(totalString);
        boolean result = customSeparator.isStartSeparator(totalString);
        Assertions.assertEquals(result,true);
    }

    @Test
    void separatorChangePlusString() {
        String totalString = "//a\n1a2a3";
        CustomSeparator customSeparator = new CustomSeparator(totalString);
        String result = customSeparator.separatorChangePlusString(totalString);
        Assertions.assertEquals(result,"1plus2plus3");
    }

    @Test
    void getCustomChangePlus() {
        String totalString = "//a\n1a2a3";
        CustomSeparator customSeparator = new CustomSeparator(totalString);
        String result = customSeparator.getCustomChangePlus();
        assertEquals(result,"1plus2plus3");
    }
}