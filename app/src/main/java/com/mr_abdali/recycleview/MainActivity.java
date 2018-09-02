package com.mr_abdali.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    String [] name = {
            "User 1",
            "User 2",
            "User 3",
            "User 4",
            "User 5",
            "User 6",
            "User 7",
            "User 8",
            "User 9",
            "User 10",
            "User 11",

    };

    String [] desc = {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
            "Description 6",
            "Description 7",
            "Description 8",
            "Description 9",
            "Description 10",
            "Description 11",
    };

    int [] image = {
            R.drawable.pic_1,
            R.drawable.pic_2,
            R.drawable.pic_3,
            R.drawable.pic_4,
            R.drawable.pic_5,
            R.drawable.pic_6,
            R.drawable.pic_7,
            R.drawable.pic_8,
            R.drawable.pic_9,
            R.drawable.pic_10,
            R.drawable.pic_11,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding a toolbar ..
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);

        List<User> sampleusers = new ArrayList<>();

        for (int i=0; i<name.length; i++){
            User user = new User();
            user.username = name[i];
            user.userdesc = desc[i];
            user.userimage= image[i];

            sampleusers.add(user);
        }

        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext(), sampleusers));
    }
}
