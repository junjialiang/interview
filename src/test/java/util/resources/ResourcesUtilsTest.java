package util.resources;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liangjj on 2017/9/15.
 */
public class ResourcesUtilsTest {
    @Test
    public void testGetFilePath() {
        String filePath = ResourcesUtils.getFilePath("test");
        Assert.assertTrue(filePath != null);
    }
}
