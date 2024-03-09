import org.junit.Test;

public class Testing {
    MyMap map = new MyMap<>();

    @Test
    public void test1() {
        System.out.println(map.isEmpty());
    }

    @Test
    public void test2() {
        map.put(5, 3);
        map.put(5, 6);
        System.out.println(map.size());
        System.out.println(map.get(5));
    }

    public void test3() {
        map.put(4, 3);
        map.put(5, 2);
        System.out.println(map.remove(5));
        System.out.println(map.get(5));
    }

    public void test4() {
        map.put(4, 3);
        map.put(5, 2);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(2));
    }
}
