import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'ziroby' at '3/3/16 6:13 PM' with Gradle 2.11
 *
 * @author ziroby, @date 3/3/16 6:13 PM
 */
public class HelloTest {
    @Test public void testHello() {
        String actual = Hello.helloString();
        String expected = "Hello World!";
        assertThat(actual, equalTo(expected));
    }
}