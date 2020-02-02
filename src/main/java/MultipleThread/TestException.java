package MultipleThread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("d:/LOL.exe");
        try {
            new FileInputStream(f);
            System.out.println("success");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        }catch(Throwable r){
            System.out.println("fail");
            r.printStackTrace();//print the track of process
        }

        finally {
            System.out.println("still execute");
        }



    }
}
