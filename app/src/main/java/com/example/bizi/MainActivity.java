package com.example.bizi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

  LottieAnimationView clock;
  LottieAnimationView message;
  LottieAnimationView burger;
  LottieAnimationView pumpkin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      clock = findViewById(R.id.clock);
      message = findViewById(R.id.message);
      burger = findViewById(R.id.burger);
      pumpkin = findViewById(R.id.pumpkin);

      clock.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i = new Intent(getApplicationContext(), Time.class);
              startActivity(i);
          }
      });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MessageActivity.class);
                startActivity(i);
            }
        });

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Food.class);
                startActivity(i);
            }
        });

        pumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Scary.class);
                startActivity(i);
            }
        });




    }
}