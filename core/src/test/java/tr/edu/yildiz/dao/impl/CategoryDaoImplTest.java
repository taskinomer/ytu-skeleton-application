package tr.edu.yildiz.dao.impl;

import org.junit.*;

public class CategoryDaoImplTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void test() {
        returnTest();
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

    private void returnTest() {
        System.out.println("method was called");

        if (true) {
            return;
        }

        System.out.println("method has already called");
    }
}