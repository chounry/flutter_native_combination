package com.example.conference_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
    private String CHANNEL = "samples.flutter.dev/battery";

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

//    @Override
//    public void configureFlutterEngine(FlutterEngine flutterEngine) {
//        MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(),
//    }
}
