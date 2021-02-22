package com.login.hmt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText log,pass;
    CardView btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = findViewById(R.id.log);
        pass = findViewById(R.id.pass);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(log.getText().toString().equals("salah") && pass.getText().toString().equals("123456"))
                {
                    AlertDialog.Builder bdr = new AlertDialog.Builder(MainActivity.this);
                    bdr.setIcon(R.drawable.ck);
                    bdr.setTitle("Login Successfully ");
                    bdr.setMessage("WELCOME !!!");
                    bdr.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog ad = bdr.create();
                    ad.show();
                }else {

                    Toast.makeText(getApplicationContext(), "Incorrect User or Password",Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}