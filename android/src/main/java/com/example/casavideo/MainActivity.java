package com.example.casavideo;

import android.content.Intent;

import androidx.annotation.NonNull;

import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;


public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "com.example.casavideo/channels";

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            Log.i("activity: ", call.method);
                            if(call.method.equals("secondActivity")) {
                                goToSecondActivity();
                            }
                        }
                );
    }

    private void  goToSecondActivity() {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }
}
