package com.example.lenovo.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
private EditText UserNameEditText;
private EditText PasswordEditText;
private Button LoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserNameEditText =(EditText) findViewById(R.id.editTextUserName);
        PasswordEditText= (EditText) findViewById(R.id.editTextpassword);
        LoginButton=(Button) findViewById(R.id.button);
       LoginButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(UserNameEditText.getText().toString().equals("admin")||PasswordEditText.getText().toString().equals("admin")){
                   finish();
               }else{
                   Log.d("Login","Wrong username/ password");
               }
           }
       });
        ;
    }
}
