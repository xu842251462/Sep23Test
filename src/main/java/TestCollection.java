public class TestCollection {

        public static void main(String[] args) {
           /* List<Hero> heros = new ArrayList<Hero>();*/


         /*   // 放5个Hero进入容器
            for (int i = 0; i < 5; i++) {
                heros.add(new Hero("hero name " + i));
                System.out.println(heros);
            }

            // 第一种遍历 for循环
            System.out.println("--------for 循环-------");
            for (int i = 0; i < heros.size(); i++) {
                Hero h = heros.get(i);
                System.out.println(h);
            }*/


            /*for (int i = 0; i < 5; i++) {
                heros.add(new Hero("hero name " +i));
            }

            //第二种遍历，使用迭代器
            System.out.println("--------使用while的iterator-------");
            Iterator<Hero> it = heros.iterator();
            while(it.hasNext()){
                Hero h = it.next();
                System.out.println(h);
            }*/



           /* // 放5个Hero进入容器
            for (int i = 0; i < 100; i++) {
                heros.add(new Hero("hero name " + i));
            }

            List<Hero> deleteHeros = new ArrayList<Hero>();

            for(Hero h:heros){
                int id = Integer.parseInt(h.name.substring(10));
                if(id%8==0){
                    deleteHeros.add(h);
                }
            }
            for(Hero h:deleteHeros){
                heros.remove(h);
            }
            System.out.println(heros);*/



        }




}
