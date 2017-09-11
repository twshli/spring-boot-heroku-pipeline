package pipeline.sample;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shli on 11/09/2017.
 */
public class CalculatorTest {

    @Test
    public void should_get_2_while_add_1_and_1() throws Exception {
        assertThat(Calculator.add(1, 1), is(2));
    }

    @Test
    public void should_get_13_while_add_3_and_10() throws Exception {
        assertThat(Calculator.add(3, 10), is(13));
    }
}