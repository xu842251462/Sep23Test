package Stream;

import java.io.*;

public class testStream {
   /* public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        hero h = new hero();
        h.name = "garen";
        h.hp = 616;

        //准备一个文件用于保存该对象
        File f =new File("/Users/binxu/Desktop/abc.lol");

        try(
                //创建对象输出流
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                //创建对象输入流
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois =new ObjectInputStream(fis);
        ) {
            oos.writeObject(h);
            hero h2 = (hero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }*/

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("name1", 20, 5.5);
        Person p2 = new Person("name2", 30, 6.5);
        Person p3 = new Person("name3", 40, 7.5);

        //file suffix doesn't matter
        FileOutputStream fos = new FileOutputStream("/Users/binxu/Desktop/abc.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.close();

        System.out.println("---------");

        FileInputStream fis = new FileInputStream("/Users/binxu/Desktop/abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p = null;

        for (int i = 0; i < 3; i++) {
            p = (Person) ois.readObject();
            System.out.println(p);
        }

    }
}


class Person implements Serializable {
    //think again what's the diff by using private and without private
    private String name;

    private int age;

    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
