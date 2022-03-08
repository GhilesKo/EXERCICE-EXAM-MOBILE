package com.example.exerciceget;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testGET() throws IOException {

        Service service = RetrofitUtility.get();
        Call<List<Repo>> call = service.listRepos("GhilesKo");
         Response<List<Repo>> response = call.execute();
        List<Repo>resultat  = response.body();
        Log.i("RETROFIT", resultat.toString());


    }
}