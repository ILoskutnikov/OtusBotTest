import org.junit.*;

public class OtusTestClass {

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }

    @Before
    public void setUp(){
        System.out.println("setUp");

    }

    @Test
    public void test1(){
        Assert.assertEquals("It's OK", 0, 0);
    }

    @Test
    public void test2(){
        Assert.assertEquals("It's not OK", 0, 1);

    }

    @Test
    public void test3(){
        Assert.assertNotEquals("It's not OK", 0, 0);
    }

    @After
    public void tierDown(){
        System.out.println("tierDown");

    }

    @AfterClass
    public static void tierDownClass(){
        System.out.println("tierDownClass");

    }
}
