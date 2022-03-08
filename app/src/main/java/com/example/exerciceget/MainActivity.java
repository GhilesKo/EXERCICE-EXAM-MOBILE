package com.example.exerciceget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Repo> maListe;

    Repo premierRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.teext);

        Service service = RetrofitUtility.get();

        service.listRepos("GhilesKo").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {

                if (response.isSuccessful())
                { Log.i("REPONSE",response.body().toString());

                    maListe = response.body();
                    premierRepo = maListe.get(0);
                    String valeur = premierRepo.name;
                    tv.setText(premierRepo.name);
                }





            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }
        });









    }
}