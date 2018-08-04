package util.common;

import org.jdom.JDOMException;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import pojo.Person;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Map;

/**
 * Created by liangjj on 2017/9/13.
 */
public class XmlUtilsTest {
    private String xml = "<person><name><![CDATA[H__D]]></name><age>11</age></person>";

    @Test
    public void testConvertXMLToJson() throws JSONException {
        JSONObject json = XmlUtils.convertXMLToJson(xml);
        Assert.assertNotNull(json);
    }

    @Test
    public void testConvertXMLToMap() throws JDOMException, IOException {
        Map map = XmlUtils.convertXMLToMap(xml);
        Assert.assertTrue(map.size() > 0);
    }

    @Test
    public void testConvertXMLToObject() throws JAXBException {
        Person person = XmlUtils.convertXMLToObject(xml, Person.class);
        Assert.assertTrue(person != null);
    }

    @Test
    public void testConvertBeanToXml() throws JAXBException {
        Person person = XmlUtils.convertXMLToObject(xml, Person.class);
        String xml = XmlUtils.convertObjectToXml(person);
        Assert.assertTrue(xml != null);
    }
}