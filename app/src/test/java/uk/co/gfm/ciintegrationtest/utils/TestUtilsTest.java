package uk.co.gfm.ciintegrationtest.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestUtilsTest {
    @Test
    public void getTestObject() throws Exception {
        TestUtils.TestObject testObject = TestUtils.getTestObject();
        assertNotNull(testObject);
    }

}