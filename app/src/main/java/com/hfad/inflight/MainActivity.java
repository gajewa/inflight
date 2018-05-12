package com.hfad.inflight;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private Button inFlightButton;

    private Button groundbutton;

    private Button ofertybutton;
    private RequestQueue mRequestQueue;
    private StringRequest stringRequest;
    private String url="";
    //private String TAG=MainActivity.Class.getName();

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
                System.out.println("idz do ground");
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

//    private void sendRequestAndPrintResponse() {
//        mRequestQueue = Volley.newRequestQueue(this);
//        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Log.i(TAG,"RESPONSE: " + response.toString());
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.i(TAG,"ERROR" + error.toString());
//            }
//        });
//
//        mRequestQueue.add(stringRequest);
//    }
}
