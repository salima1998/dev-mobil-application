package com.example.cm.quizapp_m4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    //declaration
    EditText etLogin,etPassword;
    Button bLogin;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recuperation
        etLogin= (EditText)findViewById(R.id.etLogin);
        etPassword=(EditText)findViewById(R.id.etPassword);
        bLogin=(Button)findViewById(R.id.blogin);
        tvRegister=(TextView)findViewById(R.id.tvRegister);
        //Association de listeners
        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(etLogin.getText().toString().equals("toto") && etPassword.getText().toString().equals("toto")){
                    startActivity(new Intent(MainActivity.this,Quiz1.class));
                }else {
                    Toast.makeText(getApplicationContext(),"Login or password incorrect", Toast.LENGTH_SHORT).show();
                }
            }

        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });
    }
}
