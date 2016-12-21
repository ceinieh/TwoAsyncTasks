package com.example.android.multiasynctasks;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Chaker on 12/21/2016.
 */

public class FirstAsyncTask extends AsyncTask<Void, Void, Void>
{
    private static final String TAG = "First AsyncTaskTAG_";

    @Override
    protected void onPreExecute()
    {
        Log.d(TAG, "onPreExecute: " + "FirstOnPreExecute()");
    }
    @Override
    protected Void doInBackground(Void... params)
    {
        for(int index = 0; index < 50; index++)
        {

            Log.d(TAG, "doInBackground: " + "FirstAsyncTask");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException exception)
            {
                exception.printStackTrace();
            }
        }
        return null;
    }
    @Override
    protected void onPostExecute(Void result)
    {
        Log.d("AsyncTask" ,"FirstonPostExecute()");
    }
}
