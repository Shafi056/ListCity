package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        TextView tv = findViewById(R.id.textview_1);
        tv.setText(intent.getStringExtra("value"));
        Button b = findViewById(R.id.button_back);
        //set listener on button
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(ShowActivity.this, MainActivity.class);
                startActivity(send);
            }
        });
    }
}