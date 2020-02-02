

public class Player {
    static{
        System.out.println("static block");
    }

    public static void main(String[] args) {
        new Player();
        new Player();

        System.out.println("first");
    }


    static int a;
    public static void what() {
        a =9;
    }
}
// Q: what's the reuslt?
// JVM will read content(classloader) disk of class file, the static block is already executed in memory regardless inheritance feature,but only once
