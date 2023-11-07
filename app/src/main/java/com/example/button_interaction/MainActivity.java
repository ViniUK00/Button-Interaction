package com.example.button_interaction;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button topLeftButton = findViewById(R.id.topLeftButton);
        Button topRightButton = findViewById(R.id.topRightButton);
        Button bottomLeftButton = findViewById(R.id.bottomLeftButton);
        Button bottomRightButton = findViewById(R.id.bottomRightButton);
        Button centerButton = findViewById(R.id.centerButton);

        // Set click listeners for the buttons
        topLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Top Left Button Clicked");
            }
        });

        topRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Top Right Button Clicked");
            }
        });

        bottomLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Bottom Left Button Clicked");
            }
        });

        bottomRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Bottom Right Button Clicked");
            }
        });

        centerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Center Button Clicked");
            }
        });
    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);

        // Customize the toast message's position to appear at the center
        toast.setGravity(Gravity.CENTER, 0, 0);

        toast.show();
    }

}
