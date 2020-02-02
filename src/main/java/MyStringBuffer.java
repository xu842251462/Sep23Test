import java.util.ArrayList;

public class MyStringBuffer implements IStringBuffer{

    public ArrayList value;

    public MyStringBuffer() {
        value = new ArrayList();
    }

    // 有参构造方法
    public MyStringBuffer(String str) {
        this();
        if (null == str)
            return;
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            value.add(c);
        }

    }

    @Override
    public void append(String str) {
        // TODO Auto-generated method stub

    }

    @Override
    public void append(char c) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(int pos, char b) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(int pos, String b) {

    }

    @Override
    public void delete(int start) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int start, int end) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reverse() {
        for (int i = 0; i < value.size() / 2; i++) {
            int length = value.size();
            char temp = (char) value.get(i);

            value.set(i, value.get(length - i - 1));

            value.set(length - i - 1, temp);
        }

    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String toString() {

        char[] charValue = new char[value.size()];
        for (int i = 0; i < value.size(); i++) {
            charValue[i] = (char) value.get(i);
        }
        return new String(charValue);

    }
}
