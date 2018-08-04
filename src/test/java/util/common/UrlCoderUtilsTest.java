package util.common;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by liangjj on 2017/9/20.
 */
public class UrlCoderUtilsTest {
    private String urlEncode = "http%3A%2F%2Fcn.bing.com%2F";
    private String url = "http://cn.bing.com/";

    @Test
    public void testURLEncoder() throws UnsupportedEncodingException {
        String urlEncode = UrlCoderUtils.urlEncoder(url);
        Assert.assertEquals(this.urlEncode, urlEncode);
    }

    @Test
    public void testURLDecoder() throws UnsupportedEncodingException {
        String urlDecode = UrlCoderUtils.urlDecoder(urlEncode);
        Assert.assertEquals(this.url, urlDecode);
    }
}
