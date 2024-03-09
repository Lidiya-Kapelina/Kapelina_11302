package t;
import org.junit.Assert;
import org.junit.Test;
public class Tests {
    List2 list = new List2<>();
    @Test
    public  void test1() {
        System.out.println(list.isEmpty());
        Assert.assertTrue(list.add(7));
        System.out.println(list.contains(7));
    }
    @Test
    public  void test2() {
        Assert.assertTrue(list.add(3));
        Assert.assertTrue(list.add(5));
        System.out.println(list.size());
        list.get(1);
        list.remove(1);

    }

}