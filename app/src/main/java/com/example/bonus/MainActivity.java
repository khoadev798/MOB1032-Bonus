package com.example.bonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText num = null;
    private Button btnGo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();
        SetOnClickLister();
    }
    private void mapComp(){
        if (num==null)
            num = findViewById(R.id.num);
        if(btnGo==null)
            btnGo = findViewById(R.id.btnGo);
    }
    private void SetOnClickLister(){
        if (num==null)
            mapComp();
        if(btnGo==null)
            mapComp();

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sales = Double.parseDouble(num.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("num", sales);
                intent.putExtra("go",bundle);
                startActivity(intent);
            }
        });
    }
}
