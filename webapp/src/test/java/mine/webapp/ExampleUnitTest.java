package mine.webapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void sb() throws Exception {
        String summary = "";
        StringBuilder stringBuilder = new StringBuilder(summary);
        stringBuilder.append("<html>");
        stringBuilder.append("<body>");
        stringBuilder.append("<a href='http://10.0.2.2:8080/test.asp'>192</a>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
        summary = stringBuilder.toString();
        System.out.println(summary);
    }
}