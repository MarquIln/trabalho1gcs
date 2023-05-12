package hello;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GreeterTest {
    private Greeter greeter = new Greeter();
    private Beecrowd_1143 teste1Beecrowd1143 = new Beecrowd_1143();
    private Beecrowd_1143 teste2Beecrowd1143 = new Beecrowd_1143();
    private Beecrowd_1143 teste3Beecrowd1143 = new Beecrowd_1143();
    private Beecrowd_1143 teste4Beecrowd1143 = new Beecrowd_1143();


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

    @Test
    public void teste1Beecrowd1143() {
        String input = "5\n";
        String expectedOutput = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Beecrowd_1143.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void teste2Beecrowd1143() {
        String input = "6\n";
        String expectedOutput = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Beecrowd_1143.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void teste3Beecrowd1143() {
        String input = "8\n";
        String expectedOutput = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Beecrowd_1143.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void teste4Beecrowd1143() {
        String input = "15\n";
        String expectedOutput = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Beecrowd_1143.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void teste5Beecrowd1143() {
        String input = "20\n";
        String expectedOutput = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Beecrowd_1143.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }
}