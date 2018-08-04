package util.common;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by liangjj on 2017/9/14.
 */
public class Base64UtilsTest {
    private String ciphertext = "MTIzNDU2Nzg5MA==";
    private String plaintext = "1234567890";

    @Test
    public void testEncode() throws UnsupportedEncodingException {
        String encodeString = Base64Utils.encode(plaintext);
        Assert.assertEquals(ciphertext, encodeString);
    }

    @Test
    public void testDecode() throws UnsupportedEncodingException {
        String decodeString = Base64Utils.decode(ciphertext);
        Assert.assertEquals(plaintext, decodeString);
    }
}
