package com.example.android.multiasynctasks;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        runMultipleAsyncTask(); // Start Async Task
    }
    private void runMultipleAsyncTask() // Run Multiple Async Task
    {
        FirstAsyncTask asyncTask = new FirstAsyncTask(); // First
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

        SecondAsyncTask asyncTask2 = new SecondAsyncTask(); // Second
        asyncTask2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

    }
}

