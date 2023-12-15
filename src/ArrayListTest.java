public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> bla = new ArrayList<>();
        bla.add(0,5);
        bla.add(1,6);
        bla.add(2,7);
        bla.add(3,8);
        bla.add(4,9);
        System.out.println(bla);
        System.out.println(bla.size());
        bla.add(5,10);
        System.out.println(bla.size());
        bla.set(3,9);
        bla.set(4,10);
        bla.set(5,11);
        System.out.println(bla);
        bla.remove(5);
        System.out.println(bla.size());
        System.out.println(bla);
    }
}
