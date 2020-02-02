import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    /*public static void main(String[] args) {
        String className = "Hero";

        try{
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        }catch(Exception e){
            e.printStackTrace();
        }

    }*/

    /*public static void main(String[] args) {
        //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        try {
            //使用反射的方式创建对象
            String className = "Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            System.out.println(pClass);

            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/

   /* public static void main(String[] args) throws InterruptedException {

        String[] all = { "ADHero" };

        for (int i = 0; i < all.length; i++) {
            Hero h = new TestReflection().getHero(all[i]);
            System.out.println(h);
        }

    }

    public Hero getHero(String input) {
        Hero h = null;
        File f = new File("/Users/binxu/IdeaProjects/Sep23Test/src/hero.config");

        try (BufferedReader bfr = new BufferedReader(new FileReader(f))) {
            String className = null;

            while ((className = bfr.readLine()) != null) {
                if (className.equals(input)) {
                    Class pclass = Class.forName(className);
                    Constructor c = pclass.getConstructor();
                    h = (Hero) c.newInstance();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return h;
    }*/
   /*public static void main(String[] args) {
       Hero h =new Hero();
       //使用传统方式修改name的值为garen

       try {
           //获取类Hero的名字叫做name的字段
           Field f1= h.getClass().getDeclaredField("name");
           //修改这个字段的值
           f1.set(h, "teemo");
           //打印被修改后的值
           System.out.println(h.name);

       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

       try{
           Method m = h.getClass().getMethod("setName", String.class);
           m.invoke(h,"jjjj");
           System.out.println(h.getName());

       }catch(Exception e){
           e.printStackTrace();
       }
   }*/

    public static void main(String[] args)throws InterruptedException {
        File f = new File("/Users/binxu/IdeaProjects/Sep23Test/src/hero.txt");

        try(FileReader fr = new FileReader(f)){
            char[] all = new char[(int) f.length()];
            fr.read(all);
            String content = String.valueOf(all);
            String[] cs = content.split("\r\n");
            System.out.println("读取的文件每行内容为：");
            System.out.println(Arrays.toString(cs));

            //利用"类对象"创建对象
            Class<?> class1 = Class.forName(cs[0]);
            Object h1 = class1.newInstance();
            //利用"类对象"获取反射字段name
            //name是该类对象继承的属性，需要用getF
            Field name1 = class1.getField("name");
            //访问字段，进行赋值
            name1.set(h1, cs[1]);

            Class<?> class2 = Class.forName(cs[2]);
            Object h2 = class2.newInstance();
            Field name2 = class2.getField("name");
            name2.set(h2, cs[3]);

            //利用“类对象”获取反射方法attackHero
            Method m = class1.getMethod("attackHero", Hero.class);
            System.out.println("\n对象h1调用方法，参数为对象h2");
            //h1调用方法，传参h2
            m.invoke(h1, h2);

        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
