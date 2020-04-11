import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Number number = new Number();
        int actul = number.sum(5);
        int test = 15;
        assertEquals(actul,test);
    }
}