package util.common;

import org.junit.Assert;
import org.junit.Test;
import util.helper.DatePattern;

/**
 * Created by liangjj on 2017/9/14.
 */
public class DateUtilsTest {
    @Test
    public void testGetDate() {
        String ymd = DateUtils.getDate(DatePattern.YMD); // 2017-09-14
        Assert.assertTrue(!StringUtils.isEmpty(ymd));
        Assert.assertTrue(ymd.length() == 10);

        String ymdHms = DateUtils.getDate(DatePattern.YMDHMS); // 2018-04-09 09:29:12
        Assert.assertTrue(!StringUtils.isEmpty(ymdHms));
        Assert.assertTrue(ymdHms.length() == 19);

        String ymdHmsS = DateUtils.getDate(DatePattern.YMDHMSS); // 2018-04-09 09:29:12 482
        Assert.assertTrue(!StringUtils.isEmpty(ymdHmsS));
        Assert.assertTrue(ymdHmsS.length() == 23);
    }

    @Test
    public void testGetMillisecondFromDays() {
        long millisecond = DateUtils.getMillisecondFromDays(3);
        Assert.assertTrue(millisecond >= 86400000L);
    }
}