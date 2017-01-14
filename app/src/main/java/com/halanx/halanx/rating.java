package com.halanx.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class rating extends AppCompatActivity {
    Button but1,but2,but3;
    public void init() {
        but1 = (Button) findViewById(R.id.btnhome);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but1.animate();
                Intent toy = new Intent(rating.this,MapsActivity.class);
                startActivity(toy);

            }
        });

    }
    public void init2()
    {
        but2 = (Button) findViewById(R.id.btnaccount);
        but2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(rating.this, Account.class);
                startActivity(toy1);
            }});

    }
    public void init3()
    {
        but3=(Button)findViewById(R.id.btnearning);
        but3.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View v) {
                                        Intent toy2=new Intent(rating.this,earning.class);
                                        startActivity(toy2);
                                    }
                                }
        );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        TextView a = (TextView) findViewById(R.id.tvfeedback);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rating.this, popup_feedback.class));
            }

        });
        init();
        init2();
        init3();
    }
}
