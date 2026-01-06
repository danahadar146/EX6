package com.example.ex6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    Button btn;
    private TextView txt;
    boolean flag = true;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        txt.setText("");
        txt.setTextSize(50);
        txt.setTextColor(Color.RED);
    }


    public void clicked(View view) {
        btn.setText("Click me !");
        i=i+1;
        txt.setText("this is a click number: "+i);
    }
}

