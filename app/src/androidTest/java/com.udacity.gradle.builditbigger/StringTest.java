package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by maddom73 on 25/10/15.
 */
public class StringTest extends AndroidTestCase {
    private static final String LOG_TAG = "StringTest";


    public void test() {

        Log.v("StringTest", "StringTest running");
        String testResult = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();
        try {
            testResult = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Success: " + testResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(testResult);
    }
}
