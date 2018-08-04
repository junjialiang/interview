package util.common;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by liangjj on 2017/10/18.
 */
class JsonUtils {
    private JsonUtils() {
    }

    /**
     * 将 JSON 字符串转化成对象（已废弃）
     *
     * @param jsonStr
     * @param obj
     * @return
     */
    static <T> T convertJsonToObject(String jsonStr, Class<T> obj) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonStr, obj);
    }
}
