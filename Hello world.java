package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TextView that displays "Hello, World!"
        TextView textView = new TextView(this);
        textView.setText("Hello, World!");
        textView.setTextSize(24);

        // Set the TextView as the activity layout
        setContentView(textView);
    }
    }
____________________
 /                    \
|    ______________    |
|   |              |   |
|   | Hello World! |   |
|   |______________|   |
|                    O |
|______________________|
   \________________/  
       |        |
       |________|
         |_||_|
