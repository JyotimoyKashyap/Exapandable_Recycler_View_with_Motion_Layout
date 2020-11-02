package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.testapp.adapters.MyAdapter;

public class MainActivity extends AppCompatActivity {
    private TextView content;
    String title[], context[];
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the hooks
        recyclerView = findViewById(R.id.recyclerView);

        //getting resources
        title = getResources().getStringArray(R.array.programming_languages);
        context = getResources().getStringArray(R.array.context);

        //recyclerview class
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, title, context);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}