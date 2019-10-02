package com.example.bonus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Bundle bundle = getIntent().getBundleExtra("go");
        double sales = bundle.getDouble("num");
        Toast.makeText(SubActivity.this,"Bạn nhận được bonus là: " + sales*0.05, Toast.LENGTH_LONG).show();
    }
}
