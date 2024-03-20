import static org.junit.Assert.*;

public class NumberTest {

    @org.junit.Test
    public void test(){
        Number number = new Number();
        int result = number.sum(5);
        int expected = 15;
        assertEquals(expected,result);
    }
}