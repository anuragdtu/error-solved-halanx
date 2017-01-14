package com.halanx.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class earning extends AppCompatActivity {
    Button but1,but2,but3;
    public void init() {
        but1 = (Button) findViewById(R.id.btnrating);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but1.animate();
                Intent toy = new Intent(earning.this, rating.class);
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
                Intent toy1 = new Intent(earning.this, Account.class);
                startActivity(toy1);
            }});

    }
    public void init3()
    {
        but3=(Button)findViewById(R.id.btnhome);
        but3.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View v) {
                                        Intent toy2=new Intent(earning.this,MapsActivity.class);
                                        startActivity(toy2);
                                    }
                                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earning);
        init();
        init2();
        init3();
    }
}
