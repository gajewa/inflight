package com.hfad.inflight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button inFlightButton;
    private Button groundbutton;
    private Button ofertybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inFlightButton = (Button) findViewById(R.id.inflightButton);
        inFlightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("idz do inflight");
            }
        });
        groundbutton = (Button) findViewById(R.id.groundButton);
        groundbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(k);
            }
        });
        ofertybutton = (Button) findViewById(R.id.ofertyButton);
        ofertybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("idz do ofert");
            }
        });
    }
}
