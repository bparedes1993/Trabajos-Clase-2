package com.example.autonoma.tarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    EditText etUsuario, etClave;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etClave = findViewById(R.id.etClave);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void login(View view) {
                if(etUsuario.getText().toString().equals("admin") && etClave.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();

                }
                else{Toast.makeText(getApplicationContext(),
                        "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }});
    }}



