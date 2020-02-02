package Reflection;

import java.lang.reflect.Method;

public class Test2 {
    public  void add(int a, int b){
        System.out.println(a+b);
    }

    public void toUpper(String a){
        System.out.println(a.toUpperCase());
    }

    public static void main(String[] args) {
        Test2 a = new Test2();
        Class c = a.getClass();
        try {
            Method method = c.getMethod("add", new Class[]{int.class, int.class});

            method.invoke(a, 10,10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
