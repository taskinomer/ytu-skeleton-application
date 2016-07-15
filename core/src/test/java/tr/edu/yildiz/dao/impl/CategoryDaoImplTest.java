package tr.edu.yildiz.dao.impl;

import org.junit.*;

public class CategoryDaoImplTest {

    @Before
    public static void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void test() {
        System.out.println("test");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("test2");
        Assert.assertTrue(true);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }
}