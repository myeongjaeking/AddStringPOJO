import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RestTest {

    @Test
    void separatorChangePlusString() {
        String totalString = "1,2,3";
        Rest rest = new Rest(totalString);
        String result = rest.separatorChangePlusString(totalString);
        Assertions.assertEquals(result,"1plus2plus3");
    }

    @Test
    void getRestChangePlus() {
        String totalString = "1,2,3";
        Rest rest = new Rest(totalString);
        String result = rest.getRestChangePlus();
        Assertions.assertEquals(result,"1plus2plus3");
    }
}