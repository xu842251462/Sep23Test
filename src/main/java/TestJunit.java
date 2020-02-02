public class TestJunit {
    private static TestJunit ForEachMapEx;


   /* public static void main(String[] args){

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(1234567892));
        System.out.println(reverse(1234567891));


    }

    public static int reverse(int x){
        int curr;
        int result=0;

        while(x!=0){

            curr = x%10;
            result = result*10+curr;
            x/=10;

        }


        return result;
    }*/


   /* public static void main(String[] args) {
       String a = new String("we");
       String b = new String("we");
        System.out.println(a .equals(b));

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }*/
    /*public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b));
    }
*/

  /*  public static void main(String[] args) {

        HashMap<Integer, String> h = new HashMap<>();
        h.put(1,"q");
        System.out.println(h.get(1));

    }*/

 /*   public static void main(String[] args) {
        int[]a = {1,2,4,5,6,8,9,0};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            System.out.println(max);
        }

    }*/
    /*//very bad in large scale
    public static int search(int[] array, int target) {
        for(int i = 0; i<array.length; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
*/


    /*public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(indexOf(a, 6));
    }

    public static int indexOf(int[]a, int key){


        int low = 0;
        int high = a.length-1;
        for(int each: a){
            int mid = (low + high)/2;
            if(key<a[mid]){
                    high = mid-1;
            }else if(key>a[mid]){
                low = mid+1;
            }else{
                return mid;
            }

        }
        return -1;

    }*/

  /*  public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 10, 11, 12, 12, 13, 14, 14, 14, 14, 14, 14, 14, 14};
        int[] res = test(input);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    private static int[] test(int[] input) {
        int slow = 0;
        int fast = 0;
        while (fast < input.length) {
            //when value of index slow is not equal index fast then move forward slow index value to next fast index value
            if (input[slow] != input[fast]) {
                input[++slow] = input[fast];
            }
            fast++;
        }

        return Arrays.copyOf(input, slow + 1);
    }*/


  /*  public static void main(String[] args)
    {
        // Creating an empty Map
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        map.put(25, "Geeks");



        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);

        // Getting the value of 25
        System.out.println("The Value is: " + map.get(25));


    }*/
  /*public static void main(String[] args) {
      HashMap map = new HashMap();
      map.put(1, "a");
      map.put(2, "b");
      map.put(3, "c");
      map.put(4, "d");
      System.out.println(map);

      Set keys = map.keySet();
      System.out.println(keys);

      Collection values =  map.values();
      System.out.println(values);
  }

    public Test() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();

    }



    Object o = new Object();*/


    /*public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        System.out.println(map);
        Set keys = map.keySet();
        Iterator it = keys.iterator();

        while (it.hasNext()){
            int key = (int) it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }*/
/*
    public static boolean checkAccessibility(Roles role) {
        if (role == Roles.MANAGER) {
            return true;
        } else if (role.equals(Roles.DEVELOPER)) {
            return true;
        }else{
            return false;
        }
        //code is verbose, you can simplify on logic
    }

    public static void main(String[] args) {
        Roles role = Roles.MANAGER;
        boolean manager = checkAccessibility(role);
        System.out.println(manager);
        Roles role2 = Roles.DEVELOPER;
        boolean developer = checkAccessibility(role2);
        System.out.println(developer);
    }

    enum Roles {
        MANAGER, DEVELOPER, STAFF;
    }*/


     /*public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if(root == null)
            return true;
        if(min!=null&&root.val<=min)
            return false;
        if(max!=null&&root.val>=max)
            return false;

        return isValidBST(root.left, min, root.val)
        && isValidBST(root.right, root.val, max);



    }*/

  /*  public static void main(String[] args) {
        String[] input = {"a", "a", "b", "c", "b", "a"};
        HashMap map = new HashMap();
        for (String each : input) {
            if (map.get(each) == null) {
                int currentCount = 1;
                map.put(each, currentCount);
            }else{
                int currentCount = (Integer) map.get(each);
                map.put(each, ++currentCount);
            }
        }

        System.out.println(map);
    }*/

   /* @MyAnnotation(value = "must provide a string",value2 = Family.FATHER)
    public static class Player {

        @MyAnnotation(value2 = Family.MOTHER)
        public static void main(String[] args) {

        }
    }

    @interface MyAnnotation {
        String value() default "if no str provided this str will be default";

        Family value2();
    }

    enum Family{
        FATHER,MOTHER;
    }
*/


    /* public static void main(String[] args) throws IOException {
         File file = new File("abc.txt");
         file.createNewFile();
         File file2 = new File(".", "cde.txt");
         file2.createNewFile();
         File file3 = new File("givenPath");
         file3.mkdir();
         System.out.println(file.isFile());
         System.out.println(file.isDirectory());

         System.out.println(File.pathSeparator);
         String pwd = System.getProperty("user.dir");
         System.out.println(pwd);
         File direcotry = new File(pwd);
         String[] files = direcotry.list();
         for (String each : files) {
             System.out.println(each);
         }
         //Try File[] files = direcotry.listFiles(); //the same
         System.out.println(direcotry.getParentFile());
         System.out.println("--------");
         for (String each : files) {
             if (each.endsWith(".txt")) {
                 System.out.println("yes");
                 System.out.println(each);
             }
         }

         //replace with lambda
         String[] filterNames = direcotry.list((dir, name) -> {
             if (name.endsWith(".txt")) {
                 return true;
             }
             return false;
         });
         System.out.println("====");
         for (String each : filterNames) {
             System.out.println(each);
         }
     }*/

   /* public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(improvedFib(8));
    }
    public static long fib(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }

    public static long improvedFib(long index) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (index == 0) {
            return f0;
        }

        else if (index == 1) {
            return f1;
        }

        else if (index == 2) {
            return f2;
        }
        ;

        for (int i = 3; i <= index; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }

        return f2;
    }*/

  /*  // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/blog?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
//    jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1989_Linzu";

    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;

        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            String sql = "select * from user";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("out");
            e.printStackTrace();
        }

    }*/

   /* public static void main(String[] args) throws IOException {



        HashMap<Integer,Integer>[]rows = new HashMap[9];
        HashMap<Integer,Integer>[]colums = new HashMap[9];
        for(int i = 0; i<9; i++){
            rows[i]=new HashMap<Integer,Integer>();
            System.out.println(rows);
            System.out.println("-------------");
            colums[i]=new HashMap<Integer,Integer>();
            System.out.println(colums);

            String path = System.getProperty("java.class.path");
            System.out.println(path);
        }
    }*/

   /* public static void main(String a[]) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Canada", "Ottawa");

        // iterate through Map normal way
        iterateMap(countryMap);

        // iterate through Map using forEach method
        ForEachMapEx.iterateMapUsingForEach(countryMap);
    }

    public static void iterateMap(Map<String, String> countryMap) {

        System.out.println("<----------Iterating in normal way------------->");
        for(Map.Entry<String, String> entry:countryMap.entrySet()) {
            System.out.println("Country: "+entry.getKey()+" : Capital: "+entry.getValue());
        }
    }

    public static void iterateMapUsingForEach(Map<String, String> countryMap) {

        System.out.println("\n<----------Iterating using forEach method------------>");
        countryMap.forEach((k,v)->System.out.println("Country: "+k+" : Capital: "+v));

        countryMap.forEach((k,v)->{
            // you can implement some business logic here..




        });
    }*/

    




}

