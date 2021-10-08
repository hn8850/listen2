package com.example.listen2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    int count1 = 0, count2 = 0;
    Button blue, red, resultt;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue = findViewById(R.id.blue);
        red = findViewById(R.id.red);
        resultt = findViewById(R.id.back);


        red.setOnLongClickListener(this);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
            }
        });

    }

    public void go(View view) {
        si = new Intent(this, result.class);
        si.putExtra("n", count1);
        si.putExtra("nn", count2);
        startActivityForResult(si, 100);
    }


    @Override
    public boolean onLongClick(View v) {
        count2 = count2 + 2;
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            count1 = data.getIntExtra("g", 1);
            count2 = data.getIntExtra("gg", 1);
        }
    }

}