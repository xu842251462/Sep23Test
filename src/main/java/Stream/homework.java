package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class homework {
// /Users/binxu/Desktop/abc.txt
public static void main(String[] args) {
    // 准备文件lol.txt其中的内容是AB
    File f = new File("/Users/binxu/Desktop/ab.txt");

    try(FileWriter fr = new FileWriter(f)) {

        String cd = "abhuhuwpp";
        char[] cs = cd.toCharArray();
        fr.write(cs);

        System.out.println(cs);
    }catch (IOException e){
        e.printStackTrace();
    }




    /*// 创建基于文件的Reader
    try (FileReader fr = new FileReader(f)) {
        // 创建字符数组，其长度就是文件的长度
        char[]all = new char[(int) f.length()];
        // 以字符流的形式读取文件所有内容
        fr.read(all);
        for (char b:all){
            System.out.println(b);
        }
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }*/

}

}
