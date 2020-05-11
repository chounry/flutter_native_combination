package com.example.conference_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView clickMe = findViewById(R.id.click_me);
        clickMe.setOnClickListener(v -> {
            startActivity(
                    FlutterActivity.createDefaultIntent(MainActivity.this)
            );
        });
    }
}
