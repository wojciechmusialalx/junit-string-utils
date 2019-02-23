import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

    private StringUtils classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new StringUtils();
    }

    @Test
    public void testZipCode() {
        String zip1 = "12345";

        boolean actual1 = classUnderTest.isValidZipCode(zip1);

        Assert.assertFalse(actual1);
    }
}
