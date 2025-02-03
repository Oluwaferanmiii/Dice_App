package com.example.diceapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button referenceToButton = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);

        referenceToButton.setOnClickListener(view -> {

            Random random = new Random();
            int number = random.nextInt(6) + 1;

            switch(number){
                case 1:
                    imageView.setImageResource(R.drawable.dice_1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.dice_2);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.dice_3);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.dice_4);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.dice_5);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.dice_6);
                    break;

            }

        });
    }
}