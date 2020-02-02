package item;

public class LifePortion extends Item{

    @Override
    public void effect() {
        System.out.println("血瓶使用后，可以回血");
    }
}
