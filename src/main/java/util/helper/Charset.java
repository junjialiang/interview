package util.helper;

/**
 * Created by liangjj on 2017/9/20.
 */
public enum Charset {
    UTF8("utf-8");

    String value;

    Charset(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
