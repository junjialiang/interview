package util.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liangjj on 2017/9/13.
 */
public class StringUtilsTest {
    @Test
    public void testIsEmpty() {
        String empty = "";
        String nonEmpty = "nonEmpty";
        boolean isEmpty1 = StringUtils.isEmpty(empty);
        boolean isEmpty2 = StringUtils.isEmpty(nonEmpty);
        Assert.assertEquals(true, isEmpty1);
        Assert.assertEquals(false, isEmpty2);
    }

    @Test
    public void testGenerateRandomString() {
        int length = 32;
        String randomString1 = StringUtils.generateRandomString(length);
        String randomString2 = StringUtils.generateRandomString(length);
        Assert.assertTrue(randomString1.length() == randomString2.length());
        Assert.assertTrue(randomString1.length() == length);
        Assert.assertTrue(randomString2.length() == length);
        Assert.assertNotEquals(randomString1, randomString2);
    }
}
