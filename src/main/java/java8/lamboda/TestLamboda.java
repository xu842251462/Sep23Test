package java8.lamboda;

public class TestLamboda {
    public static void main(String a[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run now");
            }
        }).start();


        new Thread(()-> System.out.println("LAMBDA")).start();
    }
}
