package com.example.listen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    int num1,num2;
    TextView x1,x2,win;
    Button back;
    Intent gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        gi = getIntent();
        num1 = gi.getIntExtra("n",1);
        num2 = gi.getIntExtra("nn",1);


        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        win = findViewById(R.id.win);
        back = findViewById(R.id.back);



        x1.setText("Player 1 result is " + num1);
        x2.setText("Player 2 result is " + num2);

        if (num1>num2)
        {
            win.setText("The winner is Player 1!!!!!!" );
        }
        else
        {
            win.setText("The winner is Player 2!!!!!!" );
        }

    }

    public void goback(View view) {
        num1 = num2 = 0;
        gi.putExtra("g",num1);
        gi.putExtra("gg",num2);
        setResult(RESULT_OK,gi);
        finish();
    }
}