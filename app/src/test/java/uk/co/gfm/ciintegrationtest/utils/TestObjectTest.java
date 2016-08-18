package uk.co.gfm.ciintegrationtest.utils;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestObjectTest {
    private static final String TEST_STRING = "TEST_STRING";
    private static final int TEST_INT_1 = 100;
    private static final int TEST_INT_2 = 200;
    private static final int TEST_INT_3 = 2;
    private static final int TEST_INT_4 = 3;


    @Test
    public void testMethod() throws Exception {

        TestUtils.TestObject testObject = TestUtils.getTestObject();
        assertNotNull(testObject);

        boolean result;

        result = testObject.testMethod(TEST_STRING, TEST_INT_1, TEST_INT_2);
        assertTrue(result);

        result = testObject.testMethod(TEST_STRING, TEST_INT_3, TEST_INT_4);
        assertFalse(result);

    }

}