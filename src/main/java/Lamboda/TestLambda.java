package Lamboda;

import Inheritance.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };

        filter(heros,checker);

        filter(heros, h -> h.hp>100&&h.damage<50);
        filter(heros,TestLambda::testHero);
    }

    public static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }


      /*  Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);



        //直接把Lambda表达式作为参数传进去
        Collections.sort(heros,(h1, h2)->h1.hp>=h2.hp?1:-1);
        System.out.println(heros);*/
    }
}
