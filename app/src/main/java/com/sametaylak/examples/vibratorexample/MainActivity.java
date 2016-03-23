package com.sametaylak.examples.vibratorexample;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Vibrator vibrator;
    private Button btnVibrate;
    private EditText edtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            Componentlerimizi tanımladık ve sistem servislerinden Vibrator (Titreşim) servisini çağırdık
         */

        btnVibrate = (Button)findViewById(R.id.btnVibrate);
        edtTime = (EditText)findViewById(R.id.edtTime);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        /*
            Butonun tıklanma eventini oluşturduk
            Butona her tıklamada 1 saniye boyunca titreşim özelliği aktifleşecek
         */

        btnVibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtTime.getText().toString().trim().isEmpty())
                    vibrator.vibrate(Long.parseLong(edtTime.getText().toString()));
            }
        });
    }
}
