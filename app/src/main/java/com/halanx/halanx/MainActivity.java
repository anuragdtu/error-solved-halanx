package com.halanx.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but1,but2;
    public void init()
    {
        but1 = (Button) findViewById(R.id.btnsignin);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, signin.class);
                startActivity(toy);

            }
        });
    }
    public void init2()
    {
        but2= (Button)findViewById(R.id.btnregister);
        but2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toy2=new Intent(MainActivity.this,register.class);
                startActivity(toy2);

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();
    }
}
