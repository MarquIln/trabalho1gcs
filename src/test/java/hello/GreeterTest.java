package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

    private Beecrowd_1133 greeter = new Beecrowd_1133();

    @Test
    public void teste_Beecrowd_1133_1() {
        assertEquals(12, Beecrowd_1133.solucao(10,18));
    }
    @Test
    public void teste_Beecrowd_1133_2() {
        assertEquals(22, Beecrowd_1133.solucao(20,30));
    }
    @Test
    public void teste_Beecrowd_1133_3() {
        assertEquals(22, Beecrowd_1133.solucao(30,20));
    }
}
