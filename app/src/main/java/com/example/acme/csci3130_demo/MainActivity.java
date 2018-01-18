package com.example.acme.csci3130_demo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //my code
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(message);
            }
        });
    }
}
