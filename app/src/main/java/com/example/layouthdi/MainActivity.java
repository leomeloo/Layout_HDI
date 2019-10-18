package com.example.layouthdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView biometric_header, biometric_header2;
    TextView novidadeFaceID, descricaoNovidadeFaceID, autorizaoFaceID;
    Button yesButton, noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        biometric_header = findViewById(R.id.biometric_header);
        biometric_header2 = findViewById(R.id.biometric_header2);

        novidadeFaceID = findViewById(R.id.novidadeFaceID);
        descricaoNovidadeFaceID = findViewById(R.id.descricaoNovidadeFaceID);
        autorizaoFaceID = findViewById(R.id.autorizaoFaceID);

        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);
        
        biometric_header.setImageResource(R.drawable.biometric_header);

    }
}
