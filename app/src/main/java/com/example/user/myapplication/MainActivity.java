package com.example.user.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioGroup Rg1;
RadioButton rb1;
RadioButton rb2;
RadioButton rb3;
Button btn1;
Button btn2;
LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rg1=(RadioGroup) findViewById(R.id.Rg);
        rb1=(RadioButton)findViewById(R.id.rd1);
        rb2=(RadioButton)findViewById(R.id.rd2);
        rb3=(RadioButton)findViewById(R.id.rd3);
        btn1=(Button)findViewById(R.id.btn);
           btn2=(Button)findViewById(R.id.btnn2);
         l1=(LinearLayout)findViewById(R.id.lini);
    }

    public void OnClick1(View view) {
              if(rb1.isChecked())l1.setBackgroundColor(Color.BLUE);
                 if (rb2.isChecked())l1.setBackgroundColor(Color.GREEN);
                    if(rb3.isChecked())l1.setBackgroundColor(Color.YELLOW);

    }

    public void Onclick2(View view) {
        l1.setBackgroundColor(Color.WHITE);
    }
}
