package com.example.admin.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user, pass;
    private Button b;
    private String email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((user.getText().toString().equals(""))||(pass.getText().toString().equals(""))){
                    Toast.makeText(MainActivity.this,"Incorrect Username/Password. Please enter again!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}