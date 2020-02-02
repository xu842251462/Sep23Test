import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestLambda {
    public static void main(String[] args) {
        Supplier<List> s = new Supplier<List>() {
            public List get() {
                return new ArrayList();
            }
        };

        //匿名类
        List list1 = getList(s);

        //Lambda表达式
        List list2 = getList(()->new ArrayList());

        //引用构造器
        List list3 = getList(ArrayList::new);

    }

    public static List getList(Supplier<List> s){
        return s.get();
    }



    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}
  