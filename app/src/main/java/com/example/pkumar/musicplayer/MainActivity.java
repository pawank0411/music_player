package com.example.pkumar.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feedback = (Button) findViewById(R.id.feedback);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Ae Watan-Razzi", "Arjit Singh", R.raw.aewatan));
        arrayList.add(new Music("Aaya Na Tu", "Arjun Kanungo, Momina Mustehsan", R.raw.ayanatu));
        arrayList.add(new Music("Buzz --","Aastha Gill And Badshah",R.raw.buzz));
        arrayList.add(new Music("Daru Badnaam ","Kamal Kahlon & Param Singh",R.raw.darubadnam));
        arrayList.add(new Music("Nazam Nazam-female ","feat. Sumedha Karmahe",R.raw.nazmsumedhakarmahe));
        arrayList.add(new Music("Humnava Mere","Jubin Nautiyal _ Manoj Muntashir",R.raw.humnavamere));
        arrayList.add(new Music("Sardi Ki Raat","_ Tony Kakkar Sessions",R.raw.sardikiraat));
        arrayList.add(new Music("Tareefan","Veere Di Wedding",R.raw.tareefan));
        arrayList.add(new Music("Jitni Dafa - ","Parmanu",R.raw.jitmidafa));


        adapter = new CustomMusicAdapter(this, R.layout.custommusicitem, arrayList);
        songList.setAdapter(adapter);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://goo.gl/forms/nHgSP3qgwF7LELAI3"));
                startActivity(myWebLink);
            }
        });
    }
}