package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Debug.waitForDebugger();
        setContentView(R.layout.activity_main);
      /*  View view = findViewById(R.id.button);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("qwe","asd");
            }

       */
        }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void sendMesseage(View view)
    {
        Intent intent = new Intent(this, DisplayMesseageActivity.class);
        String message = "The new activity has been activated";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void showHitler(View view)
    {
        Intent intent = new Intent(this, DisplayHidlerImageActivity.class);
        String message = "The new activity has been started";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
