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
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    Button btn;
    private TextView txt;
    boolean flag = true;
    int i=1;
    int counter=0;
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
        txt.setTypeface(null,Typeface.BOLD_ITALIC);
        txt.setShadowLayer(10, 10, 10, Color.GRAY);

    }


    public void clicked(View view) {
        if (counter <6) {
        txt.setText("this is click number: " + i);
        i = i + 1;
        counter = counter + 1;
    }
        else{
        txt.setText("BOOM!");
        counter=0;
        i=i+1;
            }
        }
    }


