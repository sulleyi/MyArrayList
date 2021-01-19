public class Driver {

    public static void main(String[] args){

        myArrayList<String> testArrayList = new myArrayList<String>();

        String a = "Hello";
        String b = "This is myArrayList";
        String c = "delete me!";
        String d = "Testing...";
        String e = "Hello2";
        String f = "This is myArrayList2";
        String g = "delete me!2";
        String h = "Testing...2";
        String i = "Hello3";
        String j = "This is myArrayList3";
        String k = "delete me!3";
        String l = "Testing...3";

        //test resize function
        testArrayList.add(a);
        testArrayList.add(b);
        testArrayList.add(c);
        testArrayList.add(d);
        testArrayList.add(e);
        testArrayList.add(f);
        testArrayList.add(g);
        testArrayList.add(h);
        testArrayList.add(i);
        testArrayList.add(j);
        testArrayList.add(k);
        testArrayList.add(l);

        //test get()
        System.out.println("Element at index 1 of testArrayList:");
        System.out.println(testArrayList.get(1));

        System.out.println();

        //test size()
        System.out.println("Size of testArrayList before we remove an element: ");
        System.out.println(testArrayList.size());

        System.out.println();

        //test remove()
        System.out.println("Remove element" + a);
        testArrayList.remove(a);

        System.out.println();

        System.out.println("Now the size of testArrayList is: ");
        System.out.println(testArrayList.size());

        System.out.println();

        //test contains()
        System.out.println(testArrayList.contains(c));


    }
}
