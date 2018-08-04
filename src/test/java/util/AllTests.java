package util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.common.*;
import util.resources.ConfigManagerTest;
import util.resources.ResourcesUtilsTest;

/**
 * Created by liangjj on 2017/10/18.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Base64UtilsTest.class,
        DateUtilsTest.class,
        FileUtilsTest.class,
        HttpUtilsTest.class,
        Md5UtilsTest.class,
        StringUtilsTest.class,
        UrlCoderUtilsTest.class,
        XmlUtilsTest.class,
        ConfigManagerTest.class,
        ResourcesUtilsTest.class,
        JsonUtilsTest.class
})
public class AllTests {
}