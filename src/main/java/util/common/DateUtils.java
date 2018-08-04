package util.common;

import util.helper.DatePattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by liangjj on 2017/9/14.
 */
class DateUtils {
    private DateUtils() {
    }

    /**
     * 获取当前年月日（示例：2017-09-14）
     *
     * @param datePattern
     * @return
     */
    static String getDate(DatePattern datePattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern.toString(), Locale.CHINA);
        return simpleDateFormat.format(date);
    }

    /**
     * 输入天数后将返回毫秒数
     *
     * @param days
     * @return
     */
    static long getMillisecondFromDays(int days) {
        // 一天等于86400000毫秒
        return days * 86400000L;
    }
}
