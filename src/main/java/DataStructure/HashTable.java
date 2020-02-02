package DataStructure;

import Inheritance.Hero;

import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {

  /*      HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> temp = new HashMap<>();

        map.put("adc", "物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t", "坦克");

        System.out.println("初始化后的Map:");
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String key: keys){
            String value = map.get(key);
            temp.put(value, key);

        }
        map.clear();
        map.putAll(temp);

        System.out.println(map);*/


       /* HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");

        System.out.println(dictionary.get("t"));*/

        HashMap<String, Hero> heroMap = new HashMap<String,Hero>();
/*
        heroMap.put("gareen", new Hero("gareen1"));
        System.out.println(heroMap.toString());

        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);*/

        //清空map
        heroMap.clear();
        Hero gareen = new Hero("gareen");

        //同一个对象可以作为值插入到map中，只要对应的key不一样
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);

        System.out.println(heroMap);


    }
}
