package com.example.huo220.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button button = (Button)findViewById(R.)
    }

    public void sendMessage(View view) {
        Intent i = new Intent(this,DisplayMessageActivity.class);
       // EditText e = (EditText)findViewById(R.id.Login);
        //String message = e.getText().toString();
        i.putExtra(EXTRA_MESSAGE,"Successful Login");
        startActivity(i);
    }
}
