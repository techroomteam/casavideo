package com.example.casavideo;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.casavideo.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private  ActivitySecondBinding binding;
    private  int num = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        increment();
    }

    private void increment() {
        binding.incrementButton.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            num =num + 1;
            binding.numText.setText(String.valueOf(num));
        }
    };
}
