package uk.co.gfm.ciintegrationtest.utils;


import android.util.Log;

public class TestUtils {

    public static class TestObject {
        private static final String TAG = TestObject.class.getName();

        public boolean testMethod(String testParameter1, int testParameter2, int testParameter3) {
            Log.d(TAG, "testMethod testParameter1=" + testParameter1 + " testParameter2=" + testParameter2 + " testParameter3=" + testParameter3);
            return testParameter2 + testParameter3 > 10;
        }
    }

    public static TestObject getTestObject() {
        return new TestObject();
    }

}
