package util.common;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;
import pojo.Person;

import java.io.IOException;

/**
 * Created by liangjj on 2017/10/18.
 */
public class JsonUtilsTest {

    @Test
    public void testConvertJsonToObject() throws IOException {
        String json = "{\n" +
                "    \"user_name\":\"H__D\",\n" +
                "    \"age\":11,\n" +
                "    \"sex\":\"男\"\n" +
                "}";
        Person person = JSON.parseObject(json, Person.class);
        Assert.assertEquals("H__D", person.getName());
        Assert.assertEquals("11", String.valueOf(person.getAge()));
    }
}
