import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColonTest {

    @Test
    void separatorChangePlusString() {
        String totalStrin = "1:2:3";
        Colon colon = new Colon(totalStrin);
        String result = colon.separatorChangePlusString(totalStrin);
        Assertions.assertEquals(result,"1plus2plus3");
    }

    @Test
    void getColonChangePlus() {
        String totalStrin = "1:2:3";
        Colon colon = new Colon(totalStrin);
        String result = colon.getColonChangePlus();
        Assertions.assertEquals(result,"1plus2plus3");
    }
}