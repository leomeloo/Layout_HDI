package com.example.layouthdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                //passar o resultado da intent para o callback (onActivityResult
                startActivityForResult(intent, 0);
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Login por imagem desabilitado !", Toast.LENGTH_LONG).show();
            }
        });



    }

    //Receber a Intent do yesButton
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        //pegar a imagem tirada na intent e jogar na variavel extras
       Bundle extras = data.getExtras();
       Bitmap imageBitmap = (Bitmap) extras.get("data");

        //substituir o biometric_header pela imagem tirada na intent.
        biometric_header.setImageBitmap(imageBitmap);
    }

}
