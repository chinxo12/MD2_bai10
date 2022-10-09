package ra;

public class MyListTest {
    public static void main(String[] args) {
        Mylist <Integer> listInt = new Mylist<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        System.out.println("element 4: "+listInt.get(4));
        System.out.println("element 4: "+listInt.get(1));
        System.out.println("element 4: "+listInt.get(2));
        listInt.add(6);
        System.out.println("element 6: "+listInt.get(6));


    }
}
