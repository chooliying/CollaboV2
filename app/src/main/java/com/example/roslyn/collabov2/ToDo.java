package com.example.roslyn.collabov2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }

    public void switchScreenFunction(View view) {
        Intent intent = new Intent(this, Teammate1ToDo.class);
        startActivity(intent);
    }
}

