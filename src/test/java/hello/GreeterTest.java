package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import org.junit.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
    public void testEhPrimo() {
        Beecrowd_1165 VerificarPrimo = null;
        Assert.assertTrue( VerificarPrimo.ehPrimo(2));
        Assert.assertFalse(VerificarPrimo.ehPrimo(4));
        Assert.assertTrue(VerificarPrimo.ehPrimo(17));
        Assert.assertTrue(VerificarPrimo.ehPrimo(10000019));
        Assert.assertFalse(VerificarPrimo.ehPrimo(10000000));
    }
}