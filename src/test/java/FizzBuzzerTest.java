import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * This is a sample parameterized test. Parameterized tests allow you to check
 * more scenarios with less code, and almost no duplicate coded
 *
 * @author Ron Ziroby Romero
 *
 */
@RunWith(Parameterized.class)
public class FizzBuzzerTest {
	private final static Object[][] data = {
			{1, "1"},
			{2, "2"},
			{3, "fizz"},
			{4, "4"},
			{5, "buzz"},
			{6, "fizz"},
			{7, "7"},
			{8, "8"},
			{9, "fizz"},
			{10, "buzz"},
			{11, "11"},
			{12, "fizz"},
			{13, "13"},
			{14, "14"},
			{15, "fizzbuzz"},
			{16, "16"},
			{17, "17"},
			{18, "fizz"},
			{19, "19"},
			{20, "buzz"},
			{30, "fizzbuzz"},
			{90, "fizzbuzz"},
	};

    @Parameters(name="FizzBuzz ({0}) should be {1}")
    public static Object[][] getData() {
        return data;
    }

	@Parameter(0)
    public static int n;

    @Parameter(1)
    public static String expected;


	@Test
	public void test() {
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		String actual = fizzBuzzer.buzz(n);

		assertThat(actual, equalTo(expected));
	}
}
