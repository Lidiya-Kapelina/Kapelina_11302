package t;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    MyList list = new MyList<>();
    @Test
    public  void testAdd() {
        Assert.assertTrue(list.add(7));
    }
    @Test
    public  void testContains() {
        list.add(7);
        Assert.assertTrue(list.contains(7));
    }
    @Test
    public  void testContains1() {
        for(int i=10;i<100;i+=1){
            list.add(i);
        }

        Assert.assertFalse(list.contains(4));
    }
    @Test
    public  void testGet() {
        list.add(7);
        list.add(5);

        Assert.assertEquals(list.get(1),5);
    }
    @Test
    public  void testGet2() {
        list.add(100);
        list.add(52);
        list.add(2);

        Assert.assertEquals(list.get(2),2);
    }
    @Test
    public  void testRemove() {
        list.add(7);
        list.add(5);
        Assert.assertEquals(list.remove((Object) 7),true);
    }
    @Test
    public  void testRemove2() {
        list.add(7);
        list.add(5);
        Assert.assertEquals(list.remove( 1),5);
    }
    @Test
    public  void testContains2() {
        Assert.assertFalse(list.contains(7));
    }
    @Test
    public void testRemove3(){
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(2);
        list.remove(2);
        Assert.assertEquals(list.get( 2),2);
    }
    @Test
    public void testRemove4(){
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(2);
        list.remove(2);
        Assert.assertFalse(list.remove( (Object)9));



    }



}
