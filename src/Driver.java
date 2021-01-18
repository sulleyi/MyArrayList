public class Driver {

    public static void main(String[] args){

        myArrayList<String> testArrayList = new myArrayList<String>();

        String a = "Hello";
        String b = "This is myArrayList";
        String c = "delete me!";
        String d = "Testing...";

        testArrayList.add(a);
        testArrayList.add(b);
        testArrayList.add(c);
        testArrayList.add(d);



        System.out.println("Element at index 1 of testArrayList:");
        System.out.println(testArrayList.get(1));

        System.out.println();

        System.out.println("Size of testArrayList before we remove an element: ");
        System.out.println(testArrayList.size());

        System.out.println();

        System.out.println("Remove element" + a);
        testArrayList.remove(a);

        System.out.println();

        System.out.println("Now the size of testArrayList is: ");
        System.out.println(testArrayList.size());

        System.out.println();

        System.out.println(testArrayList.contains(c));


    }
}
