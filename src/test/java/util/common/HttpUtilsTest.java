package util.common;

import org.junit.Assert;
import org.junit.Test;
import util.helper.HttpContentType;

/**
 * Created by liangjj on 2017/9/15.
 */
public class HttpUtilsTest {
    @Test
    public void testDoGet() throws Exception {
        String url = "https://wx-mkt.ctrip.com/wechat/thirdpartyplatform/getpreauthcode";
        String response = HttpUtils.doGet(url);
        Assert.assertTrue(response.length() > 0);
    }

    @Test
    public void testDoPostWithJSON() throws Exception {
        String url = "https://m.ctrip.com/restapi/soa2/10245/GetGlobalADListV4.json";
        String json = "{\n" +
                "    \"ChannelID\": \"8888\",\n" +
                "    \"SystemCode\": \"9\",\n" +
                "    \"DeviceInfo\": {\n" +
                "        \"ScreenWidth\": 1920,\n" +
                "        \"ScreenHeight\": 1080\n" +
                "    },\n" +
                "    \"GlobalBusinessInfoList\": [\n" +
                "        {\n" +
                "            \"BizType\": \"2208\",\n" +
                "            \"PageCode\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"BizType\": \"2208\",\n" +
                "            \"PageCode\": 7\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        String response = HttpUtils.doPostWithJSON(url, json);
        Assert.assertTrue(response.length() > 0);
    }

    @Test
    public void testDoPostWithXML() {
        String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
        String xml = "<?xml version=\"1.0\"?>\n" +
                "<WeChatTransfersRequest xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <mch_appid>wx0a4845e45aaf634a</mch_appid>\n" +
                "  <mchid>1220070501</mchid>\n" +
                "  <device_info />\n" +
                "  <nonce_str>mcVZh0m5XWK4jdGi8pUyHLSsiwyxKs7L</nonce_str>\n" +
                "  <sign>E8E128B6192C5716F787FEE53C91FBAB</sign>\n" +
                "  <partner_trade_no>1220070501201709194837971279</partner_trade_no>\n" +
                "  <openid>obICEjmvDgm6s2ScdnXank0FgNPk</openid>\n" +
                "  <check_name>NO_CHECK</check_name>\n" +
                "  <re_user_name>王风</re_user_name>\n" +
                "  <amount>2000</amount>\n" +
                "  <desc>抢票失败赔偿款</desc>\n" +
                "  <spbill_create_ip>127.0.0.1</spbill_create_ip>\n" +
                "</WeChatTransfersRequest>";
        String response = HttpUtils.doPostWithJSON(url, xml);
        Assert.assertTrue(response.length() > 0);
    }

    @Test
    public void testDoPostWithFile() {
        String url = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=DystR3TfrjarYLPI36Deww7CrzbZOImQpLktfzEuEEr2umhE-SaTitHAtlLrOu1QSwagpay80lQ5Srwm6dXMf5l9GycLnNLcerWmganr918DBBGep51a6J7M0z9oCBkRBIPiAKDVCJ&type=image";
        String pathname = "d:\\Users\\liangjj\\Desktop\\service\\小程序批量注册\\攻略认证公函\\078.jpg";
        String response = HttpUtils.doPostWithFile(url, pathname, HttpContentType.JPEG);
        Assert.assertTrue(response.length() > 0);
    }
}