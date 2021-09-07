package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EstimationPage extends AppCompatActivity {
    private Button neat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estimate_page);
        neat =findViewById(R.id.dollar);
        neat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EstimationPage.this,PaymentDetails.class);
                startActivity(intent);


            }
        });
    }
}